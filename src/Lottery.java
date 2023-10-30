import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter in a two digit number: ");
        int lotto = scan.nextInt();
        int comp = (int) (Math.random() * 90) + 10;
        int oneslotto = lotto % 10;
        int tenslotto = lotto / 10;
        int compones = comp % 10;
        int comptens = comp / 10;
        if (lotto < 9 || lotto > 100)
        {
            System.out.println("Not a valid number ");
        }
        if (lotto == comp)
        {
            System.out.println("YOU GOT IT!!! \nYou win the Jackpot of $10,000");

        }
        else if (oneslotto == compones && tenslotto == comptens)
        {
            System.out.println("You got both digits correct. \nYou win $2,000 ");
        }
        else if (oneslotto == compones || oneslotto == comptens || tenslotto == compones || tenslotto == comptens)
        {
            System.out.println("You got one digit correct. \nYou win $500");
        }
        else
        {
            System.out.println("You did not win anything :)");
        }


    }
}
