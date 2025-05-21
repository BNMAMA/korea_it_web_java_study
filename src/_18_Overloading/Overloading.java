package _18_Overloading;

import java.sql.SQLOutput;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }
    public static int getPower (double doubleNum) {
        int number = (int) doubleNum;
        return number * number;
    }

    public static int getPower(String strNum) {
        int number = Integer.parseInt(strNum);
        return number * number;
    }
    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void PrintInfo(String name) {
        System.out.println("이름은" + name + "입니다");
    }

    public static void PrintInfo(String name, int age) {
        System.out.println("이름은" + name + "이고" + " 나이는" + age + "입니다");

    }
    public static void PrintInfo(String name, int age, String email) {
        System.out.println("이름은" + name + "나이는" + age + "이고" + " 이메일은" + email);

    }

    public static void add(int number1, int number2) {
        int result1 =
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 개 선언
        //매개변수(파라미터)의 타입이 달라야 한다. 또는 갯수가 달라야 한다.

        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPowerByExp(2, 4));
        System.out.println();
        System.out.println(PrintInfo("김소현"));


        //문제
        // 메소드 이름 printInfo()
        // 문자열 이름만 전달 => 이름을 출력
        // 문자열 이름, 정수, 나이 전달 => 이름 나이 출력
        // 문자열 이름, 정수 나이 , 문자열 이메일 => 이름 나이 이메일 출력

        //메소드 이름 add()
        //int와 int 덧셈
        //double과 double의 덧셈
        //문자열 숫자와 문자열 숫자 덧셈
    }
}
