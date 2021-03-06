import java.util.Scanner;
import static java.lang.System.*;

public class p12
{
  public static final Scanner in = new Scanner(System.in);

  // Nota mínima em cada componente:
  public static final double NOTA_MINIMA = 6.5;

  public static void main(String[] args)
  {
    double atp1 = readInRange("ATP1? ", 0.0, 20.0);
    double ap1 = readInRange("AP1? ", 0.0, 20.0);
    double atp2 = readInRange("ATP2? ", 0.0, 20.0);
    double ap2 = readInRange("AP2? ", 0.0, 20.0);

    // Use estas variáveis para calcular o resultado:
    double ctp = 0.5 * atp1 + 0.5 * atp2; // componente TP
    double cp = (2.0/7.0) * ap1 + (5.0/7.0  ) * ap2; // componente P
    int nf = 0;  // nota final (inteiro positivo ou -66 se RNM)
                // Use Math.round para arredondar (procure a documentação)
    boolean aprovado;   // indica se passou ou não
   
    // Complete com os cálculos e variáveis auxiliares:
    if(pass_or_not(ctp, cp)){
      nf = (int) Math.round(0.3*ctp + 0.7*cp);
      aprovado = true;
    }
    else{
      nf = -66;
      aprovado = false;
    }

    out.printf(" %7s %7s %7s %7s\n", "CTP", "CP", "NF", "APROV?");
    out.printf(" %7.1f %7.1f %7d %7s\n", ctp, cp, nf, aprovado);
  }

  // Reads a double that must be in the range [min, max].
  // Shows the prompt, reads a double value.
  // If the value is not in the range, prints a warning and repeats.
  public static double readInRange(String prompt, double min, double max)
  {
    assert min <= max : "max must be at least as large as min!";
    double value = 0;
    do {
      value = in.nextDouble();
      if(value < min || value > max)System.out.println("Your grade must be between 0 and 20.");
    } while (value < min || value > max);
    return value;
  }
  public static boolean pass_or_not(double nota1, double nota2){
      if(nota1 >= 6.5 && nota2 >= 6.5){
        return true;
      }
      return false;
  }
}
