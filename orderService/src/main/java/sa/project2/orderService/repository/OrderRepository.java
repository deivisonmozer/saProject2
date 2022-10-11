package sa.project2.orderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sa.project2.orderService.model.OrderModel;

public interface OrderRepository extends JpaRepository<OrderModel,Integer> {
}
