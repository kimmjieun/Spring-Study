package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

public class OrderServiceImplTest {
    @Test
    void createOrder() {

        OrderServiceImpl orderService =  new OrderServiceImpl(); // impl 잘 만들었는지
        orderService.createOrder(1L, "itemA", 10000);
    }

}
