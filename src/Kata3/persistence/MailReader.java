package Kata3.persistence;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MailReader {

    public String[] readDomains(String filename) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
        while (true) {
            String line;
            try {
                String line = reader.readline();
            } catch (IOException ex) {
                break;
            }

        }


    }
}
