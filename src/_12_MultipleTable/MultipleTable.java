package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        //1 ~ 9단
        for (int i = 1; i <= 9 ; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);

            }

        }
    }
}
