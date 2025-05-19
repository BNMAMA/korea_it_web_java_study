package _08_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {

        //조건문 - Switch Case
        // 1등 => 전액 장학금
        // 2등 => 반액 장학금
        // 3등 => 소정의 상품
        // 그 이하 => 박수

        int ranking = 2;
//        if(ranking == 1) {
//            System.out.println("전액 장학금");
//        }else if(ranking == 2) {
//            System.out.println("반액 장학금");
//        }else if(ranking == 3) {
//            System.out.println("소정의 상품");
//        }else{
//            System.out.println("짝짝");
//        }
//        System.out.println("수여 끝");

        switch (ranking) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
                System.out.println("반액 장학금");
                break;
            case 3 :
                System.out.println("소정의 상품");
                break;
            default:
                System.out.println("짝짝짝짝");
                break;
        }
        System.out.println("수여 끝");

        int price = 7000;
        int grade = 1;
        //1등급이면 10000 , 등급이 한단계식 낮아질수록 -1000

        switch (grade) {
            case 1 :
                price += 3000;
                break;
            case 2 :
                price += 2000;
                break;
            case 3 :
                price += 1000;
                break;
        }
        System.out.println("가격은 " + price + "원");

        // 봄: 3, 4, 5 => 봄입니다
        // 여름: 6,7,8 => 여름입니다.
        // 가을: 9,10,11 => 가을입니다.
        // 겨울: 12,1,2 => 겨울입니다.

        System.out.println();

        int month = 10;

        switch (month) {
            case 3,4,5:
                System.out.println("봄 입니다.");
                break;
            case 6,7,8:
                System.out.println("여름 입니다.");
                break;
            case 9,10,11:
                System.out.println("가을 입니다.");
                break;
                case 12,1,2:
                    System.out.println("겨울 입니다");
                    break;


        }

        System.out.println();
        //1~7까지 숫자 하나 변수
        //월화수목금토일

        int num = 2;
        switch (num) {
            case 1:
                System.out.println("월");
                break;
            case 2 :
                System.out.println("화");
                break;
            case 3 :
                System.out.println("수");
                break;
            case 4:
                System.out.println("목");
                break;
            case 5:
                System.out.println("금");
                break;
            case 6:
                System.out.println("토");
                break;
            case 7 :
                System.out.println("일");
        }

    }
}
