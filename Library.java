package week2.day1;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Library {

 public String addbook(String booktitle) {
	System.out.println("book added successfully");
	 return booktitle;
 }	
	 public void issuebook() {
		 System.out.println("book issues successfully");
	 }
	 
	 public static void main(String[] args) {
		Library lib = new Library();
		
		String returnedTitle = lib.addbook("learn basic java");
		
        System.out.println("Returned Book Title: " + returnedTitle);

        lib.issuebook();
		
		
	}
 }

