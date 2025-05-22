package _19_VariableScope;

import java.io.FilterOutputStream;

public class VariableScope {
    public static void methodA() {
        String str = "abc";
    }
    public static void main(String[] args) {
        String name = "김소현";
//        System.out.println(str); //지역변수

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i); //중괄호 밖에서는 지역변수 불가능
        {
            int age = 26;
        }
//        System.out.println(age);
    }

}
