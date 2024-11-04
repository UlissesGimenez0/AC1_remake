public abstract class FuncionarioBase {

    protected String nome;
    protected double salarioBase;

    public FuncionarioBase(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    public abstract double calcularSalario(double bonusAdicional);



}