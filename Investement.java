import java.text.NumberFormat;
public class Investement {
    public static void main(String[]args){
        double investement = 2500;
        int years = 0;
        while (investement < 5000){
            investement *= 1.075;
            years += 1;
        }
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("After " + years + " years, you have " + money.format(investement));
    }
}