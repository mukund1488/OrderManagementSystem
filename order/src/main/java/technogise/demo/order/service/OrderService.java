package technogise.demo.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technogise.demo.order.client.InventoryClient;
import technogise.demo.order.client.ShippingClient;

@Service
public class OrderService {
    @Autowired
    private InventoryClient inventoryClient;
    @Autowired
    private ShippingClient shippingClient;

    public boolean createOrder() {
        if (!inventoryClient.isInventoryAvailable() || !shippingClient.isItemShippable()) {
            return false;
        }
        //Persist to db
        //Call Notification service
        return true;
    }
}
