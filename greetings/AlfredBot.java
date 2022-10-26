import java.util.Date;
public class AlfredBot{
    
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
    
        return "Wellcome "+name;
    }
    
    public String dateAnnouncement() {
        java.util.Date date=new java.util.Date();  
        return " date announcement is "+date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis")!=-1){
          return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(conversation.indexOf("Alfred")!=-1){
        return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire." ;
    }

// public static void main(String [] args){
// // System.out.println("my name is mohammd al bzour ");

// }
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

