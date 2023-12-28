package ie.atu.product_micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private RepositoryService repositoryService;

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        String response = repositoryService.addProduct(product);
        return response;
    }
}
