package OneStopShop.service;
import OneStopShop.dao.Dao;
import OneStopShop.model.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceClass {

    @Autowired
    private Dao productRepository;

    // Method to fetch products by query
    public List<products> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }

    // Optional: Fetch all products if needed
    public List<products> getAllProducts() {
        return productRepository.findAll();
    }
}