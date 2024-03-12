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
        try {
            csvLoader.displayData(".\\CSVExample.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What do you wanna do?");
//        System.out.println("View your current budget or edit an exisiting budget?");
//        String scannerMsg = scanner.nextLine();
//        if (msgChecks.viewMsg().contains(scannerMsg)) {
//            try {
//                csvLoader.displayData(".\\CSVPrototype.csv");
//            } catch (IOException | CsvValidationException e) {
//                throw new RuntimeException(e);
//            }
//        } else if (msgChecks.editMsg().contains(scannerMsg)) {
//            System.out.println("Do you wanna edit your current budget or create a new one?");
//            scannerMsg = scanner.nextLine();
//            if (msgChecks.editMsg().contains(scannerMsg)) {
//                System.out.println("Feature not yet implemented");
//            } else if (msgChecks.newMsg().contains(scannerMsg)) {
//                System.out.println("Feature not yet implemented");
//            } else {
//                System.out.println("I did not acocunt for that answer, so fuck you, I'm leaving.");
//            }
//        } else {
//            System.out.println("I did not acocunt for that answer, so fuck you, I'm leaving.");
//        }
    }

}