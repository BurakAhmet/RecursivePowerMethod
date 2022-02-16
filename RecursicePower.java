public class RecursivePower {
	private static int recursivePowerMethod(int x, int n) {
		
		if (n==0)
		{
			return 1;
		}
			return x*recursivePowerMethod(x, n-1);
	}
	
}
