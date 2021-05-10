package HW2;

public class Bicycle implements CarbonFootprint{

    private double distances;
    private static double footprint_per_km_average = 31.07;

    public double getDistances(){
        return distances;
    }
    public double getFootprint_per_km_average(){
        return footprint_per_km_average;
    }

    public double setDistances(distances){
        this.distances = distances;
    }

    public Bicycle(double distances){
        setDistances(distances);
    }

    @Override
    public double getCarbonFootprint() {
        // TODO Auto-generated method stub
        double footprint = getDistances() * getFootprint_per_km_average();

        return footprint;
    }
}
