package VehiclePackage;
import java.lang.System.*;
import java.text.DecimalFormat;
/**
 * Created by jennasowers on 9/12/16.
 */
public class Vehicle {
    private
    String make;
    String model;
    int year;
    boolean fourWheel;
    double retailPrice;
    double milesPerGallon;

    public Vehicle()
    {
        this.make = "";
        this.model = "";
        this.year = 1900;
        this.fourWheel = false;
        this.retailPrice = 0.00;
        this. milesPerGallon = 0.0;
    }
    public void setVehicle(String mk, String mod, int yr, boolean fW, double rtP, double mpg)
    {
//        DecimalFormat formatter = new DecimalFormat("#0.00"); //string format for two decimal places
//        String toString = Double.toString(rtP); //turn double to string
//        String stringFormatted = formatter.format(toString); //format the string
//        rtP = Double.parseDouble(stringFormatted);//turn back to double

        this.make = mk;
        this.model = mod;
        this.year = yr;
        this.fourWheel = fW;
        this.retailPrice = rtP;
        this.milesPerGallon = mpg;
    }
    public String getMake()
    {
        return this.make;
    }
    public String getModel()
    {
        return this.model;
    }
    public int getYear()
    {
        return this.year;
    }
    public boolean getFourWheel()
    {
        return this.fourWheel;
    }
    public double getRetailPrice()
    {
        return this.retailPrice;
    }
    public double getMilesPerGallon()
    {
        return this.milesPerGallon;
    }
    public String toString()
    {
        return String.format(" Make: " + this.getMake() + " %n " +
                "Model: " + this.getModel() + " %n " +
                "Year: " + this.getYear() + " %n " +
                "Four Wheel: " + this.getFourWheel() + " %n " +
                "Retail Price: " + this.getRetailPrice() + " %n " +
                "Miles Per Gallon: " + this.getMilesPerGallon() + " %n"
        );

    }


}
