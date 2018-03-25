import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		int s=0;
		int e=0;
		while(e<arr.length) {
			if(e+1<arr.length && arr[e+1]==arr[e]+1) {
				e++;
			}else {
				if(s==e) {
					System.out.println(arr[e]);
				}else {
					System.out.println(arr[s]+"-->"+arr[e]);
					s=e+1;
				}
				e++;
				
			}
		}
		

	}

}
