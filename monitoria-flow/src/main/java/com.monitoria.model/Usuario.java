package com.monitoria.model;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private String curso;

    public Usuario() {}

    public Usuario(int id, String nome, String email, String senha, String curso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.curso = curso;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    // Métodos do diagrama - sem lógica
    public Usuario criarConta() { return null; }
    public boolean alterarSenha(String senhaAtual, String novaSenha) { return false; }
    public boolean autenticar(String email, String senha) { return false; }
}
