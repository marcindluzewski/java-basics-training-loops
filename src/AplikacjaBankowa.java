import java.util.Scanner;

public class AplikacjaBankowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int account_balance = 10000;
        System.out.println("What you want to do? 1 - payment to account, 2 - payment from account");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("How much money you want to put on the account?");
                int puton = scanner.nextInt();
                int account_new_balance = account_balance + puton;
                System.out.println("Currently you have your account balance: " + account_new_balance);
                break;
            case 2:
                System.out.println("How much money you want to pay out?");
                int payout = scanner.nextInt();
                if (payout > 10000) {
                    System.out.println("You don't have such money my friend");
                } else {
                    int account_new_balance2 = account_balance - payout;
                    System.out.println("Currently you have your account balance: " + account_new_balance2);
                }
                break;
            default:
                System.out.println("Wrong input - please read closely and try again");
                break;
        }
    }
}
//        if (choice == 1) {
//            System.out.println("How much money you want to put on the account?");
//            int puton = scanner.nextInt();
//            int account_new_balance = account_balance + puton;
//            System.out.println("Currently you have your account balance: " + account_new_balance);
//        }
//        else if (choice == 2) {
//            System.out.println("How much money you want to pay out?");
//            int payout = scanner.nextInt();
//            if (payout > 10000) {
//                System.out.println("You don't have such money my friend");
//            } else {
//                int account_new_balance = account_balance - payout;
//                System.out.println("Currently you have your account balance: " + account_new_balance);
//            }
//        }
//           Aplikacja bankowa
//        1. Ustawiamy saldo usera
//        2. Mo??na wp??aci?? kase na konto
//        3. Mo??na wyp??aci?? kase z konta
//        4. Je??eli wyp??ata b??dzie ponad stan konta to pokazuje error

