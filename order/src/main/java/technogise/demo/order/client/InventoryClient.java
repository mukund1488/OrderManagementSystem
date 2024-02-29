package technogise.demo.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="inventory",url = "http://localhost:8082/")
public interface InventoryClient {

    @GetMapping(path = "/checkInventory")
    boolean isInventoryAvailable();
}
