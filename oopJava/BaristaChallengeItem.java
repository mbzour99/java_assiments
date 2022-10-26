import java.util.ArrayList;
public class BaristaChallengeItem{
private String name;
private double price;
private int index;
public  BaristaChallengeItem(){
    this("default item",12.5);
}
public int getItemIndex(){
return this.index;
}
public void setItemIndex(int index){
this.index=index;
}
public BaristaChallengeItem(String name, double price){
    this.name=name;
    this.price=price;
}
public BaristaChallengeItem(String name, double price,int index){
    this.name=name;
    this.price=price;
    this.index =index;
}
public void setName(String name){
this.name=name;
}
public String getName(){
    return this.name;
}
public void setPrice(double price){
    this.price=price;
}
public double  getPrice(){
    return this.price;
}
}