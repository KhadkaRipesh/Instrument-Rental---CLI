/**
 * This coursework is based on Java Programming.
 * This is the super class.
 * This class is the super class of two subclasses InstrumentToRent and InstrumentToSell.
 * 
 * @author (Ripesh Khadka)
 */
public class Instrument{
    //instance 
    private static int instrumentID;
    private String instrumentName;
    private String customerName;
    private String customerMobileNumber;
    private int customerPAN;
    /**
     * Constructor created
     * @params instrumentName
     */
    public Instrument(String instrumentName){
        instrumentID +=1;
        this.instrumentName=instrumentName;
        this.customerMobileNumber="";
        this.customerName="";
        this.customerPAN=0;
    }
     /**
     * creating setter methods.
     * set values in instance varibales from parameter
     */ 
        public void setInstrumentID(int instrumentID){
            this.instrumentID=instrumentID;
        }
        public void setInstrumentName(String instrumentName){
            this.instrumentName=instrumentName;
        }
        public void setCustomerName(String customerName){
            this.customerName=customerName;
        }
        public void setCustomerPAN(int customerPAN){
            this.customerPAN=customerPAN;
        }
        public void setCustomerMobileNumber(String customerMobileNumber){
            this.customerMobileNumber=customerMobileNumber;
        }
     /**
     * creating getter methods.
     * returns values from instance variables
     */
        public int getInstrumentID(){
            return this.instrumentID;
        }
        public String getInstrumentName(){
            return this.instrumentName;
        }
        public String getCustomerName(){
            return this.customerName;
        }
        public String getCustomerMobileNumber(){
            return this.customerMobileNumber;
        }
        public int getCustomerPAN(){
            return this.customerPAN;
        }
        public void display(){
            System.out.println("Instrument Id: "+instrumentID);
            System.out.println("Name of Instrument: "+this.instrumentName);
                if(!customerName.equals("") && customerPAN!=(0) && !customerMobileNumber.equals("")) {
                System.out.println("Customer name: "+this.customerName);
                System.out.println("Mobile no.:"+this.customerMobileNumber);
                System.out.println("Customer PAN:"+this.customerPAN);
                }
        }
    }
