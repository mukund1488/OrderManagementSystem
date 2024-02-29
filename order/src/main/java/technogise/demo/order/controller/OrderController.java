package technogise.demo.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import technogise.demo.order.client.InventoryClient;
import technogise.demo.order.service.OrderService;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/check")
    public ResponseEntity checkSetup() {
        boolean orderCreated = orderService.createOrder();
        HttpStatus status = orderCreated ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR;
        return ResponseEntity.status(status).build();
    }
}
