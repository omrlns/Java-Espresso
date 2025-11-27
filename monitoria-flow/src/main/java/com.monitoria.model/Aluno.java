package com.monitoria.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private int matricula;
    private List<Candidatura> candidaturas = new ArrayList<>();

    public Aluno() {}

    public Aluno(int id, String nome, String email, String senha, String curso, int matricula) {
        super(id, nome, email, senha, curso);
        this.matricula = matricula;
    }

    public int getMatricula() { return matricula; }
    public void setMatricula(int matricula) { this.matricula = matricula; }

    public List<Candidatura> getCandidaturas() { return candidaturas; }
    public void setCandidaturas(List<Candidatura> candidaturas) { this.candidaturas = candidaturas; }

    // Métodos do diagrama (assinaturas sem implementação)
    public boolean cadastrarDuvida(String titulo, String descricao, Disciplina disciplina) { return false; }
    public boolean aceitarMonitoria(int propostaID) { return false; }
    public boolean rejeitarMonitoria(int propostaID) { return false; }
    public boolean cadastrarFeedbackParaMonitor(int monitorId, String texto) { return false; }
    public Candidatura candidatarVagaMonitor(Disciplina disciplina) { return null; }
}
