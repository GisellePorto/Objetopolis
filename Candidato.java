package Objetopolis;

public class Candidato {

    private String nome;
    private String cpf;
    private String partido;
    private int numero;
    private int votos;

    public Candidato(String nome, String cpf, String partido, int numero, int votos){
        
        this.nome = nome;
        this.cpf = cpf;
        this.partido = partido;
        this.numero = numero;
        this.votos = votos;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getPartido(){
        return this.partido;
    }

    public void setPartido(String p){
        this.partido = p;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int n){
        this.votos = n;
    }

    public int getVotos(){
        return this.votos;
    }

    public void setVotos(int v){
        this.votos = v;
    }
}
