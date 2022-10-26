import java.util.ArrayList;
import java.util.Random;
import java.util.*;
public class Puzzling{

public int[] getTenRolls(){
int[] arr= new int[10];
// Random rand = new Random();
// int upperbound = 25;
for(int i=0;i<=9;i++){
// int myRand = rand.nextInt(20)*21;
int random_int = (int)Math.floor(Math.random()*(20)+1);
arr[i]=random_int;
}
return arr;
}
public char getRandomLetter(){
 
    char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                        'h', 'i', 'j', 'k', 'l', 'm', 'n',
                        'o', 'p', 'q', 'r', 's', 't', 'u',
                        'v', 'w', 'x', 'y', 'z' };
 
        // char res = alphabet[(int) (Math.random() * 26)];
        int index=(int) (Math.random() * 26);
        char res=alphabet[index];
    return res;

}
public String generatePassword(){
     char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                        'h', 'i', 'j', 'k', 'l', 'm', 'n',
                        'o', 'p', 'q', 'r', 's', 't', 'u',
                        'v', 'w', 'x', 'y', 'z' };
     String res = "";
    for (int i = 0; i <8; i++)
        res = res + alphabet[(int) (Math.random() * 26)];
     
    return res;
}
public String getNewPasswordSet(int n){
       char []alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
                        'h', 'i', 'j', 'k', 'l', 'm', 'n',
                        'o', 'p', 'q', 'r', 's', 't', 'u',
                        'v', 'w', 'x', 'y', 'z' };
        // char []capital=alphabet.toUppercase();
        // System.out.println(capital);
     String res = "";
    for (int i = 0; i <n; i++)
        res = res + alphabet[(int) (Math.random() * 26)];
     
    return res;  
}
public int[] shuffleArray(int [] myarr){
    int[] arr=new int[25];
    int temp=myarr[0];
        for (int i = 0; i <myarr.length; i++)
       {
        
         int va=(int) (Math.random() * myarr.length);
         if(myarr[va]==-1){
            continue;
         }
         arr[i]=myarr[va];
         myarr[va]=-1;
         
       }
     return arr;
}
}

