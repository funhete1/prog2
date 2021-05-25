import java.util.Scanner;
import jogos.*;

public class JogaJogoDoGalo {
  public static final Scanner sin = new Scanner(System.in);
  public static void main(String[] args) {
    char jogador1 = 'X';
    char jogador2 = 'O';
    JogoDoGalo jogo = new JogoDoGalo(jogador1, jogador2);
    jogo.mostraTabuleiro();
    while (!jogo.terminado()) {
      System.out.println("(lin col): ");
      int lin = sin.nextInt();
      int col = sin.nextInt();
      jogo.jogada(lin, col);
      jogo.mostraTabuleiro();
    }
    System.out.println();
    if (jogo.ultimoJogadorGanhou()) {
        System.out.println("Jogador "+jogo.ultimoJogador()+" ganhou!");
    } else {
        System.out.println("Jogo empatado!");
    }
  }
}
