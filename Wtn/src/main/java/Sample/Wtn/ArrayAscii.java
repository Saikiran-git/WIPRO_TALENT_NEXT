package Sample.Wtn;

public class ArrayAscii {

	public static void main(String[] args) {
		int []arr = new int[26];
		int j = 0;
		for(int i = 0; i < 26; i++) {
			arr[i] = j;
			char ch = (char) ((char) arr[i] + 65);
			System.out.print(ch);
			j++;
		}
	}

}
