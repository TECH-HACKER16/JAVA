public class Bike
{
    String colour ;
    int mileage;
    int horsepower;
    int petrol_tank_capacity;
    String tyre_type;
    int bike_weight;

    public static void main(String[] args) 
    {
        Bike Yamaha = new Bike();
        Bike Hero = new Bike();

        Yamaha.colour = "grey";
        System.out.println("According to my given data, bike colour is "+ Yamaha.colour);
        Yamaha.mileage = 18;
        System.out.println("According to my given data, mileage of bike is "+ Yamaha.mileage + "Kms");
        Yamaha.horsepower = 150;
        System.out.println("According to my given data, horsepower of bike is "+ Yamaha.horsepower);
        Yamaha.petrol_tank_capacity = 10;
        System.out.println("According to my given data, petrol tank capacity is "+ Yamaha.petrol_tank_capacity +" Litres");
        Yamaha.tyre_type = "Tubeless";
        System.out.println("According to my given data, type of tyre used is "+ Yamaha.tyre_type);
        Yamaha.bike_weight = 150;
        System.out.println("According to my given data, the weight of bike is approximately "+ Yamaha.bike_weight+" Kgs\n\n");


        Hero.colour = "Red";
        System.out.println("According to my given data, bike colour is "+ Hero.colour);
        Hero.mileage = 20;
        System.out.println("According to my given data, mileage of bike is "+ Hero.mileage + "Kms");
        Hero.horsepower = 140;
        System.out.println("According to my given data, horsepower of bike is "+ Hero.horsepower);
        Hero.petrol_tank_capacity = 12;
        System.out.println("According to my given data, petrol tank capacity is "+ Hero.petrol_tank_capacity+" Litres");
        Hero.tyre_type = "Tubeless";
        System.out.println("According to my given data, type of tyre used is "+ Hero.tyre_type);
        Hero.bike_weight = 135;
        System.out.println("According to my given data, the weight of bike is approximately "+ Hero.bike_weight + "Kgs");

        

        /****************************************************
         * Disclaimer : Above given data is fake and imaginary 
        ****************************************************/



    }
}