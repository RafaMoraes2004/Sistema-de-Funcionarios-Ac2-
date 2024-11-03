public class Funcionario extends FuncionarioBase {

    public Funcionario(String nome, double salarioBase) {

        super(nome, salarioBase);

    }

    @Override
    public double calcularSalario() {

        return salarioBase;

    }

    @Override
    public double calcularSalario(double bonusAdicional) {

        return calcularSalario() + bonusAdicional;

    }

}