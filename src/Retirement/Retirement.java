package Retirement;
import java.util.*;

/**
 * Ten program demonstruje sposób użycia pętli <code>while</code>.
 * This program demonstrates how to use loops <code>while</code>.
 * @author Tomek
 *
 */
public class Retirement
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //Wczytywanie danych
        //Loading data
        Scanner in = new Scanner(System.in);

        System.out.print("Ile pieniędzy potrzebujesz, aby przejść na emeryturę? ");
        double goal = in.nextDouble();

        System.out.print("Ile pieniędzy rocznie będziesz wpłacać? ");
        double payment = in.nextDouble();

        System.out.print("Stopa procentowa w %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        //Aktualizacja salda konta, jeśli cel nie został osiągnięty.
        //Update account balance if goal was not met.
        while (balance < goal)
        {
            //Dodanie tegorocznych płatności i odsetek.
            //Add this year's payments and interest.
            balance += payment; //inaczej/otherwise => balance = balance + payment
            double interest = balance * interestRate / 100;
            balance += interest; //inaczej/otherwise => balance = balance + interest
            years++;
        }

        System.out.println("Możesz przejść na emeryturę za " + years + "lat.");
    }
}
