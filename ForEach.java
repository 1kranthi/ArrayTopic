package topicArrays;

public class ForEach {

	public static void main(String[] args) {
		int a[]= {2,4,1,6,7};
		int sem=0;
		int sem1=0;
		for(int i:a) {
			System.out.print(i+" ");
			sem+=i;
		}
		System.out.println(sem);
		System.out.println();
		int b[]=a.clone();
		System.out.println(b+" ");
		System.out.println();
		for(int j:b) {
			System.out.print(j+" ");
			sem1+=j;
			
		}
		System.out.println(sem1);
	}

}
