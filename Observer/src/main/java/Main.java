import implementacoes.Observador;
import implementacoes.Observavel;

public class Main {
    public static void main(String[] args) {
        Observavel obs = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        obs.registraObservador(obs1);
        obs.registraObservador(obs2);
        obs.registraObservador(obs3);

        String frase = "Software é melhor que Computação";

        obs.contaPalavras(frase);
        obs.contaPares(frase);
        obs.contaMaiusculas(frase);

        System.out.println("\n\nNotificando observadores");
        obs.notificaObservadores();

        obs.removeObservador(obs1);

        System.out.println("\n\nNotificando observadores");
        obs.notificaObservadores();

    }
}
