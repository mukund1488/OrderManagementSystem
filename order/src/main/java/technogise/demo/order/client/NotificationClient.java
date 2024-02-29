package technogise.demo.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="notification",url = "http://localhost:8082/")
public interface NotificationClient {

    @PostMapping(path = "/postNotification")
    ResponseEntity postNotification();
}
