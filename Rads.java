class Rads extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // initialize variables
    double dblRads,dblDegs;

    //input
    dblDegs = readDouble("Please enter Degrees: ");
    
    //conversion
    dblRads = (dblDegs * Math.PI) / 180;

    //output
    System.out.println("This is conversion in Radians: " + dblRads);

  }
}