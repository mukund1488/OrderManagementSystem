package technogise.demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import technogise.demo.order.client.InventoryClient;

@RestController
public class OrderController {

    @Autowired
    InventoryClient inventoryClient;

    @GetMapping("/check")
    public boolean checkSetup()
    {
        return inventoryClient.isInventoryAvailable();
    }
}
