import java.text.NumberFormat;
public class Investment {
    public static void main(String[]args){
        double investment = 2500;
        int years = 0;
        while (investment < 5000){
            investment *= 1.075;
            years += 1;
        }
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("After " + years + " years, you have " + money.format(investment));
    }
}