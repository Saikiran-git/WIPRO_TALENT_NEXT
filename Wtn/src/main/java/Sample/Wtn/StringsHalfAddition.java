package Sample.Wtn;

import java.util.Scanner;

public class StringsHalfAddition{
	public static void main(String[] args) {
		String ans;
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		String[] s = new String[n];
		int[] v = new int[n];
		for(int i = 0; i < n; i++)
			s[i] = sc.next();
		sc.close();
		for(int i = 0; i < n; i++){
			int count = 0;
			for(int j = 0; j < s[i].length(); j++){
				if(s[i].charAt(j) == 'a' || s[i].charAt(j) == 'e' || s[i].charAt(j) == 'i' || s[i].charAt(j) == 'o' || s[i].charAt(j) == 'u')
					count++;
			}
			v[i] = count;
		}
		ans = findmax(v, n, s);  
		System.out.println(ans);
	}
	
	private static String findmax(int[] v, int n, String[] s) {
		int c = 0;
		String ans = "";
		int max = getmax(v);
		for(int i = 0; i < n; i++){
			if(max == v[i]){
				c++;
			}	
		}
		if(c > 1){
			for(int i = 0; i < n; i++){
				if(i % 2 == 0){
					ans += s[i].substring(0, (s[i].length() / 2) + 1);
				}
				else{
					ans += s[i].substring((s[i].length() / 2), s[i].length());
				}
			}
	    }
		return ans;
	}

	private static int getmax(int[] v) {
		int max = v[0];
		int l = v.length;
		for(int i = 1; i < l; i++){
			if(v[i] > max){
				max = v[i];
			}
		}
		return max;
	}

}