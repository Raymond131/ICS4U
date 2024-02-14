//q1
//Raymond Wu
import java.util.Scanner;
import java.lang.StringBuilder; //to use the reverse method

public class Main{
  public static void main(String[] args){
    StringBuilder input1 = new StringBuilder();  //initialize new stringbuilder 
    //object
    Scanner sc = new Scanner(System.in);         //initialize scanner
    System.out.println("Enter a word: ");      //prompt
    String word = sc.nextLine();                 //get input
    input1.append(word);                         //append input to stringbuilder
    //for use later
    int len = word.length();                     //get word length
    System.out.println(word+word.charAt(0));     //first line: word + first letter
    for(int i = 1; i < len; i++){     //building the middle
      System.out.println(word.charAt(len-i)+" ".repeat(len-1)+word.charAt(i));
      //left side is in reverse order, with spaces sandwiched in between
    }
    System.out.println(word.substring(0,1) + input1.reverse());
    //last line: first letter + reverse of word
  }
}