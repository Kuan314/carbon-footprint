package HW2;

public class Building implements CarbonFootprint{

    //use(kWh/yr) * EF(kg CO2e/kWh)
    private float eletricity;
    //use(therms/yr) * EF(kg CO2e/kWh)
    private float natural_gas;
    //use(litres/yr) * EF(kg CO2e/kWh)
    private float fuel_oil;
    //use(litres/yr) * EF(kg CO2e/kWh)
    private float LPG;
    //use(kg/week) * 52 * EF(kg CO2e/kWh)
    private float waste;
    //use(litres/day) * 365 * EF(kg CO2e/kWh)
    private float water;

    @Override
    public double getCarbonFootprint() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}