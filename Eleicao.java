package Objetopolis;

public class Eleicao{

    private Candidato candidato1;
    private Candidato candidato2;

    public Eleicao(Candidato c1, Candidato c2){
        this.candidato1 = c1;
        this.candidato2 = c2;
    }

    public void setCandidato1(Candidato candidato){
        this.candidato1 = candidato;
    }

    public Candidato getCandidato1(){
        return this.candidato1;
    }

    public void setCandidato2(Candidato candidato){
        this.candidato2 = candidato;
    }

    public Candidato getCandidato2(){
        return this.candidato2;
    }

    public void votar(Candidato candidato){
        candidato.setVotos(candidato.getVotos() + 1);
    }

    public void exibirResultado(){
        if(candidato1.getVotos() > candidato2.getVotos()){
            System.out.println("Candidato 1 venceu!");
        } else if(candidato1.getVotos() < candidato2.getVotos()){
            System.out.println("candidato 2 venceu!");
        } else {
            System.out.println("Empate!");
        }
    }

}
