package com.javaeagles.section01;

import com.javaeagles.section01.controller.Pcontorller;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pcontorller pcontorller = new Pcontorller();
        boolean phone = true;


        while (phone){
            System.out.println("=====전화번호부(그림)=====");
            System.out.println("1. 전화번호 등록");
            System.out.println("2. 전화번호 수정");
            System.out.println("3. 전화번호 삭제");
            System.out.println("4. 전화번호 전체조회");
            System.out.println("5. 전화번호 상세조회");
            System.out.println("test");
            int input = sc.nextInt();

            switch (input){
                case 1 :
                    // 이름
                    // 전화번호
                    // 이메일
                    // 메모
                    // 그룹
                    // 컨트롤러 넘겨
                    break;
                case 2 :
                    // 수정
                    // 수정하고 싶은 이름 입력
                    // 입력 받은 이름을 조회하고 존재하는 확인
                    // 존재하면 true 수정할 항목선택 존재하지않으면 false
                    // 컨트롤러 넘겨
                    break;
                case 3 :
                    // 삭제
                    // 삭제하고 싶은 이름 입력
                    // 입력 받은 이름을 조회하고 존재하는지 확인
                    // 존재하면 true 전체삭제 존재하지 않으면 false
                    // 컨트롤 넘겨
                case 4 :
                    // 전체조회
                    // 등록된 번호 모두 조회
                    // 넘겨
                case 5 :
                    // 상세조회
                    // 이름을 입력 받아 존재하는지 확인
                    // 있으면 모든 정보 조회 없으면 false
                    // 넘겨
                default:
                    System.out.println("잘못 입력 됐습니다.");
                    break;

            }
            System.out.println("종료하시겠습니까?");
            phone = sc.nextBoolean();
        }



    }
}
