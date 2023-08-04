import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the grade of course1 ");
        double course1 = read.nextDouble();
        System.out.println("Enter the grade of course2 ");
        double course2 = read.nextDouble();
        System.out.println("Enter the grade of course3 ");
        double course3 = read.nextDouble();
        System.out.println("Enter the grade of course4 ");
        double course4 = read.nextDouble();
        System.out.println("Enter the grade of course5 ");
        double course5 = read.nextDouble();

        double grade;
        grade = (course1 + course2 + course3 + course4 + course5)/5;

        if(grade >= 90 && grade <= 100){
            System.out.println("Your grade is A");
        }else if(grade >=80 && grade < 90){
            System.out.println("Your grade is B");
        } else if (grade >= 70 && grade <80) {
            System.out.println("Your grade is C");
        }else if(grade > 50 && grade <70){
            System.out.println("Your grade is D");
        }else {
            System.out.println("Yau ae failed");
        }

    }
}