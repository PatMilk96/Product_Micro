package ie.atu.product_micro;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Repository-Service", url = "http://localhost:8081")
public interface RepositoryService {
    @PostMapping("/add")
    String addProduct(@RequestBody Product product);
}
