package a6;

public class PlanoBasico implements Plano {

    public float mensalidade;

    public PlanoBasico() {
    }

    public PlanoBasico(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public String getRecursos() {
        return "Básico";
    }

}
