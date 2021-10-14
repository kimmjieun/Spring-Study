package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor // 롬복 애노테이션 -> final 붙은 객체에 대해 생성자를 만들어줘
public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository; //final을 쓰면 생성자 기본으로 할당되어야함
    private final DiscountPolicy discountPolicy; // 인터페이스에만 의존함

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice){
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
