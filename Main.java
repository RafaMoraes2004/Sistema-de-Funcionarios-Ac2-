public class Main {

    public static void main(String[] args) {

        Departamento tecnologia = new Departamento("Tecnologia", null);

        FuncionarioBase f1 = new Funcionario("João", 3000);

        FuncionarioBase g1 = new Gerente("Maria", 5000, 20);

        FuncionarioBase d1 = new Diretor("Carlos", 10000, 30, 2000);

        tecnologia.adicionar(f1);
        tecnologia.adicionar(g1);
        tecnologia.adicionar(d1);

        System.out.println("A folha salarial total é : " + tecnologia.calcularFolha());

        tecnologia.imprimirSalariosFuncionarios();
    }

}
