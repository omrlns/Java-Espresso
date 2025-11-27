package com.monitoria.model;

import java.util.ArrayList;
import java.util.List;

import com.monitoria.model.enums.AcaoAvaliacao;

public class Professor extends Usuario {
    private int professorID;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor() {}

    public Professor(int id, String nome, String email, String senha, String curso, int professorID) {
        super(id, nome, email, senha, curso);
        this.professorID = professorID;
    }

    public int getProfessorID() { return professorID; }
    public void setProfessorID(int professorID) { this.professorID = professorID; }

    public List<Disciplina> getDisciplinas() { return disciplinas; }
    public void setDisciplinas(List<Disciplina> disciplinas) { this.disciplinas = disciplinas; }

    // Assinaturas (sem lógica)
    public boolean avaliarDuvida(Duvida duvida, AcaoAvaliacao acao, String feedback) { return false; }
    public Monitor escolherMonitor(int candidaturaID) { return null; }
    public boolean gerenciarMonitor(int monitorID, String acao) { return false; }
    public ValidacaoHoras validarHoras(int monitorID, int duvidaID, float horas) { return null; }
}
