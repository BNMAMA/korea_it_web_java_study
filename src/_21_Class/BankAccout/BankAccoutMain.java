package _21_Class.BankAccout;

public class BankAccoutMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10000);
        bankAccount.withdraw(2400);

        System.out.println(bankAccount.getBalance());


    }
    //문제
    //WaterBottle => WaterBottle 클래스, WaterBottleMain
    //currentWatter 현재 물의 양
    //메소드
    //물 채우기(fill) => 최대용량인 1000을 넘을 수 없다
    // 물 마시기(drink) => 현재 물의 양보다 추과해서 마실 수 없다.
    // getter를 통해 현재 물병의 물의 양에 접근할 수 있다.


}
