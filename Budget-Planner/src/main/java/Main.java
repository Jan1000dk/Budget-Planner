import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        csvLoader();
    }

    //TODO - Convert csvLoader into a class rather than a method
    //  should contain a writer method & a reader method
    public static void csvLoader() {
        try {
            MsgChecks msgChecks = new MsgChecks();
            FileReader inputFile = new FileReader(".\\CSVPrototype.csv");
            FileWriter outputFile = new FileWriter(".\\CSVPrototype.csv");
            CSVWriter writer = new CSVWriter(outputFile);
            CSVReader reader = new CSVReaderBuilder(inputFile).build();
            List<String[]> entries = reader.readAll();
            int max;
            for (String[] row : entries){
                for (String cell : row){
                    System.out.println(cell + "\t");
                    //TODO - make the ---- line dynamic so that it matches the longest string plus amount
                    System.out.println("-----------------------");
                }
            }
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }
}