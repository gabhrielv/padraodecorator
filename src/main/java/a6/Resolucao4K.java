package a6;

public class Resolucao4K extends PlanoDecorator {

    public Resolucao4K(Plano plano) {
        super(plano);
    }

    public float getPercentualMensalidade() {
        return 20.0f;
    }

    public String getNomeRecurso() {
        return "4K";
    }
}
