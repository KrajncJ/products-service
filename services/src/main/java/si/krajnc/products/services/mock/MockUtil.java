package si.krajnc.products.services.mock;

import si.krajnc.products.api.v1.lib.Product;

import java.util.Arrays;
import java.util.List;

public class MockUtil {

    public static List<Product> getMockedProducts() {
        return Arrays.asList(getMockedProduct(), getMockedProduct_two());
    }

    public static Product getMockedProduct() {
        return mockProduct("Headphones X32", "Best Headphones on market", 324.4d);
    }

    public static Product getMockedProduct_two() {
        return mockProduct("Keayboard ZZ", "Best keyboard for your desk", 34.2d);
    }

    private static Product mockProduct(String name, String description, Double price) {
        Product p = new Product();
        p.setActive(true);
        p.setName(name);
        p.setDescription(description);
        p.setPrice(price);
        return p;
    }

}
