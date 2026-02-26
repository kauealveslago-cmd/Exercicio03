package exercicio02;

public class Paciente {
    String nome;
    int idade;

    public int frequenciaMaxima() {
        return 220 - idade;
    }

    public double[] frequenciaAlvo() {
        double[] alvo = new double[2];
        int fM = frequenciaMaxima();
        alvo[0] = fM * .5;
        alvo[1] = fM * .85;

        return alvo;
    }
}
