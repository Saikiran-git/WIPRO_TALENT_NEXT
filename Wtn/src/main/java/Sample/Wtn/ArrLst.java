//Array list basics and problems / applications

package Sample.Wtn;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrLst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>(n);
		for(int i = 0; i < n; i++) {
			int z = sc.nextInt();
			al.add(z);
		}
		Collections.sort(al);
		for (int i : al){
		      System.out.println(i);
		}
		sc.close();
	}
}
