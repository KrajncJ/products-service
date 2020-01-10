package si.krajnc.products.services;

import si.krajnc.products.api.v1.lib.Product;
import java.util.List;

public interface ProductService {

    Product getProductById(String id);

    List<Product> getAllProducts();
}
