package orders.db;

import orders.Order;
import org.springframework.data.neo4j.repository.GraphRepository;

import java.util.List;

/**
 * Created by james on 17-3-19.
 */
public interface OrderRepository extends GraphRepository<Order> {
    List<Order> findByCustomer(String customer);
    List<Order> findByCustomerLike(String customer);
    List<Order> findByCustomerAndType(String customer,String type);
    List<Order> getByType(String type);
}
