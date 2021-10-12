package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 20;

    @Override
    public int discount(Member member, int price){ //cmd+shift+t 하면 테스트 클래스 만들어줌
        if(member.getGrade()== Grade.VIP){
            return price*discountPercent/100;
        } else{
            return 0;
        }
    }
}
