package OneStopShop.dao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import OneStopShop.model.products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;


    @Repository
    public interface Dao extends JpaRepository<products, Long> {

        // Use Derived Query Methods
        List<products> findByProductNameContainingIgnoreCase(String query);

        // Custom JPQL Query
        @Query("SELECT p FROM products p WHERE " +
                "LOWER(p.productName) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
                "LOWER(p.description) LIKE LOWER(CONCAT('%', :query, '%')) OR " +
                "LOWER(p.reviews) LIKE LOWER(CONCAT('%', :query, '%'))")
        List<products> searchProducts(String query);

    }
