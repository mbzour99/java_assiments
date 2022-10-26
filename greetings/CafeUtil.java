import java.util.ArrayList;

public class CafeUtil{
    // private numWeeks;
    int count=0;
public int getStreakGoal(){
    int sum=0;
for(int i=1;i<=10;i++){
    sum+=i;
}
//  count+=1;
//  return count;
return sum;
}
public double getOrderTotal(double[] prices){
    double sum=0.0;
    for(int i=0;i<prices.length;i++){
        sum+=prices[i];
    }
    return sum;
}
public void displayMenu(ArrayList<String> menuItems){
      for (int i = 0; i < menuItems.size(); i++) {
      System.out.println(i+"  "+menuItems.get(i));
    }
}
public void addCustomer(ArrayList<String>customesArray){
    System.out.println("Please enter your name:");
    String userName = System.console().readLine();
    System.out.println("Hello    "+userName);
    System.out.println("There are "+customesArray.size() +" people in front of you");
    customesArray.add(userName); 

}
}
