package CSC372_CTA4;

public class Sphere extends Shape {

    //Radius
    Double sphereRadius = 10.00;

    //Power variables
    int squaredPower = 2;
    int cubedPower = 3;

    //Inherited abstract class, used to calculate sphere surface area
    @Override
    double surface_area() {
        double sphereArea = 4.00 * Math.PI * (Math.pow(sphereRadius, squaredPower));
        return sphereArea;
    }
    
    //Inherited abstract class, used to calculate sphere volume
    @Override
    double volume() {
        double sphereVolume = (4.00/3.00) * Math.PI * (Math.pow(sphereRadius, cubedPower));
        return sphereVolume;
    }

    //Parameterized Constructor
    Sphere(double sphereRadius) {
        this.sphereRadius = sphereRadius;
    }

    //toString(), print surface area and volume
    public String toString() {

        //Converting double, surface area and volume, to a string
        String sphereAreaString = Double.toString(this.surface_area());
        String sphereVolumeString = Double.toString(this.volume());

        //Printing the stringified surface area and volume
        System.out.println("Sphere Surface Area: " + sphereAreaString);
        System.out.println("Sphere Volume: " + sphereVolumeString);

        //Using super to call a string back from the parent class, Shape
        return super.toString();
    }
}

// Sphere temp = new Sphere(15.0);
// temp.radius;