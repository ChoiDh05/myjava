package com.app.member.test;

import com.app.member.domain.MemberVO;
import com.app.member.repository.MemberDAO;

public class Test {

    public static void main(String[] args) {
        MemberDAO memberDAO = new MemberDAO();

        // 새로운 회원 정보 생성
        MemberVO newMember = new MemberVO();
        newMember.setMemberEmail("test@example.com");
        newMember.setMemberPassword("password123");
        newMember.setMemberName("John Doe");
        newMember.setMemberAge(30);
        newMember.setMemberGender(1); // 예: 1 = 남성, 2 = 여성

        // 회원 정보 삽입
        memberDAO.insert(newMember);
        System.out.println("회원 정보가 성공적으로 삽입되었습니다.");

        // 삽입된 회원 정보 조회
        Long memberId = 1L; // 예제에서는 1번 회원을 조회
        MemberVO member = memberDAO.select(memberId);

        if (member != null) {
            System.out.println("조회된 회원 정보:");
            System.out.println(member);
        } else {
            System.out.println("회원 정보를 찾을 수 없습니다.");
        }

        // 전체 회원 정보 조회
        System.out.println("전체 회원 정보:");
        for (MemberVO m : memberDAO.selectAll()) {
            System.out.println(m);
        }
    }
}
