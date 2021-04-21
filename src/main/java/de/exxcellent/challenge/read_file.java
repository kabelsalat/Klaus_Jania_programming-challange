/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.exxcellent.challenge;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author klaus
 */
public class read_file {
    
    public BufferedReader file_stream(String path) throws FileNotFoundException, IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader(path));
      
        return reader;
    }
    
}