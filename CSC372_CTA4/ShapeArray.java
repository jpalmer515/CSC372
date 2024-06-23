package CSC372_CTA4;

public class ShapeArray {
    
    //Instantiate one sphere
    Sphere newSphere = new Sphere(6.00);

    //Instantiate one cylinder
    Cylinder newCylinder = new Cylinder(7.00, 7.50);

    //Instantiate one cone
    Cone newCone = new Cone(8.00, 8.50);

    //Store class instances in array, "shapeArray"
    public void main(String[] args) {

        //Instantiating an array for class Shape, to hold the shape objects
        Shape[] shapeArray = {newSphere, newCylinder, newCone};

        //Loop through and print an instance of each object (sphere, cylinder, cone)
        for (int i = 0; i < shapeArray.length; i++) {
            System.out.println(shapeArray[i]);
        }

    }
}
