package io.github.tiisetso2004;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //report headers for table
        String[] months = {"Month 1", "Month 2", "Month 3"};
        String[] mattresses = {"Mattress","Monarch", "Restonic", "Phuket"};

        System.out.print("\nEnter the sales for month 1 of Cozy Nights Monarch mattress: ");
        int monarch1 = sc.nextInt();
        System.out.print("\nEnter the sales for month 2 of Cozy Nights Monarch mattress: ");
        int monarch2 = sc.nextInt();
        System.out.print("\nEnter the sales for month 3 of Cozy Nights Monarch mattress: ");
        int monarch3 = sc.nextInt();

        System.out.print("\nEnter the sales for month 1 of Restonic Barbados mattress: ");
        int barbados1 = sc.nextInt();
        System.out.print("\nEnter the sales for month 2 of Restonic Barbados mattress: ");
        int barbados2 = sc.nextInt();
        System.out.print("\nEnter the sales for month 3 of Restonic Barbados mattress: ");
        int barbados3 = sc.nextInt();

        System.out.print("\nEnter the sales for month 1 of Sealy Plunkett mattress: ");
        int sealy1 = sc.nextInt();
        System.out.print("\nEnter the sales for month 2 of Sealy Plunkett mattress: ");
        int sealy2 = sc.nextInt();
        System.out.print("\nEnter the sales for month 3 of Sealy Plunkett mattress: ");
        int sealy3 = sc.nextInt();

       //rather be safe than sorry, filled in the values directly!
        int [][] sales = {
                {monarch1,barbados1, sealy1},
                {monarch2, barbados2, sealy2},
                {monarch3,barbados3,sealy3}
        };

        //report output loops
        for (int i = 0; i < mattresses.length; i++) {
            System.out.printf("%-10s", mattresses[i]);
        }

        //just in case
        System.out.println();

        //Strings are left-aligned to prevent padding issues
        for (int i = 0; i < sales.length ; i++) {
            System.out.printf("%-10s", months[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }
    }
}
