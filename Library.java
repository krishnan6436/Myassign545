
public class Library {
 public void addbook(String booktitle) {
	 
	 System.out.println("book added sucessfully"+booktitle);
 }
	 
	public void issuebook() {
		
		System.out.println("book issued sucessfuly");
	}
	
	 
	 public static void main(String[] args) {
		Library books = new Library();
		books.addbook("java learning");
		books.issuebook();
		System.out.println();
	}
 }
 

 



