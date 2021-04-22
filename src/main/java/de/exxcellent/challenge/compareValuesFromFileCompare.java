/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import static java.lang.Math.abs;

/**
 *
 * @author klaus
 */
public class compareValuesFromFileCompare {
    
    
    /*  \brief      get name of line with lowest difference
    *  
    *   \details   extracts data from a csv files and compares the values of the selected
    *               fields. The name or first value of the specific line is returned.
    *    
    *   \param      reader              with the date of the specidied csv data
    *   \param      valueToCompare1     first value for the comparison
    *   \param      valueToCompare2     second value for the comparison
    *   
    *   \retval     nameOfLowestDiv     The name or first value of the specific line
    */
    public String getLowestDiverence(BufferedReader reader, Integer valueToCompare1, Integer valueToCompare2) throws IOException{
        
        String fieldOfInterest = "";
        String currentLine = "";
        String nameOfLowestDiv = "";
        String valueOfInterest1 = "";
        String valueOfInterest2 = "";
        Integer diff = 100;
        getValuesFromString values = new getValuesFromString();
        
        reader.readLine();//to get rid of the first line with no relevant datad
        while ((currentLine = reader.readLine()) != null){        
            values.extractValues(currentLine);
            fieldOfInterest = values.values[0];
            valueOfInterest2 = values.values[valueToCompare1];
            valueOfInterest1 = values.values[valueToCompare2];
                   
            if(diff > abs(Integer.parseInt(valueOfInterest2) - Integer.parseInt(valueOfInterest1))){
                nameOfLowestDiv = fieldOfInterest;
                diff = abs(Integer.parseInt(valueOfInterest2) - Integer.parseInt(valueOfInterest1));
            }
        }
        return nameOfLowestDiv;
    }
}