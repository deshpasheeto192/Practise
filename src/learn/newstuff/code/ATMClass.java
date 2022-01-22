package learn.newstuff.code;

import java.util.Scanner;

public class ATMClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if(Integer.signum(amount)==1) {
            if(amount%10==0) {
                int denominations[] = {50, 20, 10};
                int divBy;
                for (int denomination : denominations) {
                    divBy = amount / denomination;
                    amount = amount % denomination;
                    System.out.print(denomination + "*" + divBy + " ");
                }
            } else {
                throw new RuntimeException("Not divisible by 10");
            }
        } else {
            throw new RuntimeException("Amount cannot be negative!");
        }
    }
}
