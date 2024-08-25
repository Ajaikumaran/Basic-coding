package programs;
import java.util.*;
public class Fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,num,fibo=0;
		Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        for(int i=2;i<=num;i++) {
        	 fibo=n1+n2;
        	n1=n2;
        	n2=fibo;
        	System.out.print(fibo+" ");

        }
	}
	

}
