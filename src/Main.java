/**
 * Created by Юрий on 09.06.2016.
 */
public class Main {
    public static void main (String[] args) {
        MathOperations math = new MathOperations();
        int max = math.max (35, 1, 21);
        System.out.println("max = " + max + "\n");


        int sum = math.sum(new int [10]);
        System.out.println("\n" + "sum = " + sum + "\n");

        int avr = math.avr(new int [10]);
        System.out.println("\n" + "avr = " + avr + "\n");

        int factorial = math.factorial(6);
        System.out.println("\n" + "factorial = " + factorial + "\n");

        int fibonacci = math.fibonacci(4);
        System.out.println("\n" + "fibonacci = " + fibonacci + "\n");

        int [] sortAscending = math.sort(new int [10], true);
        System.out.print("sort ascending: ");
        for (int i=0;i<sortAscending.length;i++)
            System.out.print(sortAscending[i] + " ");
        int [] sortDescending = math.sort(new int [10], false);
        System.out.print("\nsort descending: ");
        for (int i=0;i<sortDescending.length;i++)
            System.out.print(sortDescending[i] + " ");
    }
}
