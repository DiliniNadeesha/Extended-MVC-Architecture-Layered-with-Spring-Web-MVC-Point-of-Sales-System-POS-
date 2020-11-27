package lk.ijse.dep.spring.pos.dao.custom;



import lk.ijse.dep.spring.pos.dao.CrudDAO;
import lk.ijse.dep.spring.pos.entity.Order;

import java.util.List;

public interface OrderDAO extends CrudDAO<Order, Integer> {

    int getLastOrderId();

    boolean existsByCustomerId(String customerId);



}
