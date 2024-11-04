public class Diretor extends FuncionarioBase  {

    protected String nome;
    protected double salarioBase;
    protected double bonus;
    protected double auxilioMoradia;

    public Diretor(String nome, double salarioBase, double bonus, double auxilioMoradia) {
        super(nome, salarioBase);
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.auxilioMoradia = auxilioMoradia;
        this.bonus = bonus;
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

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAuxilioMoradia() {
        return auxilioMoradia;
    }

    public void setAuxilioMoradia(double auxilioMoradia) {
        this.auxilioMoradia = auxilioMoradia;
    }

    @Override
    public String toString() {
        return  "Diretor Chamado " + nome + " , com  salario Base de " + salarioBase + " , bonus de " + bonus + " , e auxilio Moradia de "  + auxilioMoradia +  "\n" ;
    }

    

}