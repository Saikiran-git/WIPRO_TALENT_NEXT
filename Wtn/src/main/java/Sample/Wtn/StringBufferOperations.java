package Sample.Wtn;

import java.util.Scanner;

public class StringBufferOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		// append() method concatenates the given argument with this string.
		// return type is string
		sb.append(sc.nextLine());
		// without scanning we can append as
		// sb.append("Hello");
		System.out.println(sb);
		
		
		// insert() method inserts the given string with this string at the given position.
		// return type is string
		sb.insert(3,  sc.nextLine());
		System.out.println(sb);
		
		// length() method returns number of characters present in that stringBuffer
		// return type is integer
		System.out.println(sb.length());
		
		// replace() method replaces the given string from the specified beginIndex and endIndex
		// return type is string
		sb.replace(0, 3, sc.nextLine());
		System.out.println(sb);
		
		// delete() method of stringBuffer class deletes the string from the specified index to the 
		// end index
		// return type is string
		sb.delete(0, 3);
		System.out.println(sb);
		
		// reverse() method of the stringBuilder class reverses the current string
		// return type is the string
		sb.reverse();
		System.out.println(sb);
		
		// capacity() method returns the current capacity of the buffer i.e the storage of the stringBuffer
		// return type is integer
		System.out.println(sb.capacity()); // this displays us the capacity of the current string
		sb.append("this is ASK");
		System.out.println(sb.capacity()); // this displays us the new capacity of the string after 
										   // the new string is getting appended
		
		// ensureCapacity() method of stringBuffer class ensures that the given capacity is minimum
		// to the current capacity, if the capacity is greater than the current capacity then it increases
		// the capacity by (oldCapacity * 2) + 2.
		// return type is the integer
		sb.ensureCapacity(17); // we gave capacity more than the originalCapacity(16) so nothing changes
		sb.ensureCapacity(10); // the sb capacity is 16 and i have less than 16
		System.out.println(sb.capacity()); // here the formulae gets applied
		
		// setCharAt() method helps us to set the character at an index to 'z' or any character
		// return type is string
		sb.setCharAt(sb.length() - 1, 'z');
		
		// deleteCharAt() method helps us to delete the character at the given index position
		// return type is string
		sb.deleteCharAt(sb.length() - 1);
		
		// returns the subsequence of that string buffer specified in the given start and end index
		// return type is the string
		sb.subSequence(0, 3);
				
		sc.close();
	}

}
