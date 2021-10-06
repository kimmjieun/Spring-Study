package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository; //final을 쓰면 생성자 기본으로 할당되어야함
    private final DiscountPolicy discountPolicy; // 인터페이스에만 의존함

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
    // 생성자를 통해 위의 선언한 곳에 값이 할당 됨

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice){
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
