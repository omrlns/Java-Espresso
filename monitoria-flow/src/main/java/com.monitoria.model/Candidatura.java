package com.monitoria.model;

import com.monitoria.model.enums.StatusCandidatura;
import java.time.LocalDateTime;

public class Candidatura {
    private int candidaturaID;
    private Aluno candidato;
    private Disciplina disciplina;
    private StatusCandidatura status;
    private String motivo;
    private LocalDateTime data;

    public Candidatura() {}

    public int getCandidaturaID() { return candidaturaID; }
    public void setCandidaturaID(int candidaturaID) { this.candidaturaID = candidaturaID; }

    public Aluno getCandidato() { return candidato; }
    public void setCandidato(Aluno candidato) { this.candidato = candidato; }

    public Disciplina getDisciplina() { return disciplina; }
    public void setDisciplina(Disciplina disciplina) { this.disciplina = disciplina; }

    public StatusCandidatura getStatus() { return status; }
    public void setStatus(StatusCandidatura status) { this.status = status; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }

    public void atualizarStatus(StatusCandidatura novoStatus) { this.status = novoStatus; }
}
