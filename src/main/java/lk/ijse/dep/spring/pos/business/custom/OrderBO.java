package lk.ijse.dep.spring.pos.business.custom;

import lk.ijse.dep.spring.pos.business.SuperBO;
import lk.ijse.dep.spring.pos.dto.OrderDTO;
import lk.ijse.dep.spring.pos.dto.OrderDTO2;

import java.util.List;

public interface OrderBO extends SuperBO {

    int getLastOrderId();

    boolean placeOrder(OrderDTO orderDTO);

    List<OrderDTO2> getOrderInfo(String query);

}
