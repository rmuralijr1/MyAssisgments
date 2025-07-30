package week2.day1;

public class LibararyManagement {
public static void main(String[] args) {
	 	Library lib = new Library();
	 	 String returnedTitle = lib.addbook("BASIC OF JAVA");
	        System.out.println("Returned Book Title from LibraryManagement: " + returnedTitle);

	        lib.issuebook();
}
}
