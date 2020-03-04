
package model;

public abstract class Pessoa {
    private String nome;
    private String Rg;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return Rg;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

}
