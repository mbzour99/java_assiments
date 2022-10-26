public class BankAccount{
    private double checkingbalance;
    private double  savingsbalance;
    private static int theNumberOfAccounts=0;
    private static double amount=0.00;

public BankAccount(){
  this.theNumberOfAccounts+=1;  
}
// Create a getter method for the user's checking account balance.
public double getCheckingBalance(){
    return this.checkingbalance;
}
// Create a getter method for the user's saving account balance.
public double getSavingsBalance(){
    return this.savingsbalance;
}
// Create a method that will allow a user to deposit money into 
// either the checking or saving, be sure to add to total amount stored.
public void depositMony(double amount,boolean choice){
if(choice){
   this.checkingbalance+=amount; 
}else{
    this.savingsbalance+=amount;
}
System.out.println("This amount of mony addes sucessfuly");

}

// Create a method to withdraw money from one balance.
//  Do not allow them to withdraw money if there are insufficient funds.
public boolean withdrawMony(double amount){
    if(this.savingsbalance-amount<10){
        System.out.println("Your account not has mony  more!! Try again");
        return false;
    }
    this.savingsbalance-=amount;
    System.out.println("Now your account is :"+this.savingsbalance);
    return true;
}
// Create a method to see the total money from the checking and saving.
public void showMoreDetailes(){
    System.out.println("The checkingbalance account is :"+this.checkingbalance);
    System.out.println("The savingsbalance  account is :"+this.savingsbalance);
}

public static int showNumOfAccounts(){
    return theNumberOfAccounts;
}
public static double showMonyInAccount(){
    return amount;
}
public static void main(String [] args){
System.out.println("Welcome every one");
}

}

