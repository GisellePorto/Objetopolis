package Objetopolis;

public class Main {
    public static void main(String[] args){

        Candidato c1 = new Candidato("Giselle", "000.000.000-00", "X", 1, 0);
        Candidato c2 = new Candidato("Ian", "000.000.000-00", "Y", 2, 0);

        Eleicao eleicao = new Eleicao(c1, c2);

        eleicao.votar(c1);
        eleicao.votar(c2);
        eleicao.votar(c2);
        eleicao.votar(c1);
        eleicao.exibirResultado();

    }
}
