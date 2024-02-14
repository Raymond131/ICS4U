//ex5
//Raymond Wu
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  //initialize a new scanner
    System.out.println("Give a code: ");
    String code = sc.nextLine();          //get the code
    boolean valid = false;                //set the flag to false

    if(code.contains(" ") && code.split(" ").length == 2){  
      //check if there is a space and if there are two parts
      valid = true;                      //if satisfied, set the flag to true
      String []code1 = code.split(" ");  //split the code into two parts
      String nums = "";                  //initialize a string to store the numbers
      int aw = 0, oue = 0, wi = 0,product = 0;    //initialize the variables for the product

      for(char letter: code1[0].toCharArray()){  //loop through the first part
        if(Character.isDigit(letter)){           //collect digits into nums
          nums += letter;
        }else if(letter<65 || letter>90){        //check if the letter is not capital
          valid = false;                         //if it's not capital, invalid
        }
      }
      if(nums.length() == 6 && valid){           //proceed if valid and there are 6 digits
        aw =  Integer.parseInt(nums.substring(0,2));
        oue = Integer.parseInt(nums.substring(2,4));
        wi =  Integer.parseInt(nums.substring(4,6));// since nums only has digits, 
        //this won't crash.
        product = aw*oue*wi;                    //calculate the product for later use
      }else{valid = false;}                    //if anything fails, set valid to false

      nums = "";                               //reset nums for use in second part

      for(char letter: code1[1].toCharArray()){  //loop through the second part
        if(letter>=48 && letter<=57){            //collect digits into nums
          nums += letter;
        }else{valid = false; break;}             //set to invalid if there's a non-digit
      }

      if( !(valid && product == Integer.parseInt(nums)) ){  //if anything fails, invalid
        valid = false;
      }
    }

    if(valid){                            //print by checking if the flag is valid in the end
      System.out.println("valid");
    }else{
      System.out.println("invalid");
    }
  }
}