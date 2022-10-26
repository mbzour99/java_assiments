public class CofeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String ordertag="orderd a";
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double latte=7.5;
        int cappuccino=9;
        int mycooco =4;
    // Create 3 more drink price variables, for drip coffee, latte and cappuccino 
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2="Sam"; 
        String customer3="Jimmy";
        String customer4="Noah";
        // Create 3 more customer variables for Sam, Jimmy and Noah,
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1+ordertag+"latte");
        System.out.println(generalGreeting + customer2);
        System.out.println(generalGreeting + customer3);
        System.out.println(customer3+ordertag+"cappucino");
        double samiAccount=2*latte;
        if(isReadyOrder2){
             System.out.println(customer2+ordertag+"latte");
              System.out.println("And you should get"+latte);
             System.out.println("The account for sami is "+samiAccount);
        }
        else{
           System.out.println(customer2+ordertag+"latte and the order will be ready  "); 
        }
        
// Jimmy just realized he was charged for a coffee but had ordered a latte. Print the total 
// message with the new calculated total (what he owes) to make up the difference.
System.out.println("The account for jimmy is "+latte);
    }
}
