class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // declare variables
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