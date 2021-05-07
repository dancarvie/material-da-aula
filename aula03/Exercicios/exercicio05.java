package Exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double mediaAluno, mediaTurma, mediaGeral;
        final int NUM_ALUNO = 3;
        final int NUM_TURMA = 2;

        mediaGeral = 0;

        for (int turma = 1; turma <= NUM_TURMA; turma++){

        mediaTurma = 0;
        for (int aluno = 1; aluno <= NUM_ALUNO; aluno++) {
            System.out.printf("Digite a média do " +aluno+  "º aluno: ");
            mediaAluno = entrada.nextDouble();
            mediaTurma = mediaTurma + mediaAluno;
        }

        mediaTurma = mediaTurma / NUM_ALUNO;
        System.out.println("Média da turma: " + mediaTurma);
        mediaGeral = mediaGeral + mediaTurma;
        System.out.println("Média da turma " + turma+ ": " + mediaTurma);

    }
    mediaGeral = mediaGeral / NUM_TURMA;
    System.out.println("\nMédia Geral: " + mediaGeral);

        entrada.close();
    }
}
