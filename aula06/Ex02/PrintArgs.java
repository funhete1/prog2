import static java.lang.System.*;

public class PrintArgs {
  public static void main(String[] args) {
    printArray(args, args.length);
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static void printArray(String[] array, int n) {
    if(n == 0){return;}
    out.printf("Strinng %d: %s\n", n-1, array[n-1]);
    printArray(array, n-1);
  }

}