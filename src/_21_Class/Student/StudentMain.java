package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student("김소현", 26, "ksuyeon", "부산");
        student.setAge(26); //private 필드값을 사용하기 위한 setter
        student.setName("홍길동");
//        student.name = "김소현";
//        student.age = 26;
//        student.email = "kdasdsaD56@naver.com";
//        student.address = "부산 진구";
        student.getAge();


        student.showInfo();








    }

}
