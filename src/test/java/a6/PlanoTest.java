package a6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoTest {

    @Test
    void deveRetornarMensalidadePlano() {
        Plano plano = new PlanoBasico(1000.0f);

        assertEquals(1000.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComTelaExtra() {
        Plano plano = new TelaExtra(new PlanoBasico(1000.0f));

        assertEquals(1100.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComResolucao4K() {
        Plano plano = new Resolucao4K(new PlanoBasico(1000.0f));

        assertEquals(1200.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComDownload() {
        Plano plano = new Download(new PlanoBasico(1000.0f));

        assertEquals(1050.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComTelaExtraMaisResolucao4K() {
        Plano plano = new TelaExtra(new Resolucao4K(new PlanoBasico(1000.0f)));

        assertEquals(1320.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComTelaExtraMaisDownload() {
        Plano plano = new TelaExtra(new Download(new PlanoBasico(1000.0f)));

        assertEquals(1155.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComResolucao4KMaisDownload() {
        Plano plano = new Resolucao4K(new Download(new PlanoBasico(1000.0f)));

        assertEquals(1260.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComTelaExtraMaisResolucao4KMaisDownload() {
        Plano plano = new TelaExtra(new Resolucao4K(new Download(new PlanoBasico(1000.0f))));

        assertEquals(1386.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarRecursosPlano() {
        Plano plano = new PlanoBasico();

        assertEquals("Básico", plano.getRecursos());
    }

    @Test
    void deveRetornarRecursosPlanoComTelaExtra() {
        Plano plano = new TelaExtra(new PlanoBasico());

        assertEquals("Básico/Tela Extra", plano.getRecursos());
    }

    @Test
    void deveRetornarRecursosPlanoComResolucao4K() {
        Plano plano = new Resolucao4K(new PlanoBasico());

        assertEquals("Básico/4K", plano.getRecursos());
    }

    @Test
    void deveRetornarRecursosPlanoComDownload() {
        Plano plano = new Download(new PlanoBasico());

        assertEquals("Básico/Download", plano.getRecursos());
    }

    @Test
    void deveRetornarRecursosPlanoComTelaExtraMaisResolucao4K() {
        Plano plano = new TelaExtra(new Resolucao4K(new PlanoBasico()));

        assertEquals("Básico/4K/Tela Extra", plano.getRecursos());
    }

    @Test
    void deveRetornarRecursosPlanoComTelaExtraMaisDownload() {
        Plano plano = new TelaExtra(new Download(new PlanoBasico()));

        assertEquals("Básico/Download/Tela Extra", plano.getRecursos());
    }

    @Test
    void deveRetornarRecursosPlanoComResolucao4KMaisDownload() {
        Plano plano = new Resolucao4K(new Download(new PlanoBasico()));

        assertEquals("Básico/Download/4K", plano.getRecursos());
    }

    @Test
    void deveRetornarRecursosPlanoComTelaExtraMaisResolucao4KMaisDownload() {
        Plano plano = new TelaExtra(new Resolucao4K(new Download(new PlanoBasico())));

        assertEquals("Básico/Download/4K/Tela Extra", plano.getRecursos());
    }

}
