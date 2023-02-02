package hello.core.member;

public interface MemberRepoistory {

    void save(Member member);

    Member findById(Long memberId);
}
