class Km_to_Miles extends ConsoleProgram {

  /**
  *  Km_to_Miles.java lets you enter a distance in kilometers and that converts it into miles
  * @author: E. Fung
  */
  
  public void run() {
    //Variables
    double dblKm, dblMi;

    //Input
    dblKm = readDouble("Please enter distance in kilometres: ");

    //Calculation
    dblMi = dblKm * 0.621371;

    //Output
    System.out.println(dblKm + " kilometres converts to " + dblMi + " miles");
    
  }
}
