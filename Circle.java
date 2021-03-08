    
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
    
    final double PI = 3.14159;      // could also use Math.PI()
    
    //*** Instance Variables ***
    
    private double radius = 0.0; 
    
    //*** Constructors ***
    // default/no-argument constructor
    public Circle(){
        radius = 0;
    } //end default constructor
    
    public Circle(double radius){
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
    
    //*** Setters ***
    public void setRadius(double r){
        radius = r;
    }// end set radius
    
} // end of public class
