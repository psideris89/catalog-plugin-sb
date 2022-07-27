package com.example.catalogpluginsb.controller;

import com.example.catalogpluginsb.dto.CatalogDTO;
import com.example.catalogpluginsb.model.CatalogDAO;
import com.example.catalogpluginsb.service.CatalogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CatalogController {

    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/catalog/{id}")
    public ResponseEntity<?> getCatalogById(@PathVariable String id) {
        Optional<CatalogDAO> catalogById = catalogService.getCatalogById(id);
        if (catalogById.isPresent()) {
            // instead of returning the model or DAO you need to return the DTO
            CatalogDAO catalog = catalogById.get();
            CatalogDTO dto = new CatalogDTO(catalog.getId(), catalog.getProduct(), catalog.getPayment());
            return ResponseEntity.ok(dto);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/catalog")
    @ResponseStatus(HttpStatus.CREATED)
    // TODO Use DTO to send data to the endpoint and DAO to persist data to store
    public CatalogDAO createCatalog(@RequestBody CatalogDAO catalog) {
        return catalogService.saveCatalog(catalog);
    }
}
