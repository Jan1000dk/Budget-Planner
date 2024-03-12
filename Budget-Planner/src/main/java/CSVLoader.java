import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class CSVLoader {
    public void displayData(String pathToFile) throws IOException, CsvValidationException {
        FileReader file = new FileReader(pathToFile);
        CSVReader csvReader = new CSVReader(file);
        String[] nextEntry;
        //While loop runs as long as there is a line to read from the CSV file
        while ((nextEntry = csvReader.readNext()) != null) {
            //looping through the entire file and separates the coloums
            for (String cell : nextEntry) {
                //Splits the cell-string to append an Amount coloum to the CLI table & perform some light formatting
                if (cell.contains("Expense Type")) {
                    String[] arrOfCell = cell.split(";", 2);
                    String cell1 = String.format("| %-25s", arrOfCell[0]);
                    String cell2 = String.format(" | %-6s |", "Amount");
                    System.out.printf(cell1 + cell2 + "\n");
                    System.out.printf("______________________________________%n");
                }
                //Splits the cell-string to replace ; separator with = & perform some light formatting
                else if (!cell.contains("Income type")) {
                    String[] arrOfCell = cell.split(";", 2);
                    String cell1 = String.format("| %-25s", arrOfCell[0]);
                    String cell2 = String.format(" | %-6s |", arrOfCell[1]);
                    System.out.println(cell1 + cell2);
                    System.out.printf("--------------------------------------%n");
                }
                //Splits the cell-string to replace ; with a space and | & perform some light formatting
                else {
                    String[] arrOfCell = cell.split(";", 2);
                    String cell1 = String.format("| %-25s", arrOfCell[0]);
                    String cell2 = String.format(" | %-6s |", arrOfCell[1]);
                    System.out.println(cell1 + cell2);
                    System.out.printf("______________________________________%n");
                }
            }
        }
    }
    //TODO - Should load all data from the CSV file and present them in a searchable manner
    public String[] loadData(){return null;}
    //TODO - Should use a CSVWriter to edit/replace data in the CSV file
    public String[] saveData(){return null;}
}
