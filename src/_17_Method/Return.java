package _17_Method;

public class Return {
    public static String getName() {
        String name = "김소현";
        return name;

    }
    public static int getAge() {
        int age = 26;
        return age;
    }
    public static void main(String[] args) {
        System.out.println(getName());
        System.out.println(getAge());

        String myName = getName();
        System.out.println(myName); //메소드 getName으로 만들어 놓은 함수를 재선언
    }
    //return 반환값
    //void 반환값이 없다.
}
