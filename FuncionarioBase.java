abstract class FuncionarioBase {

    protected String nome;
    protected double salarioBase;

    public abstract double calcularSalario();

    public abstract double calcularSalario(double bonusAdicional);

    public FuncionarioBase(String nome, double salarioBase) {

        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}