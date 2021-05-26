import java.util.Scanner;
import jogos.*;

public class JogaJogoDoGalo {
  public static final Scanner sin = new Scanner(System.in);
  
  public static int counterx = 0;
  public static int countero = 0; 
  public static void main(String[] args) {
    
    while(true){
      char result = Galo();
      if(result == 'X'){
        counterx++;
      }
      else if(result=='O'){
        countero++;
      }
      if(counterx == 3){
        System.out.println("Jogador X ganhou");
        break;
      }
      if(countero == 3){
        System.out.println("Jogador O ganhou");
        break;
      }
    }
  
  }
  public static char Galo(){
    char jogador1 = 'X';
    char jogador2 = 'O';
    JogoDoGalo jogo = new JogoDoGalo(jogador1, jogador2);
    jogo.mostraTabuleiro();
    System.out.printf("Placar:\n jogador X: %d\n jogador O: %d\n", counterx, countero);
    while (!jogo.terminado()) { 
      System.out.println("(lin col): ");
      int lin = sin.nextInt();
      int col = sin.nextInt();
      jogo.jogada(lin, col);
      jogo.mostraTabuleiro();
    }
    if(jogo.ultimoJogadorGanhou()){
      return jogo.ultimoJogador();
    }
    return 'a';
  }
}

