 /********************************************************************
 * Programmer:  sveinson
 * Class:  CS20S
 *
 * Assignment: Circle ArrayList Example
 *
 * Description: using an arraylist to keep multiple circle objects
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;
 import java.util.ArrayList;

public class CirclesDriverV2 {  // begin class
    
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
        
        double rad = 0.0;       // temporary radius
        
        ArrayList<Circle> circles = new ArrayList<>();
        
    // ***** create objects *******
    
        //DecimalFormat df1 = new DecimalFormat("##.###");
    
    // the ProgramInfo class has both a default and initialized constructor
    // so you can choose which model you want to employ
    
        //ProgramInfo programInfo = new ProgramInfo();
        ProgramInfo programInfo = new ProgramInfo("Circle ArrayList Example");
        
        BufferedReader fin = new BufferedReader(new FileReader("circData.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
        
    // ********** Print output Banner **********

        //System.out.println(programInfo.getBanner("A1Q2"));
        //fout.println(programInfo.getBanner("A1Q2"));

        System.out.println(programInfo.getBanner());
        //fout.println(programInfo.getBanner());
            
    // ************************ get input **********************

    // ************************ processing ***************************
        // example: adding an existing Circle object to the arraylist
        Circle c = new Circle(2.1);
        circles.add(c);                  // add the object to the al
        
        // access individual arraylist elements
        System.out.println("Circle 1: " + circles.get(0));
        
        
        strin = fin.readLine();
        
        while(strin != null){
            //System.out.println(strin);
            rad = Double.parseDouble(strin);
            circles.add(new Circle(rad));
            
            strin = fin.readLine();
        }// end eof loop
        

    // ************************ print output ****************************
    
       //System.out.println(circles);
       // for(int i = 0; i < circles.size(); i++){
           // System.out.println("Circle " + (i + 1) + ":" );
           // System.out.format("Radius: %7.2f %s", circles.get(i).getRadius(), nl);
           // System.out.format("Area: %7.2f %s", circles.get(i).getArea(), nl);
           // System.out.format("Diameter: %7.2f %s", circles.get(i).getDiameter(), nl);
           // System.out.println();
        // }// end for print circles
        
        //introducing the for each loop
        for(Circle cl: circles){
           System.out.println("Circle :" );
           System.out.format("Radius: %7.2f %s", cl.getRadius(), nl);
           System.out.format("Area: %7.2f %s", cl.getArea(), nl);
           System.out.format("Diameter: %7.2f %s", cl.getDiameter(), nl);
           System.out.println();            
        }// end for each loop
    
    // ******** closing message *********
        
        System.out.println(programInfo.getClosingMessage());
        //fout.println(programInfo.getClosingMessage());
        
    // ***** close streams *****
        
        fin.close();                // close input buffer stream
        //fout.close();               // close output stream
        
    }  // end main
}  // end class
