import java.util.ArrayList;

public class Departamento {

    private String nome;
    private ArrayList<FuncionarioBase> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<FuncionarioBase>();
    }

    public void addFunc(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
    }

    public void removeFunc(FuncionarioBase funcionario) {
        funcionarios.remove(funcionario);
    }

    public double calcFolha() {
        double calcTotal = 0.0;
        for (FuncionarioBase funcionario : funcionarios) {
                
                calcTotal += funcionario.calcularSalario();
        }
        return calcTotal;
    }

    public ArrayList<FuncionarioBase> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<FuncionarioBase> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
 
        return  "\n" + funcionarios + "\n"  ;
    }

}
