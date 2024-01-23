/**
 * This coursework is based on Java.
 * This class is the subclass of this coursework.
 * 
 * @author (Ripesh Khadka)
 */
//Instrument class inherited by InstrumentToSell
public class InstrumentToSell extends Instrument{
    //instance variables.
    private int price;
    private String sellDate;
    private int discountPercent;
    private boolean isSold;
    /**
     * construtor of InstrumentToSell class.
     */
    public InstrumentToSell(String instrumentName,int price){
        super(instrumentName);
        this.price=price;
        this.sellDate="";
        this.discountPercent=0;
        this.isSold=false;
    }
    /**
     * creating setter methods.
     * set values in instance varibales
     */
    public void setPrice(int price){
    if(isSold==false) {
            this.price=price;
        }
        else {
            System.out.println("The instrument is already sold.");
        }
    }
    public void setSellDate(String sellDate){
        this.sellDate=sellDate;
    }
    public void setDiscountPercent(int discountPercent){
        this.discountPercent=discountPercent;
    }
    public void setIsSold(boolean isSold){
        this.isSold=isSold;
    }
    /**
     * creating getter methods.
     * returns values from instance variables
     */
    public int getPrice(){
        return this.price;
    }
    public String getSellDate(){
        return this.sellDate;
    }
    public int getDiscountPercent(){
        return this.discountPercent;
    }
    public boolean getIsSold(){
        return this.isSold;
    }
    public void sellInstrument(String customerName, String customerMobileNumber, int customerPAN, String sellDate,int discountPercent){
        if(isSold==true) {
            System.out.println("Instrument sold to: "+customerName);
            System.out.println("Customer PAN number: "+customerPAN);
            System.out.println("Contact number: "+customerMobileNumber);

        }
        else {
            super.setCustomerName(customerName);
            super.setCustomerMobileNumber(customerMobileNumber);
            super.setCustomerPAN(customerPAN);
            this.sellDate=sellDate;
            this.discountPercent=discountPercent;
            this.price=price-(price*discountPercent/100);
            this.isSold=true;
        }
    }
   // creating display method.
    public void display(){
        super.display();
        System.out.println("Instrument Price: "+this.price);
        if(isSold==true) {
            System.out.println("Instrument sold to: "+super.getCustomerName());
            System.out.println("Sell Date: "+this.sellDate);
        }
    }
}
