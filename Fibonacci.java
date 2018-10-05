class Fibonacci {
	public static int fib(int n){
		
		if(n>=3){
			
			return fib(n-1) + fib(n-2);
		}else{
			return 1;
		}
	}
	public static int fiSec(int n){
		int t1 = 0;
		int t2 = 1;
		for (int i = 1;i<=n ;i++){
			System.out.print(t1 + " + ");
			int sum = t1+t2;
			t1 = t2;
			t2 = sum;
		}
		
	}
    public static void main(String[]args){
		
        System.out.println(fib(12));
		fibSec(n);
    }
}