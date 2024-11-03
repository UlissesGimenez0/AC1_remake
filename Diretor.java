public class Diretor extends FuncionarioBase {

    protected String nomeDiretor;
    protected double salarioBaseDiretor;
    protected double bonus;
    protected double auxilioMoradia;

    public Diretor(String nome, double salarioBase, String nomeDiretor, double salarioBaseDiretor, double bonus) {
        super(nome, salarioBase);
        nome = nomeDiretor;
        salarioBase = salarioBaseDiretor;
        auxilioMoradia = auxilioMoradia;
        bonus = bonus;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public double getSalarioBaseDiretor() {
        return salarioBaseDiretor;
    }

    public double getAuxilioMoradia(){
         return auxilioMoradia;
    };

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularSalario() {

        double salarioAtual = salarioBaseDiretor + (salarioBaseDiretor * this.bonus);
        return salarioAtual;
    }

    @Override
    public double calcularSalario(double bonusAdicional) {

        return calcularSalario() + bonusAdicional;

    }

}