package VehiclePackage;

/**
 * Created by jennasowers on 9/12/16.
 */
public class UseVehicle {
    public static void main(String[] args)
    {
        Vehicle[] v = {new Car(), new Car(), new Truck(), new Truck()};

        String mk = "Honda";
        String mod = "Accord";
        int yr = 2012;
        boolean fW = false;
        double rtP = 12_999.99;
        double mpg = 32.5;
        boolean conv = true;
        Car one = (Car) v[0];
        one.setVehicle(mk, mod, yr, fW, rtP, mpg, conv);

        mk = "Nissan";
        mod = "Altima";
        yr = 2015;
        fW = false;
        rtP = 15_999.99;
        mpg = 28.4;
        conv = false;
        Car two = (Car) v[1];
        two.setVehicle(mk, mod, yr, fW, rtP, mpg, conv);

        mk = "Ford";
        mod = "Ranger";
        yr = 2008;
        fW = true;
        rtP = 7_599.99;
        mpg = 19.8;
        boolean sS = true;
        int tC = 1500;
        Truck three = (Truck) v[2];
        three.setVehicle(mk, mod, yr, fW, rtP, mpg, sS, tC);

        mk = "Toyota";
        mod = "Tacoma";
        yr = 1998;
        fW = false;
        rtP = 1_599.99;
        mpg = 18.0;
        sS = false;
        tC = 800;
        Truck four = (Truck) v[3];
        four.setVehicle(mk, mod, yr, fW, rtP, mpg, sS, tC);

        Inventory inv = new Inventory();
        for (int i = 0; i < v.length; i++)
            inv.add(v[i]);

        System.out.println("CHEAPEST VEHICLE:");
        Vehicle c = inv.findCheapestVehicle();
        System.out.println(c.getMake() + " " + c.getModel());
        System.out.println("");
        System.out.println("MOST EXPENSIVE VEHICLE:");
        c = inv.findMostExpensiveVehicle();
        System.out.println(c.getMake() + " " + c.getModel());
        System.out.println("");
        System.out.println("AVERAGE VEHICLE PRICE:");
        inv.printAveragePriceOfAllVehicles();

    }
}
