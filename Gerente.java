public class Gerente extends FuncionarioBase implements Beneficios {

    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {

        super(nome, salarioBase);
        this.bonus = bonus;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {

        return salarioBase + calcularBonus(bonus);

    }

    @Override
    public double calcularSalario(double bonusAdicional) {

        return calcularSalario() + bonusAdicional;

    }

    @Override
    public double calcularBonus(double percentual) {

        return salarioBase * (percentual / 100);

    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {

        return valorFixado;

    }

}
