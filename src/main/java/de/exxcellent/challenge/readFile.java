/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exxcellent.challenge;

import java.io.*;

/**
 *
 * @author klaus
 */
public class readFile {
    
    /*  \brief      read from file
    *
    *   \details    create a reader to gat all the data from a csv file and return the reader.
    *
    *   \param  path    the path of the file that needs to be read    
    */
    public BufferedReader fileStream(String path) throws FileNotFoundException, IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader(path));
      
        return reader;
    }
    
}