package week4;

public class Week4 {

	public static void main(String[] args) {
		
	// Question 1 create an array called ages
		
	int[] ages = {3, 9, 23, 64, 8, 28, 93};
	
	//call a method to subtract the first element in an array from the last element
	
	firstLast(ages[0], ages[ages.length-1]);
	
	// create a new array with 9 elements and repeat the same method
	
	int[]agesNew = {2,4,7,5,8,54,45,21,33};
	
	firstLast(agesNew[0], agesNew[agesNew.length -1]);
	
	// use a method to find the average of all the elements in an array
	
	averageAge(ages);
	
	
	//Question 2 create an array of names
	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	// calculate the average number of letters per name
	
	nameAverage(names);
	
	// concatenate the names in an array with spaces in between
	
	nameCon(names);
	
	
	//Question 3 How do you access the last element in an Array?
	
	  System.out.println("Question 3: You can access the last element of an array with  array[array.length - 1]; ");
	  
	
	//Question 4 How do you acces the first element of an Array?
	  
	  System.out.println("Question 4: You can access the first element of an array with array[0];");
	  
	
	//Question 5 Create a new array filled with the lengths of the strings in the name array
	
	  int[] lengthArray = new int[6];
	  
	  
	  //This method populates the array, and prints each element to the console to demonstrate
	  
	  System.out.println("Question 5: The new array holds the following elements: ");
	  
	  lengthArrayMaker(names, lengthArray);
	
	  
	//Question 6 calculate the sum of all the elements in the array
	
	System.out.println("Question 6: The sum of the elements in lengthArray is: " + arrSum(lengthArray));
	
	
	
	//Question 7 Write a method that takes a string and a number and concatenates the word to itself x number of times
	
	System.out.println("Question 7: Your new word is:" + wordCon("Goodbye", 3));
	
	
	//Question 8 Write a method that takes 2 strings, firstName and lastName, and returns a full name
	
	System.out.println("Question 8: " + fullName("John", "Smith"));
	
	
	//Question 9 Write a method that takes an array of int and returns true the sum of the elements is over 100
	
	System.out.println("Question 9:" + hundred(ages));
	
	
	//Question 10 Write a method that takes an Array of double and returns the average of all the elements in the array
	
	double[] doubleArray = {23,12,45,76,43,21};
	
	double[] doubleArray2 = {50,46,86,79,96,68.9};
	
	System.out.println("Question 10: " + doubleAv(doubleArray));
	System.out.println("Question 10: " + doubleAv(doubleArray2));
	
	
	//Question 11 determine if the first arrays average is higher than the second arrays average
	
	System.out.println("Question 11: " + compDubs(doubleArray, doubleArray2));
	System.out.println("Question 11: " + compDubs(doubleArray2, doubleArray));
	
	
	//Question 12 write a method that returns true if isHotOutside and moneyInPocket > 10.50
	
	System.out.println("Question 12:" + willBuyDrink(true, 12.23));
	
	
	//Question 13 a method that takes chance of rain, average temperature, and if you work tommorow, to determine whether or not you go camping
	
	System.out.println("Question 13:" + willGoHiking(0, 75, false));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	//METHODS BELOW
	
	 //this method programmatically subtracts the first element from the last element in an array
	
	public static void firstLast(int age1, int ageLast) {
		
		int firstLast = ageLast - age1;
		System.out.println("Question 1: The first element of this array subtracted from the last element is: " + firstLast);
	}
	
	
	//this method finds the average of all of the numbers in an array
	
	public static void averageAge(int[] ageArray) {
		
		int sum = 0;
		
		for(int  i = 0; i < ageArray.length; i++) {
			sum += ageArray[i];
		}
		
		int average = sum / ageArray.length;
		
		System.out.println("Question 1: The average of all the numbers in this array is: " + average);

		
	}
	
	//this method finds the average number of letters per string in an array
	
	public static void nameAverage(String[] nameArray) {
		
		double nameSum = 0;
		
		for(int i = 0; i < nameArray.length; i++) {
			int nameLength = nameArray[i].length();
			nameSum += nameLength;;
		}
		
		double nameAverage = nameSum / nameArray.length;
		
		System.out.println("Question 2: The average length of the names in this array is: " + nameAverage);
	}
	
	//this method concatenates the strings in an array with a space between
	
	public static void nameCon(String[] nameArray) {
		
		String nameCombo = String.join(" ", nameArray);
		System.out.println("Question 2: " + nameCombo);
	}
	
	// this method fills an array with the lengths of the strings in a different array
	
	public static int[] lengthArrayMaker(String[] stringArray, int[] lengthsArray ) {
		
		for(int i = 0; i < stringArray.length; i++) {
			lengthsArray[i] = stringArray[i].length();
			System.out.println(lengthsArray[i]);
		}
		return lengthsArray;
	}
	
	// calculate the sum of the elements in an array
	
	public static int arrSum(int[] intArr) {
		int sum = 0;
		for(int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		return sum;
	}
	
	// concatenate a word to itself x number of times
	
	public static String wordCon(String word, int n) {
		String newWord = " ";
		for(int i = 0; i < n; i++) {
			newWord += word; 
		}
		return newWord;
	}
	
	//concatenate a full name
	
	public static String fullName(String first, String last) {
		return first + " " + last;
	
	}
	
	//find out if sum of arrays is greater than 100
	
	public static boolean hundred(int[] arraynum) {
		int sum = 0;
		for(int i = 0; i < arraynum.length; i++) {
			sum += arraynum[i];
		}
		return sum > 100;
	}
	
	// return the average of all the elements in an array of doubles
	
	public static double doubleAv(double[] doubleA) {
		double sum = 0;
		for(int i =0; i < doubleA.length; i++) {
			sum += doubleA[i];
		}
		return sum / doubleA.length;
	}
	
	// compare the averages of two double arrays
	
	public static boolean compDubs(double[] a, double[] b) {
		return doubleAv(a) > doubleAv(b);
	}
	
	// return true if its hot out and you have at least 10.50
	
	public static boolean willBuyDrink( boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket >= 10.50;
	}
	
	//
	
	public static boolean willGoHiking(int chanceOfRain, int aveTemp, boolean workTommorow) {
		return chanceOfRain < 20 && aveTemp > 60 && aveTemp < 95 && !workTommorow;
	}
	
	
	
		
		

}


