/********************************************************************
 * Programmer:  sveinson
 * Class:  CS20S
 *
 * Assignment: Circle OOP Example
 * 
 * Description: some examples of using the Circle class
 *              for some simple OOP demonstrations
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;

public class CircleDriver {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********

        String strin;       // string data input from keyboard
        String strout;      // processed info string to be output
        String bannerOut;       // string to print banner to message dialogs

        String prompt;      // prompt for use in input dialogs

        String delim = "[ :]+"; // delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        // new line character for file writing
        
    // ***** create objects *******
        Circle[] circles = new Circle[10];
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(4.5);
        
        //System.out.println("c1: " + c1);
        System.out.println("c1: " + c1.getRadius());
        System.out.println("c2: " + c2.getRadius());
        //c1.radius = 3;
        c1.setRadius(3.0);
        System.out.println("c1: " + c1.getRadius());
        
        circles[0] = c1;
        circles[1] = c2;
        circles[2] = new Circle(2.1);
        
        System.out.println(circles[0].getRadius());
        
        System.out.println("Circle 1:");
        // System.out.println("Radius = " + c1.getRadius());
        // System.out.println("Area = " + c1.getArea());
        // System.out.println("Diameter = " + c1.getDiameter());
        
        /* in the Circle class there is a method called
         * printCircleDetails(), this is a utility method
         * that prints all of the details of the state of a
         * Circle object. This method is in place for convenience.
         * 
         */
        c1.printCircleDetails();
        
        for(int i = 0; i < 3; i++)
            circles[i].printCircleDetails();
        
    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        //ProgramInfo programInfo = new ProgramInfo("assignment name");
        
        //BufferedReader fin = new BufferedReader(new FileReader("demo1Data.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
    // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        //System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
            
    // ************************ get input **********************

    // ************************ processing ***************************
        // to demonstrate the toString() method we will look at the 
        // result of the following line of Java code.
        // before and after we write the toString() method in the 
        // Circle class.
        System.out.println(c2);

    // ************************ print output ****************************
    
    
    // ******** closing message *********
        
        //System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        //fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
