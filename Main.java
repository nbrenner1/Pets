import java.io.*;
import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable
{
    private static Owner owner;

    public static void main(String args[])
    {
        System.out.println("Choose a pet to interact with:");
        System.out.println("1- Hedgehog");
        System.out.println("2- Orca");
        System.out.println();
        Scanner inputScanner = new Scanner(System.in);
        int userPet = inputScanner.nextInt();
        owner = new Owner(userPet);   // Create a new owner that takes in which pet is selected
    }
}
