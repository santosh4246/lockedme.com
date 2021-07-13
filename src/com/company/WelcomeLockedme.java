package com.company;

import java.io.IOException;
import java.util.Scanner;

public class WelcomeLockedme {
	public static void main(String[] args) throws IOException {
        System.out.println("Welcome from Lockers Pvt. Ltd.\n Application for File Operations");
        System.out.println("Develop by :- KADHAM SANTOSH ");
        Scanner WC = new Scanner(System.in);

            while (true) {
                System.out.println("");
                System.out.println("Type y to Continue the File operation or e to exit:-");
                String ask = WC.nextLine();
                if (ask.equals("y")) {
                    System.out.println(" Choose Below option as per your Requirement\n Option Menu Are:-");
                    System.out.println("Enter - s - To Show all file. \nEnter - c - To create a New file \nEnter - d - To Delete a File " +
                            "\nEnter - r - To Read File\nEnter - f - To Search(Find) Existing File\nEnter - e - To Exit from Application  ");
                    System.out.println("Please select correct option to perform the application :- ");
                } else if (ask.equals("e")) {
                    Exit ex = new Exit();
                    ex.Exit();
                    break;
                } else {
                    System.out.println(" Invalid option please choose correct option and restart the application ");
                    return ;
                }
                String as = WC.nextLine();
                if (as.equals("e")){
                        Exit EX = new Exit();
                        EX.Exit();
                        break;
                }
                switch (as) {
                    case "s":
                        ShowFile sow = new ShowFile();
                        sow.ShowFile();
                        break;
                    case "c":
                        AddNewFile crt = new AddNewFile();
                        crt.AddNewFile();
                        break;
                    case "d":
                        DeleteFile de = new DeleteFile();
                        de.DeleteFile();
                        break;
                    case "r":
                        Readfile re = new Readfile();
                        re.Readfile();
                        break;
                    case "f":
                        SearchFile sf = new SearchFile();
                        sf.SearchFile();
                        break;

                    default:
                        System.out.println(" Invalid option please choose correct option form Option Menu ");
                }
            }
        }
}
