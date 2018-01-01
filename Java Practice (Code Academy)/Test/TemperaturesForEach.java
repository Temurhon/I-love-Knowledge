package Test;

import java.util.ArrayList;

public class TemperaturesForEach {
    public static void main(String[] args) {

        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>();
        weeklyTemperatures.add(78);
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);

        for (Integer temperature : weeklyTemperatures) {//this means that every temperature(variable) in the array will be printed one by one.
            System.out.println(temperature);
        }

    }
}
