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
public void displayMenu(){
for(int i=0; i<this.menu.size();i++){
    BaristaChallengeItem BC=menu.get(i);
    System.out.println(BC.itemIndex+"  "+BC.name+"  -- $"+BC.price);
}

}


}