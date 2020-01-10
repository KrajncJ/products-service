package resources;

import si.krajnc.products.services.ProductService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

@Path("products")
public class RestResource {

    @Inject
    private ProductService productService;

    @GET
    public Response getProducts() {
        return Response.ok(productService.getAllProducts()).build();
    }

    @GET
    @Path("/{id}")
    public Response getProductById(@PathParam("id") String id) {
        return Response.ok(productService.getProductById(id)).build();
    }
}
