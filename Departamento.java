import java.util.ArrayList;

public class Departamento {

    public static void main(String[] args) {
    
        
        String nome;

        ArrayList<FuncionarioBase> funcionarios = new ArrayList<>();

        FuncionarioBase f1 = new Diretor(nome, 0, nome, 0, 0);
    
        funcionarios.add(new Funcionario( "Joao", 1000));
        funcionarios.add(new Funcionario("Nome", 1000));
        
        for(int i = 0; i < funcionarios.size(); i++){

            System.out.println(funcionarios.get(i));
        };


        
    }
  
    

}
