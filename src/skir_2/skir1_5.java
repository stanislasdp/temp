package skir_2;

public class skir1_5 {
	
	static void random_digit()
	{
		int [] Array1=new int[10];

		for (int i= 0;i<Array1.length;i++)
		{
			Array1[i]=-10+(int) (Math.random()*22);
			System.out.print(Array1[i] + " ");
		}
}


	public static void main(String[] args) 
	{
		
		random_digit();

}
}
