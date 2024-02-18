class Hours extends ConsoleProgram {

  /**
  * Hours.java lets you enter a number of hours, and 
  * converts it to days and hours11
  * @author: E. Fung
  */
  
  public void run() {
    // initializing variables
    int intDays;
    int intHours;

    //input 
    intHours = readInt("Please enter number of hours: ");

    //calculation
    intDays = intHours / 24;
    intHours = intHours % 24;

    //output
    System.out.println("This converts to " + intDays + " days, and " + intHours + " hours");
    
    
  }
}