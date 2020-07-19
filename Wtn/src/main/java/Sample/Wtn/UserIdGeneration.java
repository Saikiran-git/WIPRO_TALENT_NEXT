package Sample.Wtn;

import java.util.Scanner;

public class UserIdGeneration{
    static boolean validateAlphabets(String a){
        int i;
        a = a.toLowerCase();
        for(i=0;i<a.length();i++){
            if(!(a.charAt(i)>='a'&& a.charAt(i)<='z'))
                return false;
        }
        return true;
    }
    
    //***********************************************************************************************************//
    
    /*
    Case 1: If there are any letters other than alphabet in names then print "INVALID INPUT"
    Case 2: If the pin length is not equal to six then print "INVALID PIN"
    Case 3: If the number N given is not in the range of 1..6 then print "INVALID RANGE" Let us see a few examples.
     */
    
    //***********************************************************************************************************//
    
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int pin;
        int n,i;
        String finalPin = "";
        Scanner sc = new Scanner(System.in);
        firstName = sc.next();
        lastName = sc.next();
        pin = sc.nextInt();
        n = sc.nextInt();
        sc.close();
        String pinString = Integer.toString(pin);
        String shortName, longName;
        if(!(validateAlphabets(firstName)) || !(validateAlphabets(lastName)))
            System.out.println("INVALID INPUT");
        else if(pinString.length() != 6)
            System.out.println("INVALID PIN");
        else if(n > 6 || n < 1)
            System.out.println("INVALID RANGE");
        else{
            if(firstName.length() > lastName.length()){
                longName = firstName;
                shortName = lastName;
            }
            else if(lastName.length() > firstName.length()){
                longName = lastName;
                shortName = firstName;
            }
            else{
                if(firstName.charAt(0) > lastName.charAt(0)){
                    longName = firstName;
                    shortName = lastName;
                }
                else{
                    longName = lastName;
                    shortName = firstName;
                }
            }
            if(longName.length() % 2 != 0)
                finalPin += longName.charAt((longName.length() / 2));
            else
                finalPin += longName.charAt(0);
            StringBuffer shortNameBuffer = new StringBuffer(shortName);
            if(shortName.length() % 2 == 0)
                finalPin = finalPin + shortNameBuffer.reverse();
            else
                finalPin = finalPin + shortName;
            String tempPIN = Integer.toString(pin);
            finalPin = finalPin + tempPIN.charAt(n - 1) + tempPIN.charAt(6 - n);
            //System.out.println(finalPin);
            if(finalPin.length() < 6)
                System.out.println("INVALID PIN");
            else{
                StringBuffer stringBuffer = new StringBuffer(finalPin);
                for(i = 0; i < stringBuffer.length(); i++){
                    Character character = stringBuffer.charAt(i);
                    if(Character.isUpperCase(character))
                        stringBuffer.replace(i, i + 1, Character.toLowerCase(character) + "");
                    else
                        stringBuffer.replace(i, i + 1, Character.toUpperCase(character) + "");
                }
                finalPin = new String(stringBuffer);
                System.out.println(finalPin);
            }
        }
    }
}




/*
  
 User ID Generation: Raman’s team has been assigned the task of creating userids for all participants of 
 an online gaming competition. Joseph has designed a process for generating the userid using the participant’s 
 First_Name, Last_Name, PIN code and a number N. The process defined by Raman is as below –

Step1

Compare

the lengths of First_Name and Last_Name of the participant. The one that is shorter will be called “Smaller Name” and the
 one that is longer will be called the “Longer Name”. If both First_Name and Last_Name are of equal Length, then the name 
 that appears earlier in alphabetical order will be called “Smaller Name” and the name that appears later in alphabetical order
  will be called the “Longer Name”.

Step2

The userid should be generated as below – If the length of the Longer name is odd then the Middle letter of the longer name 
else First Letter of the longer name +

If the length of the small word is even

then

Entire word of the smaller name in reverse order

else

Entire word of the smaller name in normal order

Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in the PIN when 
traversing the PIN from right to left

Step3

Toggle the alphabets of the userid generated in step2 i.e. uppercase alphabets should become lowercase and lowercase 
alphabets should become uppercase.

NOTE If there are any letters other than alphabet in names then print "INVALID INPUT"

If the pin length is not equal to six then print "INVALID PIN"

If the number N given is not in the range of 1..6 then print "INVALID RANGE" Let us see a few examples.

Example 1

If the participant’s details are as below First_Name = Rajiv Last_Name = Roy PIN = 560037 N = 6

Step1 Length of Last_Name is less than the Length of First_Name, so the Smaller Name is “Roy” and the Longer Name is “Rajiv”

Step2

The userid will be = Middle Letter of the longer name(because length is odd) + Entire word of the smaller name in the 
given order (Length is odd) + Digit at position N in the PIN when traversing the PIN from left to right + Digit at position N in 
the PIN when traversing the PIN from right to left = Middle Letter of “Rajiv” + Entire word of “Roy” + 6th Digit of 
PIN from left + 6th Digit of PIN from right = j + Roy + 7 + 5 Therefore, userid = jRoy75

Step3 Toggle the alphabets in the userid. So, userid = JrOY75

Example 2 If the participant’s details are as below First_Name = Raji Last_Name = Ro PIN = 560037 N = 6

Step1

Length of Last_Name is less than the Length of First_Name, so the Smaller Name is “Ro” and the Longer Name is “Raji”

Step2

The userid will be = First Letter of the longer name(because length is even) + Entire word of the smaller name
 in reverse order (because length is even) + Digit at position N in the PIN when traversing the PIN from 
 left to right + Digit at position N in the PIN when traversing the PIN from
  right to left = Middle Letter of “Rajiv” + Entire word of “Roy” + 6th Digit of PIN from left + 6th Digit
   of PIN from right = R + oR + 7 + 5 Therefore, userid = RoR75

Step3

Toggle the alphabets in the userid. So, userid = rOr75
   
   
Sample Input 0
Rajiv
Roy
560037
6

Sample Output 0
JrOY75
  
 */
 