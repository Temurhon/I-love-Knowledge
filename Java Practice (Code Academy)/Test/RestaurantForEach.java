package Test;

import java.util.HashMap;

public class RestaurantForEach {
    public static void main(String[] args) {

        HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();

        restaurantMenu.put("Turkey Burger", 13);
        restaurantMenu.put("Naan Pizza", 11);
        restaurantMenu.put("Cranberry Kale Salad", 10);


        //this will print out how many items are inside the hash map(currently there are 3 items).
        System.out.println(restaurantMenu.size());


        //this means that for every string called item(created var) is assigned to each of the keyset(integers).
        for (String item : restaurantMenu.keySet()) {

            System.out.println("A " + item + " costs " + restaurantMenu.get(item) + " dollars.");

        }

    }
}