package a6;

public abstract class PlanoDecorator implements Plano {

    private Plano plano;
    public String recursos;

    public PlanoDecorator(Plano plano) {
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public abstract float getPercentualMensalidade();

    public float getMensalidade() {
        return this.plano.getMensalidade() * (1 + (this.getPercentualMensalidade() / 100));
    }

    public abstract String getNomeRecurso();

    public String getRecursos() {
        return this.plano.getRecursos() + "/" + this.getNomeRecurso();
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }
}
