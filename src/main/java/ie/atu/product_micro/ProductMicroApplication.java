package ie.atu.product_micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProductMicroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMicroApplication.class, args);
    }

}
