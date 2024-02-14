//q3
//Raymond Wu
import java.util.Scanner;            //import scanner

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  //initialize scanner
    System.out.println("Give point:");    //prompt
    int x = sc.nextInt();                 //get x and y for the point
    int y = sc.nextInt();
    System.out.println("Give line:");
    int x1 = sc.nextInt();                //get two points for the line
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    int bigx = Math.max(x1,x2);           //get the bigger one in x
    int smallx = Math.min(x1,x2);         //get the smaller one in x
    double slope = (y1-y)/(x1-x);         //slope of the line formed by input point 
    //and (x1,y1)
    if(slope == (y2-y1)/(x2-x1) && smallx <= x && x <= bigx ){
      System.out.println("Yes");  //if the point is on the linear function, 
      //plus within domain, it is on the line
    }else{
      System.out.println("No");   
    }

  }
}