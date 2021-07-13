package com.company;

import java.util.Scanner;

public class dicPath {
	 public String dirpath() {
	        Scanner Path = new Scanner(System.in);
	        System.out.print("Please Write Folder Path Were File is Save (Like - D:\\LockedMe ,etc) :- ");
	        String Dirctroypath = Path.nextLine();
	        String la =Dirctroypath;
	        System.out.println(" Your Directory Path = "+Dirctroypath);
	        return la;
	    }

	    public static void main(String[] args) {
	        dicPath Folder = new dicPath();
	        Folder.dirpath();
	    }
}
