/*
Create an ArrayList that can hold Integers, and fill each slot with a different random value from 1-50.
Display those values on the screen, and then prompt the user for an integer. Search through the ArrayList,
and if the item is present, say so. It is not necessary to display anything if the value was not found.
If the item is in the ArrayList multiple times, it's okay if the program prints the message more than once.

ArrayList: [45, 39, 32, 12, 44, 50, 26, 42, 16, 20]
Value to find: 42

42 is in the ArrayList.


ArrayList: [45, 39, 32, 12, 44, 50, 26, 42, 16, 20]
Value to find: 43



ArrayList: [24, 30, 31, 24, 32, 33, 34, 24, 35, 36]
Value to find: 24

24 is in the ArrayList.
24 is in the ArrayList.
24 is in the ArrayList.

Bonus: Only display one message. Either: # was not found or # was found 5 times. (Or however many times that it occurs)
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindValArrayList {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> intList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int userInt;
        int count = 0;

        for(int i = 0; i < 10; i++)
            intList.add(rand.nextInt(50)+1); // range 1-50

        System.out.println("ArrayList: " + intList.toString());
        System.out.print("Value to find: ");
        userInt = sc.nextInt();

        // Before Bonus
        if(intList.contains(userInt))
            System.out.println(userInt + " is in the ArrayList.");

        //Bonus
        for(Integer i : intList) // going through list to count number of userInts
            if (i == userInt)
                count++;

            if(count == 0)
                System.out.println(userInt + " was not found");
            else
                System.out.println(userInt + " was found " + count + " times.");
    }
}
