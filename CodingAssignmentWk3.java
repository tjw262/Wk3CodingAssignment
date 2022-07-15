package codingAssignment;

import java.util.Arrays;

public class CodingAssignmentWk3 {

	public static void main(String[] args) {
		
	//1.a,b,c
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 99};
		
		System.out.println(ages[ages.length - 1] - (ages[0]));
		
		int sum = 0;
		for (int number : ages) {
			sum += number;
		}
		int averageAge = sum / ages.length;
		System.out.println(averageAge);
		
	//2.a,b
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int numberOfLetters = 0;
		for (String name : names) {
			numberOfLetters += name.length();
		}
		System.out.println(numberOfLetters / names.length);
	
		String test = "";
		for (String name : names) {
			test += name + " ";
		}
			System.out.println(test);
			
	//3. How do you access the last element of any array? 
			
			//Answer: system.out.println(name of array[length of array - 1]); since 1st position = 0
		
	//4. How do you access the first element of any array? 
			
			//Answer: system.out.println(name of array[0]);
		
	//5.
		int[] nameLengths = {31, 53, 13, 15, 14, 3};
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		
	//6.
		int sumOfAllElements = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumOfAllElements += nameLengths[i];
		}
		System.out.println(sumOfAllElements);
		
		//7. Test - Method below
				System.out.println(words("Troy", 3));
		
		//8. Test - Method below
				String firstName = "Troy";
				String lastName = "Williams";
				String fullName = createFullName(firstName, lastName);
				System.out.println(fullName);
				
		//9. Test - Method below
				int[] numSum = {15, 33, 22, 18, 20};
				System.out.println(sumOfAllIntegers(numSum));
				
		//10. Test - Method below
				double[] doubles = {55, 75, 99};
				System.out.println(findAverage(doubles));
				
		//11. Test - Method below
				double[] fractions1 = {96.2, 45.9, 22.2};
				double[] fractions2 = {77.2, 43.5, 21.2};
				System.out.println(ifFirstArrayIsGreater(fractions1, fractions2));
				
		//12. Test - Method below
				double moneyInPocket = 17.55;
				System.out.println(willBuyDrink(moneyInPocket));
				
		//13. Test - Method below
				double[] playersHeightInInches = {68.1, 75.9, 66.0, 79.1, 60.6, 77.3};
				System.out.println(getAverage(playersHeightInInches));
	}
	
	//7.
	public static String words(String word, int n) {
		String answer = "";
		for (int i = 0; i < n; i++) {
			answer += word;
		}
			return answer;
		}
	
	//8. 
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//9.
	public static boolean sumOfAllIntegers(int[] nums) {
		int sum = 0;
//		for (int i : nums) { WORKS THE SAME. KEEPING THIS FOR REFERENCE
//			sum += i;
//		}
		for (int i = 0; i < nums.length; i++) {	
			sum += nums[i];
			}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}	
	}
	
	//10.
	public static double findAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	//11. 
	public static boolean ifFirstArrayIsGreater(double[] array1, double[] array2) {
		double sum1 = 0;
		for (double x : array1) {
			sum1 += x;
		}
		double sum2 = 0;
		for (double x : array2) {
			sum2 += x;
		} if ((sum1 / array1.length) > (sum2 / array2.length)) {
			return true;
		} else {
			return false;
		}
	}
	
	//12.
	public static boolean willBuyDrink(double moneyInPockets) {
		boolean isHotOutside = true;
		double moneyInPocket = 12.2;
			if (moneyInPocket > 10.5 && isHotOutside) {
				return true;
			} else {
				return false;
		}
	}
	
//	13. Write a Method that takes an array of double and returns true if the average of all elements
//	is greater than 72
	public static boolean getAverage(double[] height) {
		double sum = 0;
		for (double inches : height) {
			sum += inches;
			} if (sum / height.length > 72) {
				return true;
			} else {
				return false;
			}
		}
		
	}