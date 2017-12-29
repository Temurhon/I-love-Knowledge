
package Test;




class Dog extends Animal{// this means taht it will be inherited from animal class.

    int age;//this will be used in getAge method to get the age of the dog


    public Dog(int dogsAge){//always add the constructor onto parameter so its accessable

        age = dogsAge;

    }

    public void bark(){
        System.out.println("Woof!");//this method will print out "woof!"
    }

    public void run(int feet){//this method will print out what's below.


        System.out.println("Your dog ran " + feet + " feet!");

    }



    public int getAge(){


        return age;//this will return the age of the dog


    }



    public static void main(String[] args) {

        Dog spike = new Dog(33);//made new variable called spike(name of new dog which is aged 33)

        spike.bark();//this will run the method bark, which will print out 	"woof!"


        spike.run(40);//this will run the "run" method and it will enter the paramenter "feet" as 40 in this case.


        int spikeAge = spike.getAge();//this will create a variable spike age which will get the integer value of getAge.


        System.out.println(spikeAge);//this will print out the integer value that's inside spikeAge.


        spike.checkStatus();//this method is from animal class, which can be used here.

    }

}