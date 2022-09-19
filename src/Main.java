import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter high:");
        int high = scan.nextInt();
        System.out.println("Enter low:");
        int low = scan.nextInt();

        //solution:
        /*
        2 even:
        10, 2
        3 5 7 9
        10 - 2 = 8
        8/2 = 4

        1 odd 1 even:
        11, 2
        3 5 7 9 11
        11 - 2 = 9
        9/2 = 4
        +1 = 5

        1 even 1 odd
        12, 3
        3 5 7 9 11
        12 - 3 = 9
        9/2 = 4
        +1 = 5

        2 odd:
        11, 3
        11 - 3 = 8
        3 5 7 9 11
        8/2 = 4
        +1 = 5
         */

        if (high % 2 == 0 && low % 2 == 0){
            System.out.println((high-low)/2);
        }
        else {
            System.out.println((high-low)/2 +1);
        }

    }
}