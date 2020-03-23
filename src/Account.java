import java.util.*;

/**
 *
 * @author adferrebee
 */
public class Account {
    private int accountNumber;
    private Date dateOpened = new Date();
    private double balance;
    private int customerNumber;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private int numOfTransactions;
    
//no arg constructor    
    public Account(){
        
    }
//full constructor
    public Account(int accountNumber, double balance,int customerNumber, String customerName, String customerAddress,
            String customerPhone){
        this.accountNumber = accountNumber;
        this.dateOpened = new Date(); 
        this.balance = balance;
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
    }
//Setters    
    public void setAcctNum(int acctNum){
        this.accountNumber =  acctNum;
    }
    public void setBal(double bal){
        this.balance =  bal;
    }
    public void setCustNum(int custNum){
        this.customerNumber =  custNum;
    }
    public void setCustName(String custName){
        this.customerName = custName;
    }
    public void setCustAddy(String custAddy){
        this.customerAddress = custAddy;
    }
    public void setCustPhone(String custPhone){
        this.customerPhone = custPhone;
    }  
//Getters 
    public Date getOpened() { 
		return this.dateOpened;
        }
    public int getAcctNum(){
        return this.accountNumber;
    }
    public double getBal(){
        return this.balance;
    }
    public double getNumOfTransactions(){
        return this.numOfTransactions;
    }    
    public int getCustNum(){
        return this.customerNumber;
    }
    public String getCustName(){
        return this.customerName;
    }
    public String getCustAddy(){
        return this.customerAddress;
    }
    public String getCustPhone(){
        return this.customerPhone;
    }

//Deposit method
    public double makeDeposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        numOfTransactions = numOfTransactions + 1;
        return this.balance;
    }
//Withdraw method
    public double makewithdrawal(double withdrawalAmount){
        this.balance = this.balance - withdrawalAmount;
        numOfTransactions = numOfTransactions + 1;
        return this.balance;
    }
    
//EOM balance calculation method
    public void calcEomBalance(){
        
    }
    
        //toString    

        public String toString(){
            String acct;
            acct = ("Account number" + accountNumber + "\nDate Opened: " + dateOpened + "\nCustomer Number: " + customerNumber + "\nCustomer Name: " + customerName + 
                    "\nCustomer Address: " + customerAddress + "\nCustomer Phone: " + customerPhone + "\nBalance: " + balance);
            return String.format("Account number: %s \nDate Opened: %s \nCustomer Number: %s \nCustomer Name: %s \nCustomer Address: %s "
                    + "\nCustomer Phone: %s \nBalance: $%.2f", accountNumber, dateOpened, customerNumber, customerName, customerAddress, customerPhone, balance);
            
        }
}
