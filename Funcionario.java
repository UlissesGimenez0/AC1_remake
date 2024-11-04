public class Funcionario extends FuncionarioBase {

    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        super(nome, salarioBase);
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



    @Override
    public double calcularSalario() {

        double salarioAtual = this.salarioBase;
        return salarioAtual;
    }

    @Override
    public double calcularSalario(double bonusAdicional) {
        return calcularSalario() + bonusAdicional;
    }



    @Override
    public String toString() {
        return "um Funcionario chamado " + nome + ", com o salario base de " + salarioBase + "\n";
    }

    
}