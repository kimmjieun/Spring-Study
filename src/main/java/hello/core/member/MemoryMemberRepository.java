package hello.core.member;

import java.util.HashMap;
import java.util.Map;


// 디비 확정안되서 이런식으로 함
public class MemoryMemberRepository implements MemberRepository{

    // 저장소 만들기
    private static Map<Long,Member> store = new HashMap<>();

    @Override
    public void save(Member member){
        store.put(member.getId(),member);
    }

    @Override
    public Member findById(Long memberId){
        return store.get(memberId);
    }
}
