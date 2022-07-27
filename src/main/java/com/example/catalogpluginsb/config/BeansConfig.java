package com.example.catalogpluginsb.config;

import com.example.catalogpluginsb.model.CatalogDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfig {

    @Bean
    public List<CatalogDAO> store() {
        CatalogDAO c1 = new CatalogDAO("1", "pr-1", "pay-1", "v1");
        CatalogDAO c2 = new CatalogDAO("2", "pr-2", "pay-2", "v1");
        CatalogDAO c3 = new CatalogDAO("3", "pr-3", "pay-3", "v1");
        return new ArrayList<>(Arrays.asList(c1, c2, c3));
    }
}
