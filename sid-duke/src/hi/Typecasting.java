package hi;
// THIS PROGRAM IS ONLY FOR REFERENCE
public class Typecasting {
	//Dont run this program-just type and understanding how casting works
	public static void main(String[] args) {
		byte b=10;
		int i=b;//will accept -automatic type promotion
		byte c=i;//will not accept-because lower type cannot be put in higher type
		byte d=(byte)i;//Type casting make it possible to store compatible types.
		byte x=10;
		byte y=20;
		byte sum=x*y;//Error is thrown because when two bytes are used in a arithmetic operation,the result will be integer
		
	}

}
