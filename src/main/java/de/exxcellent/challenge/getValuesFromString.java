/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exxcellent.challenge;

/**
 *
 * @author klaus
 */
public class getValuesFromString {
    
    
    public String values[];//String array of a line from the csv file. So it can be easily accessed.
    
    /*  \brief      create string array
    *
    *   \details    create a string array with all the values of of a line from the csv line
    *
    *   \param  currentLine     one line of the csv file    
    */
    public void extractValues(String currentLine){        
        values = currentLine.split(",");
    }
}
