package technogise.demo.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="shipping",url = "http://localhost:8082/")
public interface ShippingClient {

    @GetMapping(path = "/checkShipping")
    boolean isItemShippable();
}
