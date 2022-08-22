import java.util.*;

public class ExistInArray {
    // Program that requests a user input and checks to see if an Array has said input in it
    public static void main(String[] args) {
        // Initialise variables
        int numbers[] = new int[10];
        int userNum;
        Random rand = new Random(); // Random number generator
        Scanner scan = new Scanner(System.in);  //Scanner

        // This loop fills the array with random variables from 0 to 20
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(0, 20);
            System.out.print(numbers[i] + "  ");
        }
        // Take the user input
        System.out.println();
        System.out.print("Please enter an integer between 0 and 20: ");
        userNum = scan.nextInt();
        // Loop that does a simple search to see if any of the values in the array match with the user input
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == userNum) {
                System.out.println("Value " + userNum + " was found in array");
                break;
            }
            else if (numbers[i] != userNum && i == (numbers.length - 1))
                System.out.println("Value was not found in Array");
        }
    }
}
