import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class CSVLoader {
    public void loadData(String pathToFile) throws IOException, CsvValidationException {
        FileReader file = new FileReader(pathToFile);
        CSVReader csvReader = new CSVReader(file);
        String[] nextEntry;
        //While loop runs as long as there is a line to read from the CSV file
        while ((nextEntry = csvReader.readNext()) != null) {
            //looping through the entire file and separates the coloums
            for (String cell : nextEntry) {
                //Splits the cell-string to append an Amount coloum to the CLI table
                 if (cell.contains("Expense Type")) {
                    String[] arrOfCell = cell.split(";", 2);
                    cell = arrOfCell[0] +" | "+ "Amount";
                }
                 //Splits the cell-string to replace ; separator with =
                 else if (!cell.contains("Income type")) {
                    String[] arrOfCell = cell.split(";", 2);
                    cell = arrOfCell[0] + "=" + arrOfCell[1];
                }
                //Splits the cell-string to replace ; with a space and |
                 else{
                     String[] arrOfCell = cell.split(";", 2);
                     cell = arrOfCell[0] + " | " + arrOfCell[1];
                 }
                System.out.printf(cell + "\t" + "\n");
                System.out.println("------------------------------");
            }
        }
    }
}
