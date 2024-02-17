class Circumference extends ConsoleProgram {

  /**
  * A program Circumference.java that computes the circumference 
  * of a circle given a radius from user entry, and then prints circumference
  * @author: E. Fung
  */
  
  public void run() {
    
    //declare variables
    double dblRadius;
    double dblCircumference;

    //input
    dblRadius = readDouble("Please input desired radius: ");

    //calculation
    dblCircumference = 2 * dblRadius * Math.PI;

    //output
    System.out.println("The circumference of the circle is " + dblCircumference);
  }
}