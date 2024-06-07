package topicArrays;

public class CommonNumbers {

	public static void main(String[] args) {
		int a[]= {2,6,3,7};
		int b[]= {5,0,11,6,2,7};
		int c[]=new int[Math.min(a.length, b.length)];
		int index=0;
		for(int i:a) {
			for(int j:b) {
				//if(a[i]==b[j])
				if(j==i)
				{
					c[index++]=i;
					//System.out.println(b[j]);
					
				}
			}
		}
		for(int j:c) {
			System.out.print(j+" ");
		}

	}

}
