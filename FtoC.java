class FtoC extends ConsoleProgram {

  /**
  * FtoC.java lets you enter a degree measure in Fahrenheit, 
  * and that prints the result in celsius degree measure
  * @author: E. Fung
  */
  
  public void run() {
    
    //Variables
    double dblFarenheitDegs, dblCelsiusDegs;

    //Input
    dblFarenheitDegs = readDouble("Please enter Farenheit degrees: ");

    //Calculation
    dblCelsiusDegs = (5.0/9.0) * (dblFarenheitDegs - 32);

    //Output
    System.out.println(dblFarenheitDegs + " degrees Farenheit converts to " + dblCelsiusDegs + " degrees Celsius");
    
  }
}