package skir_2;

public class skir1_4
{
	void random_digit()
	{
		int [] Array1=new int[10];

		for (int i= 0;i<Array1.length;i++)
		{
			Array1[i]=20+(int) (Math.random()*31);
			System.out.print(Array1[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		skir1_4 obj1 =new skir1_4();
		skir1_4 obj2 =new skir1_4();
		skir1_4 obj3 =new skir1_4();
		skir1_4 obj4 =new skir1_4();
		
		obj1.random_digit();
		obj2.random_digit();
		obj3.random_digit();
		obj4.random_digit();

		
		
	}

}
