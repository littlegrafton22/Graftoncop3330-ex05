import java.util.Scanner;
public class Assignment_1_Exercise_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();

        System.out.println(firstInt + " + " + secondInt + " = " +
                (firstInt + secondInt));

        System.out.println(firstInt + " - " + secondInt + " = " +
                (firstInt - secondInt));

        System.out.println(firstInt + " x " + secondInt + " = " +
                (firstInt * secondInt));

        System.out.println(firstInt + " / " + secondInt + " = " +
                (firstInt / secondInt));

  }
}
