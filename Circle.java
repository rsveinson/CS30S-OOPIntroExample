    
/********************************************************************
 * Programmer:  sveinson
 * Class:  CS30S
 *
 * Assignment: Circle OOP Example
 *
 * Description: Circle class, radius, and methods to get and set the radius
 *              as well as the dimension of the circle
 ***********************************************************************/

// import libraries as needed here

public class Circle {
    //*** Class Variables ***
    
    /* this static variable is shared by all instances
     * of the Cirle class. If one Circle object changes its value
     * it, the value, changes for all Cirlce objects.
     */
    public static int nextID = 1000;
    final double PI = 3.14159;      // could also use Math.PI()
    
    //*** Instance Variables ***
    
    private int id = 0;
    private double radius = 0.0; 
    
    //*** Constructors ***
    // default/no-argument constructor
    public Circle(){
        id = nextID++;
        radius = 0;
    } //end default constructor
    
    public Circle(double radius){
        id = nextID++;
        this.radius = radius;
    }// end full-arg constructor
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    public double getRadius(){
        return radius;
    }// end get radius

    public int getID(){
        return id;
    }// end getid
    
    // calculate and return the area of the circle
    public double getArea(){
      double a;
      
      a = radius * radius * PI;
      
      return a;
    }// end getArea
    
    // calculate and return the diameter of the circle
    public double getDiameter(){
        return radius * 2;
    } // end getrDiameter
    
    //*** Setters ***
    public void setRadius(double r){
        radius = r;
    }// end set radius
    
    // ***** other methods ****
    public void printCircleDetails(){
        System.out.println("Circle ID: " + getID());
        System.out.println("Radius = " + getRadius());
        System.out.println("Area = " + getArea());
        System.out.println("Diameter = " + getDiameter());
    }// end print deatils
    
    /*****************************************
    * Description: override toString() to 
    *               print the circle's radius
    * 
    * Interface:
    * 
    * @return       String  the circle's radius and associate
    *               label
    * ****************************************/
    @Override
    public String toString(){
        String st;
        st = "Circle ID: "+ getID();
        st += "Radius: " + radius;
        return st;
    }// end toSTring
} // end of public class
