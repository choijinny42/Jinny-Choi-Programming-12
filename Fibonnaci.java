public class Fibonnaci {
    public static int fib(int x) {
    if(x <= 1)
        return x;
    else
        return (fib(x - 1) + fib(x - 2));
    }

    public static void main(String[] args){
      int n = 7;
      System.out.println(fib(n));

      int m = 5;
      System.out.println(fib(m));
    }
}
