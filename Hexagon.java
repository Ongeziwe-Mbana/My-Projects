import java.util.Scanner;

public class Hexagon {
    public static void main(String[]args){
        // instantiates a Scanner object
        Scanner sc = new Scanner(System.in);
        // prompts the user for input
        System.out.println("Enter the hexagon's side length");
        //declares a variable that reads in a line of keyboard input.
        int s = sc.nextInt();
        /* add your code below this line */
        double area = ((3*(Math.sqrt(3) )/2))* Math.pow(s,2);

        /* add your code above this line */
        System.out.println(area);
    }

}
