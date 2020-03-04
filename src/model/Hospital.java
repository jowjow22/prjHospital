
package model;

import java.util.ArrayList;

public class Hospital {
   private int idHospital;
   private String nome;
   private ArrayList<Funcionario> funcionario = new ArrayList();
   private String endereco;

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   public void addFuncionario(Funcionario funcionario){
       this.funcionario.add(funcionario);
   }
   public void listarFuncionarios(){
   for (Funcionario f: funcionario){
       System.out.println("nome:"+f.getNome());
   }
   }
   public void listarMedicos(){
   for (Funcionario f: funcionario){
       if(f instanceof Medico){
       System.out.println("nome:"+f.getNome());
       }
   }
   }
   public void listarEnfermeiros(){
   for (Funcionario f: funcionario){
       if(f instanceof Enfermeiro){
       System.out.println("nome:"+f.getNome());
       }
   }
   }
   public void Hospital(int id,String nome, String end){
       this.idHospital = id;
       this.nome = nome;
       this.endereco = end;
   }
   
}
