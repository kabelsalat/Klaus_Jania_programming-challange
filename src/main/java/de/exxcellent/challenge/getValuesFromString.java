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
    
    public String values[];
    
    public String[] extractValues(String currentLine){
        
        values = currentLine.split(",");
            
        return values;
    }
}
