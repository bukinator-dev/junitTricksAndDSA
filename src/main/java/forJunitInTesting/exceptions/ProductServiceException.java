package forJunitInTesting.exceptions;

import forJunitInTesting.service.ProductService;

public class ProductServiceException extends RuntimeException{
    public ProductServiceException(String message) {
        super(message);
    }
}
