import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int age = 0;
        System.out.print("Enter your age to determine if you can get a wristband: ");
        age = in.nextInt();

        if (age >= 21)
        {
            System.out.println("You get a wristband! Your age is: " + age);
        }
        else if (age < 21)
        {
            System.out.println("You cannot get a wristband. Your age is: " + age + " You must be 21. ");
        }
    }
}