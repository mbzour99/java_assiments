import java.util.*;
public class Exceptions{

    public static void main(String[]args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        try{
        for(int i = 0; i < myList.size(); i++) {
        Integer castedValue = (Integer) myList.get(i);

}
    }catch (Exception e) {
      System.out.println("Something went wrong.plese enter a valid inputs and try again!!!");
    }
}
}