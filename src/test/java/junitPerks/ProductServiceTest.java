package junitPerks;

import forJunitInTesting.exceptions.ProductServiceException;
import forJunitInTesting.service.ProductService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Order(2)
public class ProductServiceTest {
    @BeforeAll
    static void setup() {
        System.out.println("Test methods related to User products");
    }

    @Test
    void testCreateProduct_whenProductTitleIsMissing_throwsProductServiceException() {
        //Arrange
        ProductService productService = new ProductService("");
        //Act
        assertThrows(ProductServiceException.class,() -> {
           productService.getProductTitle();
        });

        ProductServiceException exceptionMessage = assertThrows(ProductServiceException.class,() -> {
            productService.getProductTitle();
        });

        assertEquals(exceptionMessage.toString(),"forJunitInTesting.exceptions.ProductServiceException: Product title is missing");
    }

    @Test
    void testCreateProduct_whenProvidedWithValidTitle_returnsTitle() {
        //Arrange
        ProductService productService = new ProductService("Laptop");
        //Act
        String productTitle = productService.getProductTitle();
        //Assert
        assertNotNull(productTitle);
        assertEquals("Laptop",productTitle);
    }
}
