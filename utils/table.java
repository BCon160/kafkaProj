/*Title: table.java
 *Author: Brendan Connolly
 *Date: 7/11/19
 *Description: Class used for the tabular data.  Basic data structure is a (column
 *oriented) list of lists
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

public class table {
    public final List<String> HEADERS;
    public List<List<Object>> DATA;
    public final List<String> TYPES;

    //Constructor when loading table from CSV
    //Inputs:   csvPath - filepath to csv file to read from
    //          schemaPath - filepath to XML file containing column details for table
    //          head - true if column headers are present in CSV file, false if not
    public table(String csvPath, String schemaPath, boolean head) {
        //Call to XML reader method

        //Initialise data container

        //Call to csv loader method

        //Set instance variables
    }

    //No CSV constructor
    public table(List<String> headers, List<List<Object>> tabVals) {
        //Set instance variables
    }

    //Accessor methods
    public HashMap<String, Object> getRow(int index) {

    }

    public List<Object> getCol(String colName) {

    }

    public List<String> getHeaders() {
        return HEADERS;
    }

    public HashMap<String, String> getSchema() {

    }

    //Private class methods
    private List<List<Object>> 
        loadCSV(String csvPath, boolean head) {
        
        File file= new File(csvPath);
        Scanner inputStream;

        try {
            inputStream = new Scanner(file);
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found at path: " + csvPath)
            e.printStackTrace();
        }

        //Make sure to skip the headers if they are present
        if (head) {
            inputStream.next();
        }

        //Loop through the file and split each line on ","
        //Add the split line to stringVals
        while(inputStream.hasNext()){
            String line= inputStream.next();
            String[] values = line.split(",");
            //Cast and add line to data
                stringVals.add(Arrays.asList(values));
        }

        inputStream.close();
        
        return data
    }

    private HashMap<String, String> readSchema(String schemaPath) {
        //Use xml parser to get the relvant fields from file

        //for loop to populate hashmap

    }
}
