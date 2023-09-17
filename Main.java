import java.security.PublicKey;
import java.util.Scanner;

public class Main {
    public static int math1;
    public static int math2;
    public static int mathAVG;
    public static int physic1;
    public static int physic2;

    public static int physicAVG;
    public static int english1;
    public static int english2;
    public static int englishAVG;
    public static int management1;
    public static int management2;
    public static int managementAVG;
    public static int average;
    public static String separator = "----------------------------";
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("\n\tGrade_Average\n");

        System.out.print("Please enter your Math 1.grade:\t");
        math1= scanner.nextInt();
        System.out.print("Please enter your Math 2.grade:\t");
        math2= scanner.nextInt();
        mathAVG= (math1+math2)/2;
        System.out.println(separator);

        System.out.print("Please enter your Physic 1.grade:\t");
        physic1= scanner.nextInt();
        System.out.print("Please enter your Physic 2.grade:\t");
        physic2= scanner.nextInt();
        physicAVG= (physic1+physic2)/2;
        System.out.println(separator);

        System.out.print("Please enter your English 1.grade:\t");
        english1= scanner.nextInt();
        System.out.print("Please enter your English 2.grade:\t");
        english2= scanner.nextInt();
        englishAVG= (english1+english2)/2;
        System.out.println(separator);

        System.out.print("Please enter your Management 1.grade:\t");
        management1= scanner.nextInt();
        System.out.print("Please enter your Management 1.grade:\t");
        management2= scanner.nextInt();
        managementAVG=(management1+management2)/2;
        System.out.println(separator);

        average=(mathAVG+physicAVG+englishAVG+managementAVG)/4;

        System.out.println("\n\tAverage="+average);

        if (average<50)
            System.out.println("\tFAILED");
        else if (average>=50)
            System.out.println("\tPASS");

        System.out.println("\n\tProgram is OVER");
    }
}