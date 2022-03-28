package pl.kciesla.productcatalog;

import org.junit.jupiter.api.Test;
import pl.kciesla.productcatalog.ProductCatalog;
import pl.kciesla.productcatalog.ProductData;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductCatalogTest {
@Test
    void itAllowToListProducts(){
        ProductCatalog catalog = thereIsProductCatalog();
        List<ProductData> products = catalog.availableProducts();
        assertEquals(expected: 0, products.size());
    }

    void itAllowsToAddProductDraft(){
        ProductCatalog catalog = thereIsProductCatalog();
        String productId = catalog.addProduct('lego', 'lego-botanics', 'lego-mini');
    }

    private ProductCatalog thereIsProductCatalog() {
        return new ProductCatalog();
    }
}