import java.util.Scanner;

class Program4 {
    public static void main(String[] args){
        Scanner survey = new Scanner(System.in);
        
        System.out.println("Enter four three-digit numbers...");
        int num1 = survey.nextInt();
        int num2 = survey.nextInt();
        int num3 = survey.nextInt();
        int num4 = survey.nextInt();
        System.out.println(); // blanks line between input and output
        
        int sum = num1 + num2 + num3 + num4;
        double avg = (double)sum / 4;
        
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println(); //blank line between outpots
        System.out.println("The average of the four numbers is " + avg);
    }
}
