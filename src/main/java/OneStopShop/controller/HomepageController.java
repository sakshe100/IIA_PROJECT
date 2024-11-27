package OneStopShop.controller;

import OneStopShop.model.products;
import OneStopShop.service.ServiceClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class HomepageController {

    private static final Logger logger = LoggerFactory.getLogger(HomepageController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate; // Use JdbcTemplate for raw SQL execution

    @GetMapping("/home")
    public String showHomepage() {
        return "homepage"; // This matches the "homepage.jsp" page
    }

    @PostMapping("/result")
    public String executeQuery(@RequestParam("sqlQuery") String sqlQuery, Model model) {
        try {
            // Execute the SQL query and retrieve the results
            List<Map<String, Object>> queryResults = jdbcTemplate.queryForList(sqlQuery);

            // Extract headers (column names) dynamically
            List<String> headers = new ArrayList<>();
            if (!queryResults.isEmpty()) {
                headers.addAll(queryResults.get(0).keySet());
            }

            // Prepare rows for the result page
            List<List<Object>> rows = new ArrayList<>();
            for (Map<String, Object> row : queryResults) {
                rows.add(new ArrayList<>(row.values()));
            }

            // Add data to the model
            model.addAttribute("headers", headers);
            model.addAttribute("rows", rows);
            model.addAttribute("error", null); // No error
        } catch (Exception e) {
            logger.error("Error executing query: {}", e.getMessage());
            model.addAttribute("error", "Invalid SQL Query or Execution Error.");
            model.addAttribute("headers", null);
            model.addAttribute("rows", null);
        }

        return "result"; // This matches the "result.jsp" page
    }
}




