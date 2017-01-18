package skir_2;
//Вывести на консоль случайное количество (в диапазоне от 3 до 15) случайных чисел, каждое в диапазоне от ­10 до 35.


public class skir1_6 {
	static void random_digit()
	{
		int [] Array1=new int[(int) (3+Math.random()*13)];

		for (int i= 0;i<Array1.length;i++)
		{
			Array1[i]=-10+(int) (Math.random()*46);
			System.out.print(Array1[i]+ " ");
		}
}
	
	


	public static void main(String[] args) {

		random_digit();
	}

}
