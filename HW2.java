package HW2;
import HW2.*;

import java.util.*;

public class HW2{

    /* 
    Calculate your emissions factor(EF) to 
    calculate your carbon footprint
    */
    public static void main(String[] args) {
        
        Car car = new Car(100); //carbon footprint of car per 100km
        Bicycle bicycle = new Bicycle(100); //carbon footprint of bike per 100km
        Building building = new Building(2, 10000,1000, 1000, 1000, 1000, 1000, 1000);   //carbon footprint of household per year

        System.out.println("Average of Carbon Footprint of a car is " + car.getCarbonFootprint());
        System.out.println("Average of Carbon Footprint of a bike is " + bicycle.getCarbonFootprint());
        System.out.println("Average of Carbon Footprint of a household is " + building.getCarbonFootprint());
    }
}