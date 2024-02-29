package technogise.demo.inventory.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/checkInventory")
    public boolean isInventoryPresent() {
        return true;
    }
}
