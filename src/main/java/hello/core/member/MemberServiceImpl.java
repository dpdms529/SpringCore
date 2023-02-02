package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepoistory memberRepoistory = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepoistory.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepoistory.findById(memberId);
    }
}
