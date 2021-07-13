package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Readfile {
	public void Readfile() throws FileNotFoundException {
        // Need to give 2 times folder address in code
        File FileDir = new File("C:\\Users\\IT-Zone\\eclipse-workspace\\LockedMe.com\\");
        List<String> listFile = Arrays.asList(FileDir.list());
        File[] filelist = FileDir.listFiles();
        if (FileDir.isDirectory()) {
            Scanner FileName = new Scanner(System.in);
            System.out.println("Enter the file name wants to Read (File name is Case sensitive), with Extension( Like- .txt,.doc etc) :- ");
            String RF = FileName.nextLine();
            File Redfile = new File("C:\\Users\\IT-Zone\\eclipse-workspace\\LockedMe.com\\" + RF);
            boolean a = false;
            if (filelist == null) throw new AssertionError("File Not found in Folder");
            for (File I : filelist) {
                String k = I.getName();
                if (k.equals(RF)) {
                    a = true;
                    break;
                }
            }
            if (!a) {
                System.out.println("File not Present in folder");
            }
            else {
                Scanner sc = new Scanner(Redfile);
                while (sc.hasNext()) {
                    System.out.println(sc.nextLine());
                }
            }

        }
        else {
            System.out.println(FileDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Readfile read = new Readfile();
        read.Readfile();

    }
}
