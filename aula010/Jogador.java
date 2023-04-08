package aula010;

public class Jogador {
    public Jogador(int num, String nomeJog, int idadeJog, String pePreferido){
        System.out.printf("%nNome do jogador %d: %s;%n", num, nomeJog);
        System.out.printf("Idade do %s: %s anos;%n", nomeJog, idadeJog);
        System.out.printf("O %s tem preferência por chutar com o pé esquerdo ou direito? Resposta: %s;%n", nomeJog, pePreferido);
    }
}
