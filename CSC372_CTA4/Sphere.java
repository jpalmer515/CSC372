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
    public static void main(String[] args) {
        Sphere newSphere = new Sphere();
    }

    //toString(), print surface area and volume
}
