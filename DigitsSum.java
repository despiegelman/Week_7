import java.util.*;
public class DigitsSum {
    public static void main(String[]args){
        int originalInteger;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        originalInteger = input.nextInt();
        input.close();
        while (originalInteger > 0){
            sum += originalInteger % 10;
            originalInteger = (originalInteger - originalInteger % 10)/10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}