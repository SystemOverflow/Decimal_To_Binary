public class Binary {

	public int DecimalToBinary(int num)
	{
		String a = "";
		String b = "";
		int x = 0;
	 while(num != 0)
	 {
		 b += Integer.toString(num%2);
		 
		 num /=2;
	 }
	 
	 for (int i = b.length() - 1; i >=0;i--)
	 {
		 a= a + b.substring(i,i+1);
	 }
	x = Integer.parseInt(a);
	return x;
	}
	
	
	public int BinaryToDecimal(int num)
	{
		
		String a = Integer.toString(num);
	int y = 0;
	int z;
	int n = 0;
		for(int i = a.length()-1; i >= 0;i--)
		{
			z = Integer.parseInt(a.substring(i,i+1));
			y = (int) (y + (z*Math.pow(2, n)));
			n++;
		}
		return y;
	}

}