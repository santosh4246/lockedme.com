package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddNewFile {

	
	public void AddNewFile() throws IOException {
		//2 times need to give folder address
		
		File FileDir = new File("C:\\Users\\IT-Zone\\eclipse-workspace\\LockedMe.com\\" );
		if(FileDir.isDirectory()) {
			Scanner Filename = new Scanner(System.in);
			System.out.println(" Enter the file name you wants to create with Extension :: ");
			String Newfile1 = Filename.nextLine();
			File Newfile = new File("C:\\Users\\IT-Zone\\eclipse-workspace\\LockedMe.com\\" + Newfile1);
			Newfile.createNewFile();
            System.out.println(" Your File is Created Successfully ,Name of Your file is - " + Newfile1);
            FileWriter writfile = new FileWriter(Newfile);
            System.out.println("Write your words in your new file :- ");
            String Write = Filename.nextLine();
            writfile.write(Write);
            writfile.close();
            System.out.println("Successfully wrote to the file - "+ Newfile1);
        }
		else {
            System.out.println(FileDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
        }
    }
    public static void main(String[] args) throws IOException {
        AddNewFile addfile = new AddNewFile();
        addfile.AddNewFile();
		}
	}

