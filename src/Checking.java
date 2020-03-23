import java.util.*;

/**
 *
 * @author adferrebee
 */
public class Checking extends Account {
    private double fees;
    private double newBalance;
    private double eomBalance;
//no arg constructor    
    public Checking(){
    }
//full constructor    
    public Checking(int accountNumber, double balance,int customerNumber, String customerName, String customerAddress,
            String customerPhone){
        super(accountNumber,balance,customerNumber,customerName,customerAddress,customerPhone);
    }
    
    public double getFee(){
        return this.fees;
    }
    

    public double calcFees(){
        if(super.getNumOfTransactions()<= 2){
            this.fees = 0.0;
        }
        else this.fees = (super.getNumOfTransactions() - 2)* 3.00;
            return this.fees;
    }
    public double makeWithdrawal(double withdrawalAmt){
        if (withdrawalAmt <= super.getBal()){
            newBalance = super.getBal() - withdrawalAmt;
        }
        super.setBal(newBalance);
        return newBalance;
    }
    
    public double calulateEomBalance(){
        eomBalance = super.getBal() - calcFees();
        return eomBalance;
    }
    
    @Override
       public String toString(){
           String ckAcct;
           ckAcct = "Account number" + super.getAcctNum() + "\nDate Opened: " +super.getOpened() + "\nCustomer Number: " + super.getCustNum() + "\nCustomer Name: " + super.getCustName() + 
                   "\nCustomer Address: " + super.getCustAddy() + "\nCustomer Phone: " + super.getCustPhone() + "\nBalance: " + super.getBal() + "\nFees: " + this.fees;
           String formattedCkAcctString = String.format("Account number: %s \nDate Opened: %s \nCustomer Number: %s \nCustomer Name: %s \nCustomer Address: %s \nCustomer Phone: %s\nBalance: $%.2f \nFees: $%.2f",
                   super.getAcctNum(), super.getOpened(), super.getCustNum(), super.getCustName(), super.getCustAddy(), super.getCustPhone(), super.getBal(), fees);
                      
           return formattedCkAcctString;
       }

}
