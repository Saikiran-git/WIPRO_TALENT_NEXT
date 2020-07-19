package Sample.Wtn;

import java.util.Scanner;

public class ColorCode {
  public static void main(String[] args) throws java.lang.Exception{
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    switch(ch) {
    case 'R' : System.out.println("R->Red");
        break;
    case 'B' : System.out.println("B->Blue");
        break;
    case 'G' : System.out.println("G->Green");
        break;
    case 'O' : System.out.println("O->Orange");
        break;
    case 'W' : System.out.println("W->White");
        break;
    case 'Y' :System.out.println("Y->Yellow");
        break;
    default : System.out.println("Invalid");
     }
    sc.close();
  }
}