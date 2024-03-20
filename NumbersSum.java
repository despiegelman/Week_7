import java.util.*;
public class NumbersSum {
    public static void main(String[]args){
        int sum = 0;
        int number_user;
        int number_print = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number_user = input.nextInt();
        input.close();
        while (number_print <= number_user){
            sum += number_print;
            System.out.println(number_print);
            number_print++;
        }
        System.out.println("The sum is: " + sum);
    }
}