package si.krajnc.products.services.impl;

import si.krajnc.products.services.ProductService;
import si.krajnc.products.api.v1.lib.Product;
import si.krajnc.products.services.mock.MockUtil;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProductById(String id) {
        return MockUtil.getMockedProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        return MockUtil.getMockedProducts();
    }
}
