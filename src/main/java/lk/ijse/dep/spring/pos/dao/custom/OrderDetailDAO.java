package lk.ijse.dep.spring.pos.dao.custom;


import lk.ijse.dep.spring.pos.dao.CrudDAO;
import lk.ijse.dep.spring.pos.entity.OrderDetail;
import lk.ijse.dep.spring.pos.entity.OrderDetailPK;

public interface OrderDetailDAO extends CrudDAO<OrderDetail, OrderDetailPK> {

    boolean existsByItemCode(String itemCode);

}
