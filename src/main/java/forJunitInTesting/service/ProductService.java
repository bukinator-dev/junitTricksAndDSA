package forJunitInTesting.service;

import forJunitInTesting.exceptions.ProductServiceException;

public class ProductService {
    private String title;
    public ProductService(String title) {
        this.title = title;
    }
    public String getProductTitle() {
        if(title.isEmpty()){
            throw new ProductServiceException("Product title is missing");
        }
        return title;
    }
}
