
package model;

public class ProntoSocorro {
    private Hospital matriz;
    private int idFilial;
    private String endereco;

    public Hospital getMatriz() {
        return matriz;
    }

    public void setMatriz(Hospital matriz) {
        this.matriz = matriz;
    }

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void ProntoSocorro(int idFi, Hospital matriz){
        this.idFilial = idFi;
        this.matriz = matriz;
    }
    
    
}
