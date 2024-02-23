class Rads extends ConsoleProgram {

  /**
  * Rads.java converts degree measures to radian measures, prints conversion in radians
  * @author: E. Fung
  */

  
  public void run() {
    
    // initialize variables
    double dblRads, dblDegs;

    // input
    dblDegs = readDouble("Please enter Degrees: ");
    
    // conversion
    dblRads = (dblDegs * Math.PI) / 180;

    // output
    System.out.println( dblDegs + " degrees converts to " + Math.round(dblRads) + " radians!");

  }
}