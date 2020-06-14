package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] greetings = {"hi", "hello", "hey"};
		random(greetings);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void print(String[] string) {
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void reverse(String[] string) {
		for (int i = string.length -1; i < string.length; i--) {
			System.out.println(string[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOther(String[] string) {
		for (int i = 0; i < string.length; i+=2) {
			System.out.println(string[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void random(String[] string) {
		Random rand = new Random();
		for (int i = 0; i < string.length; i += rand.nextInt(string.length)) {
			System.out.println(string[i]);
		}
	}
	
}
