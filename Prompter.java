import java.util.*;
public class Prompter {
    public static void main(String[]args){
        double num1;
        double num2;
        double num3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = input.nextDouble();
        System.out.print("Enter a greater number: ");
        num2 = input.nextDouble();
        num3 = num1;
        while(num3 <= num1 || num3 >= num2){
            System.out.print("Enter a number in between the previous numbers: ");
            num3 = input.nextDouble();
        }
        input.close();
    }
}
