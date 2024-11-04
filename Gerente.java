public class Gerente extends FuncionarioBase implements beneficioInterface {

    protected String nome;
    protected double salarioBase;
    protected double bonus;


    public Gerente(String nome, double salarioBase,double bonus) {
        super(nome, salarioBase);
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBonus() {
        return this.bonus;
    }

    @Override
    public double calcularSalario() {

        double salarioAtual = this.salarioBase + (this.salarioBase * this.bonus);
        return salarioAtual;
    }

    @Override
    public double calcularSalario(double bonusAdicional) {

        return calcularSalario() + bonusAdicional;

    }

    @Override
    public double calcularBonus(double Percentual) {
        return this.salarioBase * Percentual;
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return valorFixado;
    }

    @Override
    public String toString() {
        return   "Um Gerente chamado " + nome + " , com salarioBase de " + salarioBase + " e bonusPercentual de " + bonus + "\n";
    }

    

}