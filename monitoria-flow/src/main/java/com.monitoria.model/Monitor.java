package com.monitoria.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Monitor extends Usuario {
    private int monitorID;
    private List<Disciplina> disciplinasMonitoradas = new ArrayList<>();

    public Monitor() {}

    public Monitor(int id, String nome, String email, String senha, String curso, int monitorID) {
        super(id, nome, email, senha, curso);
        this.monitorID = monitorID;
    }

    public int getMonitorID() { return monitorID; }
    public void setMonitorID(int monitorID) { this.monitorID = monitorID; }

    public List<Disciplina> getDisciplinasMonitoradas() { return disciplinasMonitoradas; }
    public void setDisciplinasMonitoradas(List<Disciplina> disciplinasMonitoradas) { this.disciplinasMonitoradas = disciplinasMonitoradas; }

    // Assinaturas do diagrama
    public List<String> verificarAgenda() { return null; }
    public boolean proporHorario(int duvidaID, LocalDateTime horario) { return false; }
    public boolean cadastrarFeedbackParaAluno(int alunoID, String texto) { return false; }
}
