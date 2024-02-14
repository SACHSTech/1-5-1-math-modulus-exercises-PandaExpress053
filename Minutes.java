class Minutes extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // initializing variables
    int intMins;
    int intDays,intHours;

    //input 
    intMins = readInt("Please enter number of minuts: ");

    //calculation
    intDays = intMins/1440;
    intHours = (intMins%1440)/60;
    intMins = (intMins%1440)%60;

    //output
    System.out.println("This converts to " + intDays + " days, " + intHours + " hours, and " + intMins + " minutes");
    
  }
}
