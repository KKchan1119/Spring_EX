package com.spring.ex03;

public class MemberDAOImple implements MemberDAO{
    public void listMembers(){
        System.out.println("listMembers 메소드 호출");
        System.out.println("데이터베이스에서 회원 리스트를 조회합니다.");
    }
}
