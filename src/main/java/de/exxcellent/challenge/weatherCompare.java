/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author klaus
 */
public class weatherCompare {
    
    public String getLowestDiverence(BufferedReader reader) throws IOException{
        
        String sCurrentLine;
        while ((sCurrentLine = reader.readLine()) != null){        
            sCurrentLine.substring(0, sCurrentLine.indexOf(","));
        }
        return "";
    }
}
