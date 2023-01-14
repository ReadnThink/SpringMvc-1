package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    //싱글톤으로 보장이 되기 때문에 필드값들은 static 이 아니여도 된다.
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L; //id역할이다. 하나씩 증가


    // final로 선언하여 싱글톤으로 만든다.
    private static final MemberRepository instance = new MemberRepository();

    // getInstance로만 조회를 할 수 있다.
    public static MemberRepository getInstance(){
        return instance;
    }
    //생성자를 private로 막는다. = 아무나 생성 못하여서 싱글톤이 된다.
    private MemberRepository() {
    }

    //member를 스토어에 저장
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }

}
