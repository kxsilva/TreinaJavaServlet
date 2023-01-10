package webapp.model;

import java.util.Calendar;

public class Contato {
    private String nome;
    private String email;
    private String endereco;
    private Calendar datanascimento;

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Calendar getDatanascimento() {
        return datanascimento;
    }
    public void setDatanascimento(Calendar datanascimento) {
        this.datanascimento = datanascimento;
    }

    
}
