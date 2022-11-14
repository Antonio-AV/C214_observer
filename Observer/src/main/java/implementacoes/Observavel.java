package implementacoes;

import interfaces.iObservador;
import interfaces.iObservavel;

import java.util.List;
import java.util.ArrayList;

public class Observavel implements iObservavel{

    private String frase;
    private List<Observador> observadores;

    public Observavel(){
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void notificaObservadores(){
        for(Observador observador : observadores){
            observador.update(this);
        }
    }

    @Override
    public void registraObservador(Observador obs){
        observadores.add(obs);
    }

    @Override
    public void removeObservador(Observador obs){
        if(observadores.contains(obs)){
            observadores.remove(obs);
        }
    }

    public int contaPalavras(String frase) {
        this.frase = frase;
        String[] palavra;
        palavra = frase.split(" ");
        return palavra.length;
    }

    public int contaMaiusculas(String frase){
        this.frase = frase;
        int cont = 0;
        for(String palavra : frase.split(" ")) {
            if(palavra.charAt(0) >= 'A' && palavra.charAt(0) <= 'Z') {
                cont++;
            }
        }
        return cont;
    }

    public int contaPares(String frase){
        this.frase = frase;
        int cont = 0;
        for(String palavra : frase.split(" ")) {
            if(palavra.length() % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }
}
