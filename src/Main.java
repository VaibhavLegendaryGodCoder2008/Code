import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //THIS IS MY FIRST JAVA PROGRAM
        /* THIS
           IS
           A
           MULTI
           LINE
           COMMENT
         */
        System.out.print("I LIKE PIZZA!\n");
        System.out.print("ITS REALLY GOOD!\n");
        System.out.println("BUY ME PIZZA!");
        int age=17;
        int year=2026;
        System.out.println("THE YEAR IS "+year);
        double price=19;
        System.out.println("PRICE IS $"+price);
        System.out.println("ENTER THE LENGTH OF RECTANGLE");
        double l= sc.nextDouble();
        System.out.println("ENTER THE WIDTH OF RECTANGLE");
        double w= sc.nextDouble();
        double area= l*w;
        System.out.println("THE AREA OF RECTANGLE IS"+area+"cm²");

    }
}
