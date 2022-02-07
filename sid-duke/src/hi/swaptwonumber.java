package hi;

public class swaptwonumber {
public static void main(String[] args) {
	float first=2.5f; float second=4.5f;
	System.out.println("BEFORE SWAP...");
	System.out.println("FIRST NUMBER"+first);
			System.out.println("SECOND NUMBER"+second);
			//VALUE OF FIRST IS ASSIGNED TO TEMPORARY
			float temporary=first;
			//VALUE OF SECOND IS ASSIGNED TO FIRST
			first=second;
			//VALUE OF TEMPORARY(WHICH CONTAINS THE INITIAL VALUE OF FIRST)IS ASSIGNED TO SECOND
			second=temporary;
			System.out.println("AFTER SWAP..");
			System.out.println("FIRST NUMBER.."+first);
			System.out.println("SECOND NUMBER..."+second);
			
			
}
}
