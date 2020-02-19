
package revisaodeorientacao;

public class Principal {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        System.out.println("___________________________");
        System.out.println("funcionarios");
        System.out.println("___________________________");
        f.setNome("jailson carrara");
        f.setSenha("123456ab");
        f.setRg("123456987");
        f.setMatricula(1);
        f.setIdade(25);
        f.setCpf("52493718844");
        System.out.println("nome:"+f.getNome());
        System.out.println("idade:"+f.getIdade());
        System.out.println("matricula:"+f.getMatricula());
        System.out.println("rg:"+f.getRg());
        System.out.println("cpf:"+f.getCpf());
        System.out.println("senha:"+f.getSenha());
        System.out.println("___________________________");
        /***/
        Funcionario f1 = new Funcionario();
        
        f1.setNome("maria carrara");
        f1.setSenha("123456abcd");
        f1.setRg("789654123");
        f1.setMatricula(2);
        f1.setIdade(22);
        f1.setCpf("1532146588");
        System.out.println("nome:"+f1.getNome());
        System.out.println("idade:"+f1.getIdade());
        System.out.println("matricula:"+f1.getMatricula());
        System.out.println("rg:"+f1.getRg());
        System.out.println("cpf:"+f1.getCpf());
        System.out.println("senha:"+f1.getSenha());
        System.out.println("___________________________");
        /***/
        
        Paciente p = new Paciente();
        System.out.println("___________________________");
        System.out.println("paciente");
        System.out.println("___________________________");
        p.setNome("vitu menegaz");
        p.setIdade(16);
        p.setCpf("58974631565");
        p.setRg("84968786x");
        p.setCodPaciente(001);
        p.setSenha("15698745d");
        
        System.out.println("nome:"+p.getNome());
        System.out.println("idade:"+p.getIdade());
        System.out.println("codigo:"+p.getCodPaciente());
        System.out.println("rg:"+p.getRg());
        System.out.println("cpf:"+p.getCpf());
        System.out.println("senha:"+p.getSenha());
        System.out.println("___________________________");
        
        /***/
        
        Medico m = new Medico();
        System.out.println("___________________________");
        System.out.println("medico");
        System.out.println("___________________________");
        m.setCrm("15325256/sp");
        m.setEspecialidade("cirurgiao");
        m.setNome("alonso silva");
        m.setSenha("123456abcdsasd");
        m.setRg("789658758");
        m.setMatricula(3);
        m.setIdade(40);
        m.setCpf("15324845689");
        m.calcularSalario()
        System.out.println("nome:"+m.getNome());
        System.out.println("idade:"+m.getIdade());
        System.out.println("matricula:"+m.getMatricula());
        System.out.println("crm:"+m.getCrm());
        System.out.println("rg:"+m.getRg());
        System.out.println("cpf:"+m.getCpf());
        System.out.println("senha:"+m.getSenha());
        System.out.println("especialidade:"+m.getEspecialidade());
        System.out.println("___________________________");
        /***/
        
        Enfermeiro e =  new Enfermeiro();
        System.out.println("___________________________");
        System.out.println("enfermeiros");
        System.out.println("___________________________");
        e.setCoren("155245258/sp");
        e.setNome("alonsa santos");
        e.setSenha("123456abcdef");
        e.setRg("7896558958");
        e.setMatricula(4);
        e.setIdade(30);
        e.setCpf("74894554187");
        System.out.println("nome:"+e.getNome());
        System.out.println("idade:"+e.getIdade());
        System.out.println("matricula:"+e.getMatricula());
        System.out.println("coren:"+e.getCoren());
        System.out.println("rg:"+e.getRg());
        System.out.println("cpf:"+e.getCpf());
        System.out.println("senha:"+e.getSenha());
        System.out.println("___________________________");
        
        
    }
    
}
