import java.util.Scanner;
public class ch3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int TC, a, b;
		while ((((a=sc.nextInt())!=0) && ((b=sc.nextInt())!=0)) && !(a+b==0)){
			System.out.println(a+b);
		}
	}
}
