package HW2;

public class Car implements CarbonFootprint{

    private double distances;
    private static double footprint_per_km_average = 0.141058651;

    public double getDistances(){
        return distances;
    }
    public double getFootprint_per_km_average(){
        return footprint_per_km_average;
    }

    public void setDistances(double distances){
        this.distances = distances;
    }

    public Car(double distances){
        setDistances(distances);
    }

    @Override
    public double getCarbonFootprint() {
        // TODO Auto-generated method stub
        double footprint = getDistances() * getFootprint_per_km_average();

        return footprint;
    }
}