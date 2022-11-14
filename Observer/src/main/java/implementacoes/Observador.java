package implementacoes;

import interfaces.iObservador;

public class Observador implements iObservador{

    int id;

    public Observador(int id){
        this.id = id;
    }

    @Override
    public void update(Observavel obs){
        System.out.println("Observador "+id+" foi notificado");
        System.out.println("Número de palavras: " + obs.contaPalavras(obs.getFrase()));
        System.out.println("Número de palavras maiúsculas: "+ obs.contaMaiusculas(obs.getFrase()));
        System.out.println("Número de palavras pares: "+ obs.contaPares(obs.getFrase()));
    }
}
