package com.monitoria.model;

import com.monitoria.model.enums.AcaoAvaliacao;
import java.time.LocalDateTime;

public class Avaliacao {
    private int avaliacaoID;
    private Duvida duvida;
    private Professor professor;
    private AcaoAvaliacao acao;
    private String feedback;
    private LocalDateTime data;

    public Avaliacao() {}

    public int getAvaliacaoID() { return avaliacaoID; }
    public void setAvaliacaoID(int avaliacaoID) { this.avaliacaoID = avaliacaoID; }

    public Duvida getDuvida() { return duvida; }
    public void setDuvida(Duvida duvida) { this.duvida = duvida; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public AcaoAvaliacao getAcao() { return acao; }
    public void setAcao(AcaoAvaliacao acao) { this.acao = acao; }

    public String getFeedback() { return feedback; }
    public void setFeedback(String feedback) { this.feedback = feedback; }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }
}
