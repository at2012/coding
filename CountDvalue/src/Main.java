import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int count=0;
		HashSet<Integer> t=new HashSet<>();
		for(int i=0;i<n;i++) {
			t.add(in.nextInt());
		}
		
		Integer[] arr=t.toArray(new Integer[t.size()]);
		Integer[] ne=new Integer[t.size()];
		for(int i=0;i<ne.length;i++) {
			ne[i]=arr[i]+k;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(t.contains(ne[i]))
				count++;
		}
		
		System.out.println(count);
		
	}

}
