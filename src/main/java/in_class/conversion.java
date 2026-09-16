package in_class;

import java.util.Scanner

public class conversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        System.out.print("Enter a number (-1 to stop");
        number = input.nextInt();

        while (number != -1) {
            sum = sum + number;
            count++;

            System.out.print("Enter a number (-1 to stop): ");
            number = input.nextInt();
        }

        System.out.println("Sum: " + sum);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        }

        input.close();
    }
}
