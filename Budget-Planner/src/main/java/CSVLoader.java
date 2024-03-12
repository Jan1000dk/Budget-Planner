import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class CSVLoader {
    //TODO - Changed displayData to show two tables, Income & Expenses
    public void displayData(String pathToFile) throws IOException, CsvValidationException {
        FileReader file = new FileReader(pathToFile);
        CSVReader csvReader = new CSVReader(file);
        String[] nextEntry;
        //While loop runs as long as there is a line to read from the CSV file
        while ((nextEntry = csvReader.readNext()) != null) {
            //looping through the entire file and separates the coloums
            for (String cell : nextEntry) {
                //Catches Expense- & Income Type headers
                if (cell.contains("Type")){
                    cliFormatter(cell);
                }
                //Catches category totals
                //TODO - Once loadData is created, use the method to calculate totals using the category header
                else if (cell.contains("total")) {
                    cliFormatterTotals(cell);
                }
                else {
                    cliFormatter(cell);
                }
            }
        }
    }
    //TODO - Should load all data from the CSV file and present them in a searchable manner
    public String[] loadData(){return null;}
    //TODO - Should use a CSVWriter to edit/replace data in the CSV file
    public String[] saveData(){return null;}
    //TODO - Should create a new CSVPrototype.csv file with a custom name
    public String[] createNewBudget(){return null;}

    //formatters to present a table in the CLI/Console
    private String cliFormatter(String cell){
        String[] arrOfCell = cell.split(";");
        String cell1 = String.format("| %-40s", arrOfCell[0]);
        String cell2 = String.format(" | %-23s |", arrOfCell[1]);
        String cell3 = String.format(" %-6s|", arrOfCell[2]);
        System.out.print(cell1 + cell2 + cell3 + "\n");
        System.out.printf(
                "------------------------------------------------------------------------------%n");
        return cell;
    }
    private String cliFormatterTotals(String cell){
        String[] arrOfCell = cell.split(";");
        String cell1 = String.format("| %40s", arrOfCell[0]);
        String cell2 = String.format(" | %-23s |", arrOfCell[1]);
        String cell3 = String.format(" %-6s|", arrOfCell[2]);
        System.out.print(cell1 + cell2 + cell3 + "\n");
        System.out.printf(
                "------------------------------------------------------------------------------%n");
        return cell;
    }
}
