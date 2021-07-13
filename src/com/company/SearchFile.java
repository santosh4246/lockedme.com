package com.company;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchFile {
	public void SearchFile(){
	       // need to write 2 times folder address
		
	        File FileDir = new File("C:\\Users\\IT-Zone\\eclipse-workspace\\LockedMe.com\\");
	        List<String> listFile = Arrays.asList(FileDir.list());
	        File[] filelist = FileDir.listFiles();
	                if (FileDir.isDirectory()) {
	                    Scanner SearchFile = new Scanner(System.in);
	                    System.out.println("Enter the file name(File name is case sensitive) wants to Search With Extension( Like- .txt,.doc etc) :- ");
	                    String serfil = SearchFile.nextLine();
	                    File SerFile = new File("C:\\Users\\IT-Zone\\eclipse-workspace\\LockedMe.com\\" + serfil);
	                    boolean B = false;
	                    if (filelist == null) throw new AssertionError("File Not found in Folder");
	                    for (File i : filelist) {
	                        String SF = i.getName();
	                        if (SF.equals(serfil)) {
	                            B = true;
	                            System.out.println("Successfully completed search of file  = " + serfil+"\n File address is ="+i.getAbsolutePath());
	                            break;
	                        }
	                    }
	                    if (!B){
	                    System.out.println(" File Not found ");}
	                }
	                else {
	                    System.out.println(FileDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
	                }
	                }



	    public static void main(String[] args) {
	        SearchFile FSE = new SearchFile();
	        FSE.SearchFile();

	    }
}
