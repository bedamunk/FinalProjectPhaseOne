
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adferrebee
 */
public class Gold extends Account {

//Instance variables
    private double interestRate = .05;
    private double newBalance;
    private double eomBalance;
    private double eomInterest;
            
//No arg constructor    
    public Gold (){
    }
        
//Constructor with arguments
    public Gold (int accountNumber, double balance,int customerNumber, String customerName, String customerAddress,
            String customerPhone){
         super(accountNumber,balance,customerNumber,customerName,customerAddress,customerPhone);
    }

//getters

    public double getinterestRate(){
        return interestRate;
    }

    public double makeWithdrawal(double withdrawalAmt){
        if (withdrawalAmt <= super.getBal()){
            this.newBalance = super.getBal() - withdrawalAmt;
        }
        super.setBal(this.newBalance);
        return this.newBalance;
    }    

    public double calculateEomInterest(){
        this.eomInterest = (interestRate/12) * super.getBal();
        return this.eomInterest;
    } 
    
    public double calculateEomBalance(){
        this.eomBalance = super.getBal() + this.eomInterest;
        return this.eomBalance;
    }

    @Override
       public String toString(){
           String goldAcct;
           goldAcct = "Account number" + super.getAcctNum() + "\nDate Opened: " +super.getOpened() + "\nCustomer Number: " + super.getCustNum() + "\nCustomer Name: " + super.getCustName() + 
                   "\nCustomer Address: " + super.getCustAddy() + "\nCustomer Phone: " + super.getCustPhone() + "\nBalance: " + super.getBal() +  "\nInterest Rate: " + this.interestRate;
            return String.format("Account number: %s \nDate Opened: %s \nCustomer Number: %s \nCustomer Name: %s \nCustomer Address: %s \nCustomer Phone: %s\nBalance: $%.2f \nFees: $%.2f",
                    super.getAcctNum(), super.getOpened(), super.getCustNum(), super.getCustName(), super.getCustAddy(), super.getCustPhone(), super.getBal(), this.interestRate);
            
       }
    }    
