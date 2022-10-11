package sa.project2.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.project2.orderService.dto.OrderRequest;
import sa.project2.orderService.model.OrderModel;
import sa.project2.orderService.repository.OrderRepository;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;
    @PostMapping
    public OrderModel CreateAccount(@RequestBody OrderRequest request) {
//        if(request.getOrderModel().getPayment().equals("Visa")){
//            //call another endpoint?
//        }
//        if(request.getOrderModel().getPayment().equals("American")) {
//            //call another endpoint?
//        }
        return orderRepository.save(request.getOrderModel());
    }
}
