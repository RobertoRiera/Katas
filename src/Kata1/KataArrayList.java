package Kata1;

import java.util.ArrayList;

public class KataArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100));
        }
        for (Integer value : list) {
            System.out.println(value);
        }
        ArrayList<Integer> elderPeople = new ArrayList<>();

        for (Integer value : list) {
            if (value <= 70) {
                continue;
            }
            elderPeople.add(value);
        }
        list.removeAll(elderPeople);

        for (Integer value : list) {
            System.out.println(value);
        }
        
        System.out.println("Gente mayor: ");
        
        for (Integer value2 : elderPeople) {
            System.out.println(value2);
        }
    }
}