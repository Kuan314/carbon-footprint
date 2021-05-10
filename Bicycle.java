package HW2;

public class Bicycle implements CarbonFootprint{

    private double miles;
    private static double footprint_per_mile_average = 50;

    public double getMiles(){
        return miles;
    }
    public double getFootprint_per_mile_average(){
        return footprint_per_mile_average;
    }

    public double setMiles(miles){
        this.miles = miles;
    }

    public Bicycle(double miles){
        setMiles(miles);
    }

    @Override
    public double getCarbonFootprint() {
        // TODO Auto-generated method stub
        double footprint = getMiles() * getFootprint_per_mile_average();

        return footprint;
    }
}