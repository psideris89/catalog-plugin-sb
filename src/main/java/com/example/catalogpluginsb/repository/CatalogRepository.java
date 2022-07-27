package com.example.catalogpluginsb.repository;

import com.example.catalogpluginsb.model.CatalogDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CatalogRepository {

    private List<CatalogDAO> store;

    public CatalogRepository(List<CatalogDAO> store) {
        this.store = store;
    }

    public Optional<CatalogDAO> findCatalogById(String id) {
        return store
                .stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();
    }

    public CatalogDAO save(CatalogDAO catalog) {
        // Catalog savedItem = db.persist(catalog)

        String lastId = store.get(store.size() -1).getId();
        String newId = String.valueOf(Integer.parseInt(lastId) + 1);

        CatalogDAO savedData = new CatalogDAO(newId, catalog.getProduct(), catalog.getPayment(), "v1");
        store.add(savedData);
        return savedData;
    }
}
