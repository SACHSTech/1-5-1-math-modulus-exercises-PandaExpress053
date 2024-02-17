class Cos3rd extends ConsoleProgram {

  /**
  * Cos3rd.java that lets you enter two sides of a triangle and the contained 
  * angle, and that will use the cosine law to calculate and print the third side
  * @author: E. Fung
  */


  public void run() {

    //Initialization
    double dblSideA, dblSideB, dblAngC, dblSideC;

    //input
    dblSideA = readDouble(("Please input side length A: "));
    dblSideB = readDouble(("Please input side length B: "));
    dblAngC = readDouble(("Please input angle C: "));

    //Conversion and Calculation
    dblAngC = (dblAngC * Math.PI) / 180;
    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - (2 * dblSideA * dblSideB * Math.cos(dblAngC)));

    //Output
    System.out.println("The length of side length C is: " + dblSideC);
  }
}