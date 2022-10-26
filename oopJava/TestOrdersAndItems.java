public class TestOrdersAndItems{
    public static void main(String [] args){
        // Create 2 orders for unspecified guests (without specifying a name);
        BaristaChallengeOrder deforder1= new BaristaChallengeOrder();
        BaristaChallengeOrder deforder2= new BaristaChallengeOrder();
        // Create 3 orders using the overloaded constructor to give each a name for the order.
        BaristaChallengeOrder order11=new BaristaChallengeOrder("my order1");
        BaristaChallengeOrder order22=new BaristaChallengeOrder("my order2");
        BaristaChallengeOrder order33=new BaristaChallengeOrder("my order3");
        order11.addItem(new BaristaChallengeItem("my item1 for order1",19.50));
        order11.addItem(new BaristaChallengeItem("my item2 for order1",22.50));
        order22.addItem(new BaristaChallengeItem("my item1 for order2",19.50));
        order22.addItem(new BaristaChallengeItem("my item2 for order2",22.50));
        order33.addItem(new BaristaChallengeItem("my item1 for order3",19.50));
        order33.addItem(new BaristaChallengeItem("my item2 for order3",22.50));
        order33.display();


    }
}