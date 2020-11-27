package lk.ijse.dep.spring.pos.Controller;

import lk.ijse.dep.spring.pos.business.custom.OrderBO;
import lk.ijse.dep.spring.pos.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/api/v1/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderBO orderBO;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Integer saveOrder(@RequestBody OrderDTO orderDTO) {
        orderBO.placeOrder(orderDTO);
        return orderDTO.getId();
    }
}
