package com.monitoria.model;

import java.time.LocalDateTime;

public class ValidacaoHoras {
    private int validacaoID;
    private Monitor monitor;
    private Professor professor;
    private Duvida duvida;
    private float horasValidadas;
    private String observacao;
    private LocalDateTime data;

    public ValidacaoHoras() {}

    public int getValidacaoID() { return validacaoID; }
    public void setValidacaoID(int validacaoID) { this.validacaoID = validacaoID; }

    public Monitor getMonitor() { return monitor; }
    public void setMonitor(Monitor monitor) { this.monitor = monitor; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public Duvida getDuvida() { return duvida; }
    public void setDuvida(Duvida duvida) { this.duvida = duvida; }

    public float getHorasValidadas() { return horasValidadas; }
    public void setHorasValidadas(float horasValidadas) { this.horasValidadas = horasValidadas; }

    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }

    public LocalDateTime getData() { return data; }
    public void setData(LocalDateTime data) { this.data = data; }
}
