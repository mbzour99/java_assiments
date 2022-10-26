import java.util.ArrayList;
// import Order,Item  from OrdersAndItems;
public class TestOrders {
    public static void main(String[] args) {
    Item item1 =new Item();
    Item item2 =new Item();
    Item item3 =new Item();
    Item item4 =new Item();
    item1.name="mocha";
    item1.price=99.99;
    item2.name="latte";
    item2.price=19.99;
    item3.name="drip coffee";
    item3.price=22.5;
    item4.name="capuccino";
    item4.price=79.99;
    Order order1=new Order();
    Order order2=new Order();
    Order order3=new Order();
    Order order4=new Order();
    order1.name="Cindhuri";
    order2.name="Jimmy";
    order3.name="Noah";
    order4.name="Sam";
     order1.items=new ArrayList<Item>();
     order2.items=new ArrayList<Item>();
     order3.items=new ArrayList<Item>();
     order4.items=new ArrayList<Item>();
    // Print the order1 variable to the console to see what happens.
       System.out.printf("Name: %s\n", order1.name);
       System.out.println(order1);
        // Menu items
       System.out.println(order1.total);

        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total+=item1.price;
        // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        // System.out.println(order4.items.get(0).name);
        // order4 added a latte. Update accordingly.
        order4.items.add(item2);
        // Cindhuri’s order is now ready. Update her status.
        order1.ready=true;
        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
double sum=0.00;
    for(int i=0; i<order1.items.size();i++){
     sum+=order1.items.get(i).price;

    }
    System.out.println("the total acount for Cindhuri is :"+sum);

    }
}
 