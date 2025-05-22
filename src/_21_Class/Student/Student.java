package _21_Class.Student;

import java.io.InputStream;

public class Student {
    String name;
    int age;
    String email;
    String address;



    public void showInfo() {
        System.out.println("이름은 " + name + "입니다.");
        System.out.println("나이는 " + age + "입니다");
        System.out.println("이메일은 " + email + "입니다.");
        System.out.println("주소는 " + address + "입니다.");
    }
}
