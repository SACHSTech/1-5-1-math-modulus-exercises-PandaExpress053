class AreaSin extends ConsoleProgram {

  /**
  * AreaSin.java uses the Math.sin() function to print and calculate 
  * the area of a triangle, given two sides and the contained angle
  * @author: E. Fung
  */
  
  public void run() {
    
    // Initialization
    double dblSideA, dblSideB, dblAngC, dblArea;

    // input
    dblSideA = readDouble(("Please input side length A: "));
    dblSideB = readDouble(("Please input side length B: "));
    dblAngC = readDouble(("Please input angle C: "));
    
    // Conversion and Calculation
    dblAngC = (dblAngC * Math.PI) / 180;
    dblArea = (dblSideA * dblSideB * Math.sin(dblAngC)) / 2;

    // Output
    System.out.println("The area of the triangle is: " + dblArea + " units squared");
    
    
  }
}