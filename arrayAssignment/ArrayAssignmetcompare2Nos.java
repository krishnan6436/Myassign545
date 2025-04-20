package arrayAssignment;

public class ArrayAssignmetcompare2Nos {

	public static void main(String[] args) {
		
		int firstno[]={3,2,11,4,6,7}; 
		int secondno[]={1,2,8,4,9,7};
		for (int i = 0; i < firstno.length; i++) {
			int j =firstno [i];
			System.out.println(j);
			for (int j2 = 0; j2 < secondno.length; j2++) {
				int k = secondno[j2];
				System.out.println(k);
				if (j==k) {
					System.out.println("equal b/w 2 nos"+j);
				} else {

					System.out.println("nothing eqals to"+k);
				}
			}
		}
	}
}
		
		



	