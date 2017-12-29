package Test;

class Coffee extends Beverage{//this is inherited from beverage class.

    public Coffee(){

    }

    public void addSugar(int cubes) {//this method has a parameter "cubes".

        System.out.println("You added " + cubes + " sugar cubes."); //this method will print out this with object cubes.

    }

    public static void main(String[] args) {

        Coffee myOrder = new Coffee();//this will create a new object called myOrder.

        myOrder.addSugar(2);//this will run the "addSugar" function which will store 2 in the cubes parameter

        myOrder.isFull();//this will run "isFull" function from the Beverage class.

    }
}