
package revisaodeorientacao;

public class Principal {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        System.out.println("___________________________");
        System.out.println("funcionarios");
        System.out.println("___________________________");
        f.setNome("Gabriel Santos ");
        f.setSenha("123456");
        f.setRg("165418239");
        f.setMatricula(1);
        f.setIdade(20);
        f.setCpf("00090897897");
        //exibindo iténs funcionario:
        System.out.println("nome:"+f.getNome());
        System.out.println("idade:"+f.getIdade());
        System.out.println("matricula:"+f.getMatricula());
        System.out.println("rg:"+f.getRg());
        System.out.println("cpf:"+f.getCpf());
        System.out.println("senha:"+f.getSenha());
        System.out.println("___________________________");
        /***
         * instanciando funcionario 1
         */
        Funcionario f1 = new Funcionario();
        
        f1.setNome("Gabriela Santos");
        f1.setSenha("1234567ab");
        f1.setRg("09876543");
        f1.setMatricula(2);
        f1.setIdade(21);
        f1.setCpf("1532146588");
        System.out.println("nome:"+f1.getNome());
        System.out.println("idade:"+f1.getIdade());
        System.out.println("matricula:"+f1.getMatricula());
        System.out.println("rg:"+f1.getRg());
        System.out.println("cpf:"+f1.getCpf());
        System.out.println("senha:"+f1.getSenha());
        System.out.println("___________________________");
        /**
         instanciando paciente 2
         */
        
        Paciente p = new Paciente();
        System.out.println("___________________________");
        System.out.println("paciente");
        System.out.println("___________________________");
        p.setNome("Daniel Rodrigues");
        p.setIdade(1);
        p.setCpf("13243546");
        p.setRg("876457625z");
        p.setCodPaciente(001);
        p.setSenha("1609312309po");
        /*
        exibindo iténs Paceinte 
        */
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
        m.setCrm("132435578/RJ");
        m.setEspecialidade("Ginicologista");
        m.setNome("Marcio Gonçalves");
        m.setSenha("1693123lko45u");
        m.setRg("123.789.654-13");
        m.setMatricula(1);
        m.setIdade(45);
        m.setCpf("143.656.333.78");
        /*
        Exibindo itens Medico
        */
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
        e.setCoren("155245258/RJ");
        e.setNome("Afonso mata rindo");
        e.setSenha("Afonso12345");
        e.setRg("423.645.723-45");
        e.setMatricula(2);
        e.setIdade(30);
        e.setCpf("123.457.574.34");
        
        //exibindo iténs Enfermeiro 
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
