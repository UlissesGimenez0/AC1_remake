public class Gerente extends FuncionarioBase implements beneficioInterface {

    protected String nomeGerente;
    protected double salarioBaseGerente;
    protected double bonus;


    public Gerente(String nome, double salarioBase, String nomeGerente, double salarioBaseGerente, double bonus) {
        super(nome, salarioBase);
        nome = nomeGerente;
        salarioBase = salarioBaseGerente;
        bonus = bonus;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public double getSalarioBaseGerente() {
        return salarioBaseGerente;
    }

    public double getBonus() {
        return this.bonus;
    }

    @Override
    public double calcularSalario() {

        double salarioAtual = salarioBaseGerente + (salarioBaseGerente * this.bonus);
        return salarioAtual;
    }

    @Override
    public double calcularSalario(double bonusAdicional) {

        return calcularSalario() + bonusAdicional;

    }

    @Override
    public double calcularBonus(double Percentual) {
        return this.salarioBaseGerente * Percentual;
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return valorFixado;
    }

}