public class Main {
    public static void main(String[] args) {

        Departamento Tecnologia = new Departamento("TI");

        FuncionarioBase funcionario = new Funcionario("Joao", 1000.0);
        FuncionarioBase gerente = new Gerente("Maria", 1000, 0.2);
        FuncionarioBase diretor = new Diretor("Carlos", 1000, 0.3, 2000);

        Tecnologia.addFunc(diretor);
        Tecnologia.addFunc(gerente);
        Tecnologia.addFunc(funcionario);

        System.out.println(Tecnologia);

        System.out.println(Tecnologia.calcFolha());

        System.out.println(gerente.calcularSalario());
    }
}
