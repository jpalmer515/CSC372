package CSC372_CTA4;

public class Cone  extends Shape {
    
    //Radius (double), height (double)
    Double coneRadius = 0.00;
    Double coneHeight = 0.00;

    //Power variables
    int squaredPower = 2;

    //Calculate Surface area
    @Override
    double surface_area() {
        double coneArea = (Math.PI * coneRadius) * (coneRadius + Math.sqrt((Math.pow(coneHeight, squaredPower)) + (Math.pow(coneRadius, squaredPower))));
        return coneArea;
    }
    
    //Calculate Volume
    @Override
    double volume() {
        double coneVolume = Math.PI * (Math.pow(coneRadius, squaredPower) * (coneHeight / 3.00));
        return coneVolume;
    }

    //Parameterized constructor
    Cone(double coneRadius, double coneHeight) {
        this.coneRadius = coneRadius;
        this.coneHeight = coneHeight;
    }

    //toString, print surface area and volume
    public String toString() {

        //Converting double, surface area and volume, to a string
        String coneAreaString = Double.toString(this.surface_area());
        String coneVolumeString = Double.toString(this.volume());

        //Printing the stringified surface area and volume
        System.out.println("Cone Surface Area: " + coneAreaString);
        System.out.println("Cone Volume: " + coneVolumeString);

        return super.toString();
    }
}
