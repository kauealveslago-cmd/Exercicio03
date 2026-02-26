package exercicio02;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Paciente paciente = new Paciente();

    public static void main(String[] args) {
        entradaDados();
        System.out.println("----------------------------------");
        saidaDados(paciente);
    }

    public static void entradaDados() {
        System.out.print("Digite o nome do paciente: ");
        paciente.nome = sc.nextLine();
        System.out.print("Digite a idade do paciente: ");
        paciente.idade = sc.nextInt();
    }

    public static void saidaDados(Paciente paciente) {
        int fM = paciente.frequenciaMaxima();
        double[] fA= paciente.frequenciaAlvo();

        System.out.println("Nome do paciente: "+paciente.nome);
        System.out.println("Idade do Paciente: "+paciente.idade);
        System.out.println("Frequência Máxima: "+fM);
        System.out.println("Frequência Alvo Mínima: "+fA[0]);
        System.out.println("Frequência Alvo Máxima: "+fA[1]);
    }
}
