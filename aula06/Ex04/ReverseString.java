import static java.lang.System.*;

public class ReverseString{
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      out.printf("Reverse of %s: %s\n", args[i], reversed(args[i], args[i].length()));
    }
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static String reversed(String s, int n) {
    if(n==0){return "";}
    return s.charAt(n-1) + reversed(s, n-1);
  }
}