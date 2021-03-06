package de.exxcellent.challenge;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …
        readFile readFile = new readFile();
        compareValuesFromFileCompare compare = new compareValuesFromFileCompare();
        String dayWithSmallestTempSpread = "";
        String teamWithSmallestGoalSpread = "";
        
        try {
            dayWithSmallestTempSpread = compare.getLowestDiverence(readFile.fileStream(".\\src\\main\\resources\\de\\exxcellent\\challenge/weather.csv"), 1, 2);
            teamWithSmallestGoalSpread = compare.getLowestDiverence(readFile.fileStream(".\\src\\main\\resources\\de\\exxcellent\\challenge/football.csv"), 5, 6);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        //String dayWithSmallestTempSpread = "Someday";     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        //String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread: %s%n", teamWithSmallestGoalSpread);
    }
}
