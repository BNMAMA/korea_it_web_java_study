package _06_String;

public class StringCompare {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Java"));
        System.out.println(str2.equalsIgnoreCase("python")); //대소문자 구분 않고 내용만 같은지 구분

        System.out.println();

        String password1 = "1234";
        //1234가 저장되어있는 메모리 공간을 password1, password2가 같은 공간을 참조하고 있다.
        String password2 = "1234";
        System.out.println(password1 == password2); //참조 주소(위치) 비교
        System.out.println(password1.equals(password2)); //내용 비교

        System.out.println();
        password1 = new String("1234");//객체 새로 만들기

        /* new (생성)
        * 내용이 같더라도 새로운 메모리 공간을 각각 할당 (주소가 다름)
        * 각각 참조 (서로 다른 위치에 저장)
        */

        password2 = new String("1234");
        System.out.println(password1 == password2); //참조 위치가 다름
        System.out.println(password1.equals(password2)); //내용은 같음




    }
}
