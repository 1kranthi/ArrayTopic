package topicArrays;

public class BiggestNumber {

	public static void main(String[] args) {
		int a[]= {6,2,4,8,1,3}; 
		int k=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>=k) 
			{
				k=a[i];
				
			}
		}
		System.out.println(k);
	}

}
