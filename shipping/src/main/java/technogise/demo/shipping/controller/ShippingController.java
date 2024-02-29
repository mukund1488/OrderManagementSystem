package technogise.demo.shipping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping("/ship")
    public boolean checkShipping()
    {
        return true;
    }
}
