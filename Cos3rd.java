class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  

  public void run() {

    //Initialization
    double sideA, sideB, angC, sideC;

    //input
    sideA = readDouble(("Please input side length A: "));
    sideB = readDouble(("Please input side length B: "));
    angC = readDouble(("Please input angle C: "));

    //Calculation
    angC = (angC * Math.PI) / 180;
    sideC = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - (2 * sideA * sideB * Math.cos(angC)));

    //Output
    System.out.println("The length of side length C is: " + sideC);
  }
}