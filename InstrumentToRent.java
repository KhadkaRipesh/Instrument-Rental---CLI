/**
 * This coursework is based on Java.
 * This class is the subclass of this coursework.
 * This class is the sub class of Instrument.
 * 
 * @author (Yubraj Khadka)
 */
//Instrument class inherited by InstrumentToRent
public class InstrumentToRent extends Instrument{
    //instance variables.
    private int chargePerday;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    /**
     * creating constructor.
     */
    public InstrumentToRent(String instrumentName, int chargePerday){
        //passing the value in super class using super key
        super(instrumentName);
        this.chargePerday=chargePerday;
        this.dateOfRent="";
        this.dateOfReturn="";
        this.noOfDays=0;
        this.isRented=false;
    }
    /**
     * creating setter methods
     * set values in instance varibales from parameter
     */
    public void setChargePerday(int chargePerDay){
        this.chargePerday=chargePerDay;
    }
    public void setDateOfRent(String dateOfRent){
        this.dateOfRent=dateOfRent;
    }
    public void setDateOfReturn(String dateOfReturn){
        this.dateOfReturn=dateOfReturn;
    }
    public void setNoOfDays(int noOfDays){
        this.noOfDays=noOfDays;
    }
    public void setIsRented(boolean isRented){
        this.isRented=isRented;
    }
    public String getDateOfRent(){
         return this.dateOfRent;
    }
    public int getChargePerday(){
        return this.chargePerday;
    }
    /**
     * creating getter methods.
     * returns values from instance variables
     */
    public String getDateOfReturn(){
        return this.dateOfReturn;
    }
    public int getNoOfDays(){
         return this.noOfDays;
    }
    public boolean getIsRented(){
         return this.isRented;
    }
    /**
     * creating rent method.
     */
    public void rent(String customerName,String customerMobileNumber,int customerPAN,String rentedDate,String returnedDate, int noOfRentedDays){
        if(isRented==true) {
            System.out.println("Already Rented by "+super.getCustomerName());
            System.out.println("Contact: "+super.getCustomerMobileNumber());
        }
        else {
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPAN(customerPAN);
            this.noOfDays=noOfRentedDays;
            this.dateOfRent=rentedDate;
            this.dateOfReturn=returnedDate;
            this.isRented=true;
            System.out.println("Instrument Rented Successfully");
            System.out.println("Rented By: "+customerName);
            System.out.println(" Customer Mobile Number: "+customerMobileNumber);
            System.out.println("Date Of Renting: "+rentedDate);
            System.out.println("No of Rented Days: "+noOfRentedDays);
            System.out.println("Total Charge: "+chargePerday*noOfRentedDays);
            System.out.println("Return Date: "+returnedDate);
        }
    }
    /**
     * creating returnInstrument method.
     */
    public void returnInstrument(){
        if(isRented==false) {
            System.out.println("The Instrument is not rented");
        }
        else {
            this.setCustomerName("");
            this.setCustomerMobileNumber("");
            this.setCustomerPAN(0);
            this.setDateOfReturn("");
            this.setDateOfRent("");
            this.setNoOfDays(0);
            this.setIsRented(false);
        }
    }
    /**
     * creating display method.
     */
    public void display(){
        super.display();
        if(isRented==true) {
            System.out.println("Instrument already Rented.");
            System.out.println("Rented By: "+super.getCustomerName());
            System.out.println("Contact: "+super.getCustomerMobileNumber());
            System.out.println("Rented date: "+getDateOfRent());
            System.out.println("Return date: "+getDateOfReturn());
        }
    }
}