package HW2;

public class Building implements CarbonFootprint{

    private static double footprint_electricity_per_unit = 0.00059;
    private static double footprint_natural_gas_per_unit = 0.00018;
    private static double footprint_heating_oil_per_unit = 0.00026;
    private static double footprint_coal_per_unit = 0.00034;
    private static double footprint_LPG_per_unit = 0.00022;
    private static double footprint_propane_per_unit = 0.00579;
    private static double footprint_wood_pellets_per_unit = 0.00774;

    private double electricity;
    private double natural_gas;
    private double heating_oil;
    private double coal;
    private double LPG;
    private double propane;
    private double wood_pellets;
    private int num_of_people;

    public double getElectricity(){
        return electricity;
    }
    public double getNatural_gas(){
        return natural_gas;
    }
    public double getHeating_oil(){
        return heating_oil;
    }
    public double getCoal(){
        return coal;
    }
    public double getLPG(){
        return LPG;
    }
    public double getPropane(){
        return propane;
    }
    public double getWood_pellets(){
        return wood_pellets;
    }
    public int getNum_of_people(){
        return num_of_people;
    }

    public void setElectricity(double electricity){
        this.electricity = electricity;
    }
    public void setNatural_gas(double natural_gas){
        this.natural_gas = natural_gas;
    }
    public void setHeating_oil(double heating_oil){
        this.heating_oil = heating_oil;
    }
    public void setCoal(double coal){
        this.coal = coal;
    }
    public void setLPG(double LPG){
        this.LPG = LPG;
    }
    public void setPropane(double propane){
        this.propane = propane;
    }
    public void setWood_pellets(double wood_pellets){
        this.wood_pellets = wood_pellets;
    }
    public void setNum_of_people(int num_of_people){
        this.num_of_people = num_of_people;
    }

    public Building(int num_of_people, double electricity, double natural_gas, 
                    double heating_oil, double coal, double LPG, double propane,
                    double wood_pellets){
        setNum_of_people(num_of_people);
        setElectricity(electricity);
        setNatural_gas(natural_gas);
        setHeating_oil(heating_oil);
        setCoal(coal);
        setLPG(LPG);
        setPropane(propane);
        setWood_pellets(wood_pellets);
    }

    @Override
    public double getCarbonFootprint() {
        // TODO Auto-generated method stub
        double footprint = 0;

        footprint += getElectricity() * footprint_electricity_per_unit;
        footprint += getNatural_gas() * footprint_natural_gas_per_unit;
        footprint += getHeating_oil() * footprint_heating_oil_per_unit;
        footprint += getCoal() * footprint_coal_per_unit;
        footprint += getLPG() * footprint_LPG_per_unit;
        footprint += getPropane() * footprint_propane_per_unit;
        footprint += getWood_pellets() * footprint_wood_pellets_per_unit;
        
        if(getNum_of_people() != 0){
            footprint /= getNum_of_people();
        }
        
        return footprint;
    }
}