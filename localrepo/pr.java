public class Recursion{
    public static int calcfactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
       int fact_nm1=calcfactorial(n-1);
       int fact_n=n*fact_mn1;
       return fact_n;

    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calcfactorial(n);
        System.out.println("Factorial of " + n + " is: " + ans);
    }
}