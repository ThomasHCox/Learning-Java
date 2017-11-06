import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lessonOne();
		// lessonTwo();
//		 lessonThree();
		// lessonFour();
		// lessonFive();
		// lessonSix();
		// lessonSeven();
		// lessonEight();
		projectTest();
		
		
		// To be done separately
		// Create a command line based employee directory for the people we work with
		// Dev team, QA, product, and Project
		// ArrayList to be preloaded in memory called iEmployee.  All teams will be on the one list
		// iEmployee will have some methods that are common to employees.  Name, title. 
		// getTasks will print that employees role
		// Program can take 3 commands. Instructions tell you how to use the program.  
		// List out the entire directory, by listing names.
		// Get the info by passing a name
		// Add or remove a person
		// Sort by last name
		// Any time a user enters a command, they should be prompted to enter another command after the output
		// Due in two weeks
		
		
	}

	public static void projectTest() {
		
	}
	
	public static void lessonEight() {
		HashMap<String, String> myHashMap = new HashMap();
		myHashMap.put("name", "Thomas Cox");
		myHashMap.put("job title", "QA Manager");
		myHashMap.put("distance","15 ");
		myHashMap.merge("distance", " miles", String::concat);
		myHashMap.put("totalhikes","120");
		System.out.println(myHashMap.get("name"));
		myHashMap.putIfAbsent("totalhikes", "500");
//		myHashMap.remove("distance");
		Set<String> mySet = myHashMap.keySet();
		for (String myString: mySet){
			System.out.println(myHashMap.get(myString));
		}
		
		
		
		LinkedHashMap<String, String> myLinkedHashMap = new LinkedHashMap();
		myLinkedHashMap.put("name", "Thomas Cox");
		myLinkedHashMap.put("job title", "QA Manager");
		myLinkedHashMap.put("distance","15 ");
		myLinkedHashMap.merge("distance", " miles", String::concat);
		myLinkedHashMap.put("totalhikes","120");
		mySet = myLinkedHashMap.keySet();
		for (String myString: mySet){
			System.out.println(myLinkedHashMap.get(myString));
		}
		
		
		
	}
	
	public static void lessonSeven() {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("when");
		myArrayList.add("in");
		myArrayList.add("the");
		myArrayList.add("course");
		myArrayList.add("of");
		myArrayList.add("human");
		myArrayList.add("events");
		ArrayList<String> myArrayList2 = new ArrayList<String>();
		myArrayList2.add("it");
		myArrayList2.add("becomes");
		myArrayList2.add("necessary");
		myArrayList2.add("for");
		myArrayList2.add("the");

		myArrayList.addAll(myArrayList2);

		Collections.sort(myArrayList);
		int i;
		for (i = 0; i < myArrayList.size(); i++) {
			System.out.println(myArrayList.get(i));
		}

		int[] arr = { 1, 34, 3, 5, 144, 13, 21, 8, 55, 89, 1, 233, 2, 377 };
		arr = bubblesorting(arr);

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		};
		
		String[] myArray;
		
		myArray = myArrayList.toArray(new String[myArrayList.size()]);
		
	}

	public static int[] bubblesorting(int[] myArray) {
		boolean bSwap;
		int j;
		int replace;
		do {
			bSwap = false;
			for (int i = 0; i < (myArray.length - 1); i++) {
				j = i + 1;
				if (myArray[i] > myArray[j]) {
					bSwap = true;
					replace = myArray[j];
					myArray[j] = myArray[i];
					myArray[i] = replace;
				}
			}
		} while (bSwap);
		return myArray;
	}

	public static void lessonSix() {
		int[] arr = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377 };
		System.out.println("The position is "
				+ LinearSearch.myLinearSearch(arr, 55));
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("When");
		myArrayList.add("in");
		myArrayList.add("the");
		myArrayList.add("course");
		myArrayList.add("of");
		myArrayList.add("human");
		myArrayList.add("events");
		ArrayList<String> myArrayList2 = new ArrayList<String>();
		myArrayList2.add("it");
		myArrayList2.add("becomes");
		myArrayList2.add("necessary");
		myArrayList2.add("for");
		myArrayList2.add("the");

		myArrayList.addAll(myArrayList2);
		System.out.println(myArrayList.indexOf("necessary"));

		System.out.println(myArrayList.indexOf("the"));
		System.out.println(myArrayList.lastIndexOf("the"));

		// searchArray = new LinearSearch(arr, 55);

		LinkedList<String> myLinkedList = new LinkedList<String>();
		myLinkedList.add("Value 1");
		myLinkedList.add("Value 2");
		myLinkedList.add("Value 3");
		myLinkedList.add("Value 4");
		LinkedList<String> myLinkedList2 = new LinkedList<String>();
		myLinkedList2.add("Value 5");
		myLinkedList2.add("Value 6");
		myLinkedList2.add("Value 7");
		myLinkedList2.add("Value 8");
		myLinkedList2.add("Value 2");
		myLinkedList.addAll(myLinkedList2);
		System.out.println(myLinkedList.indexOf("Value 1"));

		System.out.println(myLinkedList.indexOf("Value 2"));
		System.out.println(myLinkedList.lastIndexOf("Value 2"));

		// searchArray = new LinearSearch(arr, 56);

		// Implement this with a linked list
		// Also look up binary search
	}

	public static void lessonFive() {
		StackImplementationDynamic stack = new StackImplementationDynamic(5);
		stack.push(3);
		stack.push(14);
		stack.push(15);
		stack.push(92);
		stack.pop();
		stack.pop();
		stack.push(13);
		stack.push(21);
		stack.push(34);
		stack.push(55);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("The top value is " + stack.peek());
		stack.pop();
		stack.pop();
	}

	public static void lessonFour() {
		Alarm alarm = new Alarm(new IAlarmEvent() {
			@Override
			public void fireAlarm() {
				System.out.println("BUZZZZ");
			}

			@Override
			public void snooze() {
				System.out.println("Ok, I'll wake you up in 5 minutes");
			}
		});

		alarm.startCountdown();
		alarm.notNow();
		// IAlarmEvent needs to have a snooze event
		// The snooze event should inform the user that it will snooze for five
		// minutes.

	}

	public static void lessonThree() {

		Rectangle rectangle1 = new Rectangle(10, 5);
		ThreeDimensionalRectangle thrdRectangle1 = new ThreeDimensionalRectangle(
				10, 20, 30);

		// System.out.println("The volume of the 3d rectangle is "+
		// thrdRectangle1.getVolume());
		printShapeArea(rectangle1);
		printShapeArea(thrdRectangle1);
		// Work together and come up with a second interface that both your
		// rectangle and 3-d rectangle will implement
		// Make them implement it and print out the results
		rectangle1.setColor("Green");
		thrdRectangle1.setColor("Blue");
		printColorInfo(rectangle1);
		printColorInfo(thrdRectangle1);
	}

	public static void printShapeArea(IShape shape) {
		System.out.println("The surface area of the " + shape.getName()
				+ " is " + shape.getSurfaceArea() + " "
				+ shape.getSurfaceAreaUnitOfMeasure());
	}

	public static void printColorInfo(IColor color) {
		System.out.println("The color is " + color.getColor() + ".");
	}

	public static void lessonTwo() {
		Rectangle rectangle1 = new Rectangle(10, 5);
		Rectangle rectangle2 = new Rectangle(20, 8);

		System.out.println(rectangle1.getLength());
		rectangle1.setLength(20);
		System.out.println(rectangle1.getLength());

		System.out.println("The area of your rectangle is "
				+ rectangle1.getSurfaceArea());

		/* Create a second rectangle and print out which one has the larger area */
		rectangleComparison(rectangle1.getSurfaceArea(),
				rectangle2.getSurfaceArea());

	}

	public static void lessonOne() {
		int value1 = 3;
		int comparison1 = 10;
		int value2 = 3;
		int comparison2 = 100;
		int value3 = 3;
		int comparison3 = 1;

		comparison(value1, comparison1);
		comparison(value2, comparison2);
		comparison(value3, comparison3);

		int[] looping = new int[10];
		looping[0] = 3;
		looping[1] = 14;
		looping[2] = 15;
		looping[3] = 9;
		looping[4] = 26;
		looping[5] = 25;
		looping[6] = 29;
		looping[7] = 42;
		looping[8] = 266;
		looping[9] = 1;

		// for (lowest bound; highest bound; amount to increase by)
		for (int i = 0; i < (looping.length); i++) {
			System.out.println("This value is  " + looping[i]);

		}

	}

	public static void rectangleComparison(int rectangle1, int rectangle2) {
		if (rectangle1 < rectangle2) {
			System.out
					.println("The second rectangle passed has the larger area");
		} else if (rectangle1 > rectangle2) {
			System.out
					.println("The first rectangle passed has the larger area");
		} else {
			System.out.println("These are the same");
		}
	}

	public static void comparison(int value1, int comparison1) {
		if (value1 < comparison1) {
			System.out.println(value1 + " is less than " + comparison1);
			System.out.println("The difference between them is "
					+ (value1 - comparison1));
			System.out.println("The absolute value difference between them is "
					+ (comparison1 - value1));
		} else if (value1 > comparison1) {
			System.out.println(value1 + " is greater than " + comparison1);
			System.out.println("The difference between them is "
					+ (value1 - comparison1));
			System.out.println("The absolute value difference between them is "
					+ (value1 - comparison1));
		}
	}

}
