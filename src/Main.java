import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);			// creating scanner
		System.out.print("Enter Data to find mode: ");
		String user_data = scanner.nextLine();				// getting input
		// using split function, so we can get array without prompting user to Enter the length of array
		String[] data = user_data.split(" ");
		Arrays.sort(data);
		// converting String type array into Integer type, so that we can use it as integers otherwise these are ASCII
		int[] Int_data = new int[data.length];
		for (int i= 0; i<data.length; i++) {
			Int_data[i] = Integer.parseInt(data[i]);
		}
		int current_count = 1;							// Initializing necessary variables
		int max_count = 0;
		int mode = Int_data[0];
		for(int i = 1; i < Int_data.length; i++){		// counting frequency using each number in array
			if (Int_data[i] == Int_data[i-1] ){
				current_count ++;
			} else {
				if (current_count > max_count){
					max_count = current_count;
					mode = Int_data[i - 1];
				}
				current_count = 1;
			}
		}
		System.out.println("The Mode is: " + mode);		// printing mode
	}
}