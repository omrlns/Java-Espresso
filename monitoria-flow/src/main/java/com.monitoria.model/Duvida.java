package com.monitoria.model;

import com.monitoria.model.enums.StatusDuvida;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Duvida {
    private int duvidaID;
    private int disciplinaID;
    private String titulo;
    private String descricao;
    private StatusDuvida status;
    private LocalDateTime dataCriacao;
    private Aluno aluno;
    private Disciplina disciplina;
    private List<PropostaAgendamento> propostas = new ArrayList<>();
    private Avaliacao avaliacao;

    public Duvida() {}

    public int getDuvidaID() { return duvidaID; }
    public void setDuvidaID(int duvidaID) { this.duvidaID = duvidaID; }

    public int getDisciplinaID() { return disciplinaID; }
    public void setDisciplinaID(int disciplinaID) { this.disciplinaID = disciplinaID; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public StatusDuvida getStatus() { return status; }
    public void setStatus(StatusDuvida status) { this.status = status; }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Disciplina getDisciplina() { return disciplina; }
    public void setDisciplina(Disciplina disciplina) { this.disciplina = disciplina; }

    public List<PropostaAgendamento> getPropostas() { return propostas; }
    public void setPropostas(List<PropostaAgendamento> propostas) { this.propostas = propostas; }

    public Avaliacao getAvaliacao() { return avaliacao; }
    public void setAvaliacao(Avaliacao avaliacao) { this.avaliacao = avaliacao; }

    // método do diagrama
    public void atribuirMonitor(Monitor monitor) { /* sem implementação */ }
}
