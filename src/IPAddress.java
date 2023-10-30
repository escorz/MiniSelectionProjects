import java.util.Scanner;

public class IPAddress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first octet: ");
        int firstOct = scan.nextInt();
        System.out.println("Please enter the second octet: ");
        int secOct = scan.nextInt();
        System.out.println("Please enter the third octet: ");
        int thirdOct = scan.nextInt();
        System.out.println("Please enter the fourth octet: ");
        int forthOct = scan.nextInt();
        boolean correct = true;

        if (firstOct > 255){
            System.out.println("Octet 1 is incorrect ");
            correct = false;
        }
        if (secOct > 255){
            System.out.println("Octet 2 is incorrect");
            correct = false;
        }
        if (thirdOct > 255){
            System.out.println("Octet 3 is incorrect");
            correct = false;
        }
        if (forthOct > 255){
            System.out.println("Octet 4 is incorrect");
            correct = false;
        }
        if (correct) {
            System.out.println("IP Address: " + firstOct + "." + secOct + "." + thirdOct + "." + forthOct);
        }
    }
}
