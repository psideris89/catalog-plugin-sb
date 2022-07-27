package com.example.catalogpluginsb.service;

import com.example.catalogpluginsb.model.CatalogDAO;
import com.example.catalogpluginsb.repository.CatalogRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CatalogService {

    private final CatalogRepository catalogRepository;

    public CatalogService(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public Optional<CatalogDAO> getCatalogById(String id) {
        return catalogRepository.findCatalogById(id);
    }

    public CatalogDAO saveCatalog(CatalogDAO catalog) {
        return catalogRepository.save(catalog);
    }
}
