package com.spring.ex03;

public class MemberServiceImple implements MemberService{
    private MemberDAO memberDAO;
    public void setMemberDAO(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    @Override
    public void listMembers(){

    }
}
