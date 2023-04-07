package Collection;

import java.util.ArrayList;

public class EvenNumbers {
    // instance variables to store the ArrayLists
    private ArrayList<Integer> A1;
    private ArrayList<Integer> A2;

    // method to store even numbers from 2 to N
    public ArrayList<Integer> storeEvenNumbers(int N) {
        // initialize ArrayList A1
        A1 = new ArrayList<Integer>();
        // add even numbers from 2 to N to A1
        for (int i = 2; i <= N; i += 2) {
            A1.add(i);
        }
        // return A1
        return A1;
    }

    // method to print even numbers in format 4,8,12,...2*N and store them in a new ArrayList A2
    public ArrayList<Integer> printEvenNumbers() {
        // initialize ArrayList A2
        A2 = new ArrayList<Integer>();
        // iterate through A1
        for (int num : A1) {
            // multiply each number by 2 and add to A2
            int evenNum = num * 2;
            A2.add(evenNum);
        }
        // print even numbers in the desired format
        System.out.print("Even numbers: ");
        for (int i = 0; i < A2.size(); i++) {
            System.out.print(A2.get(i));
            if (i != A2.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // return A2
        return A2;
    }

    // method to retrieve a specific even number from A1
    public int retrieveEvenNumber(int N) {
        // check if N is in A1
        if (A1.contains(N)) {
            // if yes, return N
            return N;
        } else {
            // if not, return 0
            return 0;
        }
    }

    // main method to test the class
    public static void main(String[] args) {
        // create an instance of the class
        EvenNumbers en = new EvenNumbers();
        // call storeEvenNumbers method and print the returned ArrayList
        System.out.println("A1: " + en.storeEvenNumbers(10));
        // call printEvenNumbers method and print the returned ArrayList
        System.out.println("A2: " + en.printEvenNumbers());
        // call retrieveEvenNumber method with a number that exists in A1
        System.out.println("Retrieving even number 6: " + en.retrieveEvenNumber(6));
        // call retrieveEvenNumber method with a number that does not exist in A1
        System.out.println("Retrieving even number 11: " + en.retrieveEvenNumber(11));
    }
}
