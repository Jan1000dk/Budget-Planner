import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MsgChecks msgChecks = new MsgChecks();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you know your monthly salary?");
        String smsg = scanner.nextLine();

        if (msgChecks.yesMsg().contains(smsg)){
            System.out.println("What is your monthly salary?");
            Double salary = scanner.nextDouble();
            System.out.println("your salary is " + salary);
        }else {
            System.out.println("Lets figure it out");
        }
    }
}