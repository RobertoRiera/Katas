package Kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MailReader {
    public static ArrayList<String> readDomains(String filename){
        try {
        BufferedReader reader = new BufferedReader (new FileReader(filename));
        while (true) {
            String mail = reader.readLine();
        }
        } catch (FileNotFoundException ex) {
        
        }
        return null;
    }
    
}
