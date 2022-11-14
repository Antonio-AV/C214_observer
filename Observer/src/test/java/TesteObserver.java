import implementacoes.Observavel;
import implementacoes.Observador;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteObserver {

    @Test
    public void testaInscritos() {
        Observavel obs = new Observavel();
        Observador leitor1 = new Observador(1);
        obs.registraObservador(leitor1);
        assertTrue(!obs.getObservadores().isEmpty());
    }

    @Test
    public void testaPar() {
        Observavel obs = new Observavel();
        String frase = "Software é melhor que Computação";
        int par = obs.contaPares(frase);
        assertEquals(3, par);
    }

    @Test
    public void testaMaiuscula() {
        Observavel obs = new Observavel();
        String frase = "Software é melhor que Computação";
        int maiu = obs.contaMaiusculas(frase);
        assertEquals(2, maiu);
    }

    @Test
    public void testaPalavras() {
        Observavel obs = new Observavel();
        String frase = "Software é melhor que Computação";
        int palavra = obs.contaPalavras(frase);
        assertEquals(5, palavra);
    }


}
