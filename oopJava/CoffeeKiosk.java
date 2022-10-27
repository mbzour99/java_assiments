import java.util.*;

public class CoffeeKiosk{
private ArrayList<BaristaChallengeItem> menu;
private ArrayList<BaristaChallengeOrder> orders;
private int itemIndex=0;
public CoffeeKiosk(){
    this.menu=new ArrayList<BaristaChallengeItem>();
    this.orders=new ArrayList<BaristaChallengeOrder>();

}
public void addMenuItem(){
    Scanner myscan = new Scanner(System.in);
    System.out.println("plese enter the item name");
    String itemName=myscan.nextLine();
       System.out.println("Please Enter the price for this item");
       double p=myscan.nextDouble(); 
       this.itemIndex+=1;
       this.menu.add(new BaristaChallengeItem(itemName,p,this.itemIndex));
       
}
double sumi=0.00;
public void displayMenu(){
    
for(int i=0; i<this.menu.size();i++){
    BaristaChallengeItem BC=menu.get(i);
    System.out.println(BC.itemIndex+"  "+BC.name+"  -- $"+BC.price);
   sumi+=BC.price;
}
}
    public void newOrder() {
        Scanner myscan = new Scanner(System.in);
        System.out.println("Please enter customer name for new order:");
        String orderName=myscan.nextLine();
    
        BaristaChallengeOrder newOrder =new BaristaChallengeOrder(orderName);
        this.orders.add(newOrder);
        displayMenu();

    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        int itemNumber = myscan.nextInt();
        
        while(!itemNumber.equals("q")) {
            BaristaChallengeItem it=this.menu.get(itemNumber);
            BaristaChallengeOrder op=new BaristaChallengeOrder("oredre");
            op.items.add(it);

            // Get the item object from the menu, and add the item to the order
            this.orders.add(op);
            // this.orders.add(new BaristaChallengeOrder(it));
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
        }}
        public void printme(){
            displayMenu();
            System.out.println("total"+sumi);
        }
        
        public static void main(String[] args){
           newOrder(); 
        }
    }




