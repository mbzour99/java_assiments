import java.util.ArrayList;
public class BaristaChallengeOrder{
private String name;
private double total;
private boolean ready;
private ArrayList<BaristaChallengeItem> items;
public static int x=0;
public BaristaChallengeOrder(String name,double total, boolean ready, ArrayList<Item> items){
    this.name=name;
    this.total=total;
    this.ready=ready;
    // this.items=items;
    this.items=new ArrayList<BaristaChallengeItem>();
    items.add(new BaristaChallengeItem());
}
public BaristaChallengeOrder(String name){
this.name=name;
x+=1;
}
public BaristaChallengeOrder(){
    this("default order",0.00,true,null);
}
public void  setName(String name){
    this.name=name;
}
public String getName(){
    return this.name;
}
public void  setTotal(double total){
    this.total=total;
}
public double getTotal(){
    return this.total;
}
public void setItems(ArrayList<BaristaChallengeItem> items){
    this.items=items;
}
public ArrayList<BaristaChallengeItem> getItems(){
return this.items;
}


public void addItem(BaristaChallengeItem newItem){
    this.items.add(newItem);

}

public String getStatusMessage(){
    if(this.ready){
        System.out.println("Your order is ready");
        return "Your order is ready";
    }
    else{
    System.out.println("Thank you for waiting. Your order will be ready soon."); 
    return "Thank you for waiting. Your order will be ready soon."; 
    }

}
public void display(){
    // double sumPreice=0.00;
    System.out.println("  Customer Name: "+this.name);
    for(int i=0; i<items.size();i++){
        BaristaChallengeItem thisitem=items.get(i);
        System.out.println(thisitem.getName()+" - $"+thisitem.getPrice());
        // sumPreice+=thisitem.price;
    }
    // System.out.println("Total: "+sumPreice);
    System.out.println("Total: "+getOrderTotal());

}
public double getOrderTotal(){
    double sumPreice=0.00;
    for(int i=0; i<this.items.size();i++){
        BaristaChallengeItem thisitem=items.get(i);
       sumPreice+=thisitem.getPrice();
    }
    return sumPreice;
}
// public static void main(String []args){


// }
}

