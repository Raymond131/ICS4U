//q4
//Raymond Wu
import java.util.*;    //import utilities for random

public class Main{
  public static void main(String[] args){

    Random rand = new Random();      //make a new random object
    int sum = 0;                     //sum is the sum of class sizes
    int []days = new int[365];       //make an array of 365 days

    for(int i = 1; i<=10000; i++){   //repeat below for 10000 times
      int ppl = 0;                   //class size start at 0
      for(int k = 0; k < 365; k++){  //set days to 365 zeroes
        days[k] = 0;
      }
      while(true){                   //add a person to the group until 
        //2 people have the same birthday
        ppl++;                       //perform the addition
        days[rand.nextInt(365)] += 1;//that random birthday is now taken
        int found = 0;               //a flag to break out of the while loop
        for(int j = 0; j<365; j++){  //check if any dates have 2 people
          if(days[j] == 2){
            //System.out.println("same bday " + ppl);
            //the above line is for visualizing the process
            found = 1;               //if this happened, break out of the check,
            break;                   //but also set found to one,
          }
        }
        if(found == 1){break;}       //so that the while loop can break, too
      }                              //now we found a class size with a shared birthday
      sum += ppl;                    //add the class size to the sum
    }
    System.out.println(sum/10000.0); //after gathering 10000 class sizes, perform 
    //division to find the average. divide by 10000.0 to get a decimal answer
  }
}