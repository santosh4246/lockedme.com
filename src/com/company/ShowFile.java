package com.company;

import java.io.File;
import java.util.*;

public class ShowFile {
	// need to write 1 times folder address
	
	   public void ShowFile() {

	         File FileDir = new File("C:\\Users\\IT-Zone\\eclipse-workspace\\LockedMe.com\\");
	        if (FileDir.isDirectory()){
	            List<String> listFile = Arrays.asList(FileDir.list());
	            System.out.println("All File Name Are file with out sorting - ");
	            for ( Object S : listFile){
	                System.out.println(S);
	            }
	           System.out.println("-------------------File Name with ascending order------------------- ");
	            Collections.sort(listFile);
	            for (Object S : listFile){
	                System.out.println(S);
	            }
	        }
	        else {
	            System.out.println(FileDir.getAbsolutePath() + " Please Give correct Path of Directory or foldr  ");
	        }

	    }

	    public static void main(String[] args) {
	        ShowFile NewSWF = new ShowFile();
	        NewSWF.ShowFile();
	    }
}
