package Test;

import java.util.*;

public class Generalisations {
    public static void main(String[] args) {

//created an array list called sports.
        ArrayList<String> sports = new ArrayList<String>();

        //added two objects inside the array list.
        sports.add("Football");
        sports.add("Boxing");


        // the string "sport" for every sports(array list) will print out the objects without the bracket
        for(String sport : sports) {
            System.out.println(sport);//sport will only print out the strings in a for loop form.
        }

        //Major cities and the year they were founded.
        HashMap<String, Integer> majorCities = new HashMap<String, Integer>();

        majorCities.put("New York", 1624);
        majorCities.put("London", 43);
        majorCities.put("Mexico City", 1521);
        majorCities.put("Sao Paulo", 1554);

        //the string "city" that has been created now will take the value of each major cities objects value.
        for (String city : majorCities.keySet()) {
            //first it will print out the string alongside the  number.
            System.out.println(city + " was founded in " + majorCities.get(city));

        }



    }
}