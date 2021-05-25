import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
// import java.util.*;   // => "error: reference to LinkedList is ambiguous"
// java.util.LinkedList colide com p2utils.LinkedList!
import p2utils.LinkedList;

public class FilterLines{
  
  
  public static void main(String[] args) throws IOException{
    
    if (args.length != 1) {
      err.printf("Usage: java -ea FilterLines text-file\n");
      exit(1);
    }
    File f = new File(args[0]);
    
    LinkedList<String> smaller = new LinkedList<String>();
    LinkedList<String> medium = new LinkedList<String>();
    LinkedList<String> bigger = new LinkedList<String>();

    Scanner sf = new Scanner(f);
        // exceções poderiam ser intercetadas e mostrar mensagem de erro.
    while (sf.hasNextLine()) {
      String line = sf.nextLine();
      // Guardar linha na lista apropriada, consoante o tamanho.
      if (line.length() < 20){smaller.addLast(line);}

      else if (line.length() <40){medium.addLast(line);}

      else{bigger.addLast(line);}

    }
    sf.close();

    // Escrever conteúdo das listas...
    out.println("Curtas---|---------|---------|---------|---------");
    smaller.print();
    out.printf("\n");  

    out.println("Médias---|---------|---------|---------|---------");
    medium.print();
    out.printf("\n");

    out.println("Longas---|---------|---------|---------|---------");
    bigger.print();   
  }
}
