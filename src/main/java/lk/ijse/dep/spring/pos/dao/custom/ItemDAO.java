package lk.ijse.dep.spring.pos.dao.custom;


import lk.ijse.dep.spring.pos.dao.CrudDAO;
import lk.ijse.dep.spring.pos.entity.Item;

public interface ItemDAO extends CrudDAO<Item, String> {

    String getLastItemCode();
}
