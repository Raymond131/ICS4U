//q2
//Raymond Wu
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    //initialize scanner
    System.out.println("Give data:");       //prompt
    String data = sc.nextLine();            //get the code into a string
    char lastLetter = data.charAt(0);       //get the first letter
    int count = 0;                          //count the occurences of each repeated letter
    String result = "";                     //final result code

    for(int i = 0; i < data.length(); i++){ //loop through the code
      if(data.charAt(i) == lastLetter){     //if the current letter is the same as the last
        count ++;                           //add to the count
      }else{
        result += Integer.toString(count) + lastLetter;  //if not, that means letters
        //switched. add count to the result, along with the last letter
        lastLetter = data.charAt(i);                     //update the last letter
        count = 1;                                      //reset count
        //System.out.println("looping " +result); visualization line during debug
        }
      if(i == data.length()-1){                        //if the last letter is reached
        result += Integer.toString(count)+lastLetter;  //add the last letter and count
      }
    }
    System.out.println(result);                        //print the result  
  }
}