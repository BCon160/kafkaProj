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

    //Constructor when loading table from CSV
    //Inputs:   csvPath - filepath to csv file to read from
    //          schemaPath - filepath to XML file containing column details for table
    //          head - true if column headers are present in CSV file, false if not
    public table(String csvPath, String schemaPath, boolean head) {
        //Call to XML reader method

        //Call to csv loader method

        //Set instance variables
    }

    //No CSV constructor
    public table(List<String> headers, List<List<Object>> tabVals) {
        //Set instance variables
    }

    //Accessor methods



    //Private class methods
    private List<List<Object>> 
        loadCSV( String csvPath, List<String> types, boolean head) {
        
    }

    private HashMap<String, String> readSchema(String schemaPath) {
        //Use xml parser to get the relvant fields from file

        //for loop to populate hashmap

    }
}
