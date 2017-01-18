package skir_2;

public class skir1_3 {
	static int[] random_digit()
	{
		int Array1[]=new int[10];
		
		for (int i= 0;i<Array1.length;i++)
		{
			Array1[i]=(int) (Math.random()*11);
			
		}
		return Array1;
		
	}

	
	public static void main(String[] args)
	{
		
    int Random_10[]=random_digit();
    
    for (int i=1;i<10;i++)
    {
    	System.out.println(Random_10[i]+ " ");
    }
		
	}

}
