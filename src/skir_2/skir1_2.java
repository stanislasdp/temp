package skir_2;

import java.util.Random;

public class skir1_2 
{
	  static Random rd = new Random();

	
	static void random_digit()
	{
		int [] Array1=new int[10];
		
		for (int i= 0;i<Array1.length;i++)
		{
			Array1[i]=(int) (Math.random()*10);
			System.out.println(Array1[i]);
		}
		
	}
	static void random_digit_2()
	{
		int [] Array1=new int[10];
		
		for (int i= 0;i<Array1.length;i++)
		{
			Array1[i]=rd.nextInt(11);
			System.out.println(Array1[i]);
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
	
//    random_digit();
		random_digit_2();
		
	}

}
