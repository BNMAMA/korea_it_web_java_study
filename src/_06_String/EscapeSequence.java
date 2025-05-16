package _06_String;

import java.sql.SQLOutput;

public class EscapeSequence {
    public static void main(String[] args) {

        /*
        * 이스케이프 문자
         \n , \t , \\ , \" , \'
         */

        // \n => new line
        System.out.println("집에");
        System.out.println("너무");
        System.out.println("가고 싶어요");
        System.out.println();
        System.out.println("집에\n너무\n가고 싶어요");

        System.out.println();
        // \t => tab
        /*
            손흥민
            페이커
            방탄소년단
            블랙핑크
         */

        System.out.println("\t손흥민");
        System.out.println("\t페이커");
        System.out.println("\t방탄소년단");
        System.out.println("\t블랙핑크");

        System.out.println();
        // \\
        // "C:\Program Files\java"
        System.out.println("C:\\rogram Files\\java");

        System.out.println();
        // \" ( 문장안에 큰따옴표 인식하기 )
        // 손흥민의 팀은 "토트넘 홋스퍼 FC"이다.
        System.out.println("손흥민의 팀은 \"토트넘 홋스퍼 FC\"이다.");

        System.out.println();
        // \'
        // 페이커는 '신' 이다.
        System.out.println("페이커는 '신' 이다.");

        char c = 'A';
        c =  '\'';

        //문제
        String id = "001205-4234567";
        //출력을 001205-4
        System.out.println(id.substring(0,8)); // 첫번째 방법
        System.out.println(id.substring(0,id.indexOf("-" + 2))); //두번째 방법


    }
}
