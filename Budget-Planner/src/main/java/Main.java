import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CSVLoader csvLoader = new CSVLoader();
        MsgChecks msgChecks = new MsgChecks();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you wanna do?");
        System.out.println("View your current budget or edit an exisiting budget?");
        String scannerMsg = scanner.nextLine();
        if (msgChecks.viewMsg().contains(scannerMsg)) {
            try {
                csvLoader.displayData(".\\CSVPrototype.csv");
            } catch (IOException | CsvValidationException e) {
                throw new RuntimeException(e);
            }
        } else if (msgChecks.editMsg().contains(scannerMsg)) {
            System.out.println("Do you wanna edit your current budget or create a new one?");
            scannerMsg = scanner.nextLine();
            if (msgChecks.editMsg().contains(scannerMsg)) {
                System.out.println("Feature not yet implemented");
            } else if (msgChecks.newMsg().contains(scannerMsg)) {
                System.out.println("Feature not yet implemented");
            } else {
                System.out.println("I did not acocunt for that answer, so fuck you, I'm leaving.");
            }
        } else {
            System.out.println("I did not acocunt for that answer, so fuck you, I'm leaving.");
        }
//        MsgChecks msgChecks = new MsgChecks();
//        IncomeCalculator incomeCalculator = new IncomeCalculator();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Do you know your monthly salary?");
//        String smsg = scanner.nextLine();
//
//        if (msgChecks.yesMsg().contains(smsg)){
//            System.out.println("What is your monthly salary?");
//            Double salary = scanner.nextDouble();
//            System.out.println("your salary is " + salary);
//        }else {
//            System.out.println("Lets figure it out");
//            System.out.println("How many hours have you wake this month?");
//            Double hours = scanner.nextDouble();
//            double salary = incomeCalculator.getSalary(hours);
//            Double uebHours = 160.33 - hours;
//            double ueb = incomeCalculator.getUEB(uebHours);
//            System.out.println("Your Salary for this month is " + salary);
//            System.out.println("With your unemployment benefits being " + ueb);
//            double totalIncome = salary + ueb;
//            System.out.println("For a total income of " + totalIncome);
//        }
//        scanner.close();
//        System.out.println("these are you income and expenses");
//        csvLoader();
    }

}