package kata0;

import java.util.Date;

public class Kata0 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Date birthDate = new Date(92, 5, 1, 0, 0, 0);
        Student Roberto = new Student ("Roberto", birthDate);
        System.out.print("Tiene "+Roberto.getAge()+" años");
    }
}
