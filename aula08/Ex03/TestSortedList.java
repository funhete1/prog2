import static java.lang.System.*;

import p2utils.SortedList;

public class TestSortedList
{
  // Apresenta
  // * os números dados na linha de comando por ordem crescente;
  // * os restantes argumentos por ordem lexicográfica.  (FALTA FAZER!)
  // Utiliza duas listas ordenadas para fazer isto.

  public static void main(String[] args) {
    // Uma lista para os números:
    SortedList<Double> numbers = new SortedList<Double>();
    // Outra lista para as restantes strings:
    SortedList<String> frases = new SortedList<String>();

    for (int i=0; i<args.length; i++) {
      // Converte args[i] para número e guarda na lista:
      try{
        numbers.insert( Double.valueOf(args[i]) );
      }catch(Exception e){
        frases.insert(args[i]);
      }
    }

    // Escrever a lista dos números (destruindo-a):
    out.printf("Numbers (%b):\n", numbers.isSorted());
    while (!numbers.isEmpty()) {
      out.println(numbers.first());
      numbers.removeFirst();
    }
    out.printf("frases (%b):\n", frases.isSorted());
    while (!frases.isEmpty()) {
      out.println(frases.first());
      frases.removeFirst();
    }
  }
}

