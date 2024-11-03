import java.util.ArrayList;

public class Departamento {

    private String nome;
    private ArrayList<FuncionarioBase> funcionarios;

    public Departamento(String nome, ArrayList<FuncionarioBase> funcionarios) {

        this.nome = nome;
        this.funcionarios = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<FuncionarioBase> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<FuncionarioBase> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionar(FuncionarioBase funcionario) {

        funcionarios.add(funcionario);

    }

    public void remover(FuncionarioBase funcionario) {

        funcionarios.remove(funcionario);
    }

    public double calcularFolha() {

        double total = 0;
        for (FuncionarioBase funcionario : funcionarios) {

            total += funcionario.calcularSalario(); // ver questão do bonus adicional
        }

        return total;

    }

    public void imprimirSalariosFuncionarios() {

        for (FuncionarioBase funcionario : funcionarios) {

            System.out.println("Nome: " + funcionario.getNome() + " " + "Salario: " + funcionario.calcularSalario());
        }

    }

}
