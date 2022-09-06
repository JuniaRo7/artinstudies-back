package bra.edu.ifsp.artinstudies.model;

public class Usuario {
    private static int idCounter = 0;

    private String nome, email, senha;
    private int id;

    public Usuario() {
        this.id = ++Usuario.idCounter;
    }

    public Usuario(String nome, String email, String senha) {
        this.id = ++Usuario.idCounter;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
