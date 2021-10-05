package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        // given - 이런 것들이 주어졌을 때
        Member member = new Member(1L, "memberA",Grade.VIP);

        // when - 이런 것들을 했을 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then - 이렇게 된다
        Assertions.assertThat(member).isEqualTo(findMember);

        // 메인에서 테스트할 때와 달리 오류를 콘솔에서 빠르게 확인할 수 있다
        // 테스트 코드 작업 선택이 아닌 필수다 !!
    }
}
