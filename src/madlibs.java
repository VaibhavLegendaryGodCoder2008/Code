import java.util.*;
public class madlibs {
    public static void main(String[] args)
    {
        //mad libs
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER AN ADJECTIVE");
        System.out.println("ENTER AN ADJECTIVE");
        System.out.println("ENTER AN ADJECTIVE");
        System.out.println("ENTER A VERB");
        System.out.println("ENTER A NOUN");
        String adj1=sc.next();
        String noun=sc.next();
        String adj2=sc.next();
        String verb=sc.next();
        String adj3=sc.next();
        System.out.println("TODAY I WENT TO A"+adj1+"ZOO");
        System.out.println("IN A EXHIBIT, I SAW A"+noun+".");
        System.out.println(noun+"was"+adj2+"and"+verb+"!");
        System.out.println("I WAS"+adj3+"!");
        sc.close();

    }
}
