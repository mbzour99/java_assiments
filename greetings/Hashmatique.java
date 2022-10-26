import java.util.*;

public class Hashmatique{

public static void main(String[] args){
HashMap<String, String> mysongs = new HashMap<String, String>();
mysongs.put("zref al tool", "ya zarref al tool wakef ta kooolek");
mysongs.put("Jafra and Haya Al-Raba", "Jafra O Halba, you came down on the eyeHer jar was silver and gold, and she carried it for decorationJafra, oh quarter, I wanted you to bury meAnd you trample on my grave, and I see beer water");
mysongs.put("mn sesionaqa telat janaji", "From Acre prison, a funeral took placeMuhammad Jamjoom and Fouad HegazyJazz them, my people, jazzyHigh Commissioner and a quarter and in generalMuhammad Jamjoom and Atta Al-ZirFouad Hegazy and Ezz El DokhairSee estimator and estimationBy the provisions of the unjust, they will execute us");
mysongs.put("Talat al parodi wel sapee ma tal", "The gunpowder was gone.. and the seven were longO Boss of gunpowder.. his blood is wet");

 Set<String> keys = mysongs.keySet();
 for(String key : keys) {
 System.out.println(key+"((::))"+mysongs.get(key));
//  System.out.println(userMap.get(key));   
}
}
}