package OneStopShop.model;
import jakarta.persistence.*;

    @Entity
    @Table(name = "products") // Explicitly maps this entity to the "products" table
    public class products {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id; // Auto-generated primary key

        @Column(name = "product_name") // Maps to "product_name" column in the database
        private String productName;

        @Column(name = "discounted_price") // Maps to "discounted_price" column
        private Integer discountedPrice;

        @Column(name = "actual_price") // Maps to "actual_price" column
        private Integer actualPrice;

        private Float rating;

        private String description;

        private String reviews;

        @Column(name = "product_link") // Maps to "product_link" column
        private String productLink;

        private String source;

        // Getters and Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Integer getDiscountedPrice() {
            return discountedPrice;
        }

        public void setDiscountedPrice(Integer discountedPrice) {
            this.discountedPrice = discountedPrice;
        }

        public Integer getActualPrice() {
            return actualPrice;
        }

        public void setActualPrice(Integer actualPrice) {
            this.actualPrice = actualPrice;
        }

        public Float getRating() {
            return rating;
        }

        public void setRating(Float rating) {
            this.rating = rating;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getReviews() {
            return reviews;
        }

        public void setReviews(String reviews) {
            this.reviews = reviews;
        }

        public String getProductLink() {
            return productLink;
        }

        public void setProductLink(String productLink) {
            this.productLink = productLink;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }
    }


