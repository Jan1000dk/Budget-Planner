import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVLoader {
    public void loadData(String pathToFile) throws IOException, CsvValidationException {
        FileReader file = new FileReader(pathToFile);
        CSVReader csvReader = new CSVReader(file);
        String[] nextEntry;
        while ((nextEntry = csvReader.readNext())!=null){
            for (String cell : nextEntry){
                System.out.println(cell  + "\t");
                System.out.println("--------------------");
            }
        }
    }
}
