import static java.lang.System.*;
import java.util.Scanner;

public class primes {
  public static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int n;
    while (true) {
      out.print("N? ");
      n = in.nextInt();
      if (n > 0) break;
      err.println("ERROR: invalid number!");
    }

    String verb = isPrime(n)? "is" : "is not";
    out.printf("Number %d %s prime\n", n, verb);
  }

  public static boolean isPrime(int n) {
    boolean tf = true;
    if(n > 5){
      tf = (n % 3 != 0 || n % 5 != 0) ? true : false;
    }
    else{
      tf = (n != 4) ? true : false;
    }
    return tf;
  }
}
