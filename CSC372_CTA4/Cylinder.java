package CSC372_CTA4;

public class Cylinder extends Shape {

    //Radius (double), height (double)
    Double cylinderRadius = 10.00;
    Double cylinderHeight = 10.00;

    //Power variables
    int squaredPower = 2;

    //Calculate Surface area
    @Override
    double surface_area() {
        double cylinderArea = (2 * Math.PI * cylinderRadius * cylinderHeight) + (2 * Math.PI * (Math.pow(cylinderRadius, squaredPower)));
        return cylinderArea;
    }
    
    //Calculate Volume
    @Override
    double volume() {
        double cylinderVolume = Math.PI * (Math.pow(cylinderRadius, squaredPower) * cylinderHeight);
        return cylinderVolume;
    }

    //Parameterized constructor
    Cylinder(double cylinderRadius, double cylinderHeight) {
        this.cylinderRadius = cylinderRadius;
        this.cylinderHeight = cylinderHeight;
    }

    //toString, print surface area and volume
    public String toString() {
        
        //Converting double, surface area and volume, to a string
        String cylinderAreaString = Double.toString(this.surface_area());
        String cylinderVolumeString = Double.toString(this.volume());

        //Printing the stringified surface area and volume
        System.out.println("Cylinder Surface Area: " + cylinderAreaString);
        System.out.println("Cylinder Volume: " + cylinderVolumeString);

        return super.toString();
    }
}
