package hello.core.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);

    // 인터페이스와 구현체 같은 패키지 넣으면 안좋지만 일단은 그렇게 한다

}
