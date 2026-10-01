package a6;

public class Download extends PlanoDecorator {

    public Download(Plano plano) {
        super(plano);
    }

    public float getPercentualMensalidade() {
        return 5.0f;
    }

    public String getNomeRecurso() {
        return "Download";
    }
}
