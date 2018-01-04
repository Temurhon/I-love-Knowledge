package Test;

import java.util.HashMap;

public class Restaurant {
    public static void main(String[] args) {


//creates a new hash map called restaruant menu
        HashMap<String, Integer> restaurantMenu = new HashMap<String, Integer>();


        //adds new object inside hash map
        restaurantMenu.put("Turkey Burger", 13);
        restaurantMenu.put("Naan Pizza", 11);
        restaurantMenu.put("Cranberry Kale Salad", 10);

        //printing specific "dish" object from the hash map "restaurantMenu".
        System.out.println(restaurantMenu.get("Naan Pizza") );

    }
}
