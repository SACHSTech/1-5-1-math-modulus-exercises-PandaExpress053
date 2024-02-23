class Power extends ConsoleProgram {

  /**
  * Power.java lets you enter two numbers a,b, and that prints out a^b
  * @author: E. Fung
  */
  
  public void run() {
    // Variables
    double dblBase, dblExponenet, dblAns;

    // Input
    dblBase = readDouble("Please enter base value: ");
    dblExponenet = readDouble("Please enter exponenet value: ");

    // Calculation
    dblAns = Math.pow(dblBase, dblExponenet);    

    // Output
    System.out.println(dblBase + " to the power of " + dblExponenet + " equals " + dblAns);
    
    
  }
}