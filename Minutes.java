class Minutes extends ConsoleProgram {

  /**
  * Minutes.java lets you enter a number of minutes, and that will 
  * calculate the number of days, hours and minutes that represents.
  * @author: E. Fung
  */
  
  public void run() {
    // initializing variables
    int intMins;
    int intDays;
    int intHours;

    // input 
    intMins = readInt("Please enter number of minutes: ");

    // calculation
    intDays = intMins / 1440;
    intHours = (intMins % 1440) / 60;
    intMins = (intMins % 1440) % 60;

    // output
    System.out.println("This converts to " + intDays + " days, " + intHours + " hours, and " + intMins + " minutes");
    
  }
}
