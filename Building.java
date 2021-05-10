package HW2;

public class Building implements CarbonFootprint{

    private static double footprint_eletricity_per_unit = 0.00059;
    private static double footprint_natural_gas_per_unit = 0.00018;
    private static double footprint_heating_oil_per_unit = 0.00026;
    private static double footprint_coal_per_unit = 0.00034;
    private static double footprint_LPG_per_unit = 0.00022;
    private static double footprint_propane_per_unit = 0.00579;
    private static double footprint_wood_pellets_per_unit = 0.00774;

    private double eletricity;
    private double natural_gas;
    private double heating_oil;
    private double coal;
    private double LPG;
    private double propane;
    private double wood_pellets;
    private int num_of_people;

    public double getEletricity(){
        return eletricity;
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

    public double setEletricity(eletricity){
        this.eletricity = eletricity;
    }
    public double setNatural_gas(natural_gas){
        this.natural_gas = natural_gas;
    }
    public double setHeating_oil(heating_oil){
        this.heating_oil = heating_oil;
    }
    public double setCoal(coal){
        this.coal = coal;
    }
    public double setLPG(LPG){
        this.LPG = LPG;
    }
    public double setPropane(propane){
        this.propane = propane;
    }
    public double setWood_pellets(wood_pellets){
        this.wood_pellets = wood_pellets;
    }
    public int setNum_of_people(num_of_people){
        this.num_of_people = num_of_people;
    }

    public Building(int num_of_people, double eletricity, double natural_gas, 
                    double heating_oil, double coal, double LPG, double propane,
                    double wood_pellets){
        setNum_of_people(num_of_people);
        setEletricity(eletricity);
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

        footprint += getEletricity() * footprint_eletricity_per_unit;
        footprint += getNatural_gas() * footprint_natural_gas_per_unit;
        footprint += getHeating_oil() * footprint_heating_oil_per_unit;
        footprint += getCoal() * footprint_coal_per_unit;
        footprint += getLPG() * footprint_LPG_per_unit;
        footprint += getPropane() * footprint_propane_per_unit;
        footprint += getWood_pellets() * footprint_wood_pellets_per_unit;
        
        return footprint;
    }
}