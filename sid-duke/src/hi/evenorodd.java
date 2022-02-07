package hi;

import java.io.InputStreamReader;

public class evenorodd {
public static void main(String[] args) {
inputreader=new input(System.in);
System.out.println("ENTER A NUMBER...");
int num=reader.nextInt();
if (num%2==0)
	System.out.println(num+"is even");
else
	System.out.println(num+"is odd");
}
}
