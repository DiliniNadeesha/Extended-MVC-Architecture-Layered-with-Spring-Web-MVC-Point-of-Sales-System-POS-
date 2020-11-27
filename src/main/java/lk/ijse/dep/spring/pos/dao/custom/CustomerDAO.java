package lk.ijse.dep.spring.pos.dao.custom;


import lk.ijse.dep.spring.pos.dao.CrudDAO;
import lk.ijse.dep.spring.pos.entity.Customer;

public interface CustomerDAO extends CrudDAO<Customer, String> {

    String getLastCustomerId();

}
