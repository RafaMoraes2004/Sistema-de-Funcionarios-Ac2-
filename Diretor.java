public class Diretor extends FuncionarioBase implements Beneficios {

    private double bonus;
    private double auxMoradia;

    public Diretor(String nome, double salarioBase, double bonus, double auxMoradia) {

        super(nome, salarioBase);
        this.bonus = bonus;
        this.auxMoradia = auxMoradia;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAuxMoradia() {
        return auxMoradia;
    }

    public void setAuxMoradia(double auxMoradia) {
        this.auxMoradia = auxMoradia;
    }

    @Override
    public double calcularSalario() {

        return salarioBase + calcularBonus(getBonus()) + calcularAuxilioMoradia(getAuxMoradia());

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
