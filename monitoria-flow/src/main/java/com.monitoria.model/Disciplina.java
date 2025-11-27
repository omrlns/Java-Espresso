package com.monitoria.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int disciplinaID;
    private String nome;
    private Professor professorResponsavel;
    private List<Monitor> monitores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina() {}

    public Disciplina(int disciplinaID, String nome) {
        this.disciplinaID = disciplinaID;
        this.nome = nome;
    }

    public int getDisciplinaID() { return disciplinaID; }
    public void setDisciplinaID(int disciplinaID) { this.disciplinaID = disciplinaID; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Professor getProfessorResponsavel() { return professorResponsavel; }
    public void setProfessorResponsavel(Professor professorResponsavel) { this.professorResponsavel = professorResponsavel; }

    public List<Monitor> getMonitores() { return monitores; }
    public void setMonitores(List<Monitor> monitores) { this.monitores = monitores; }

    public List<Aluno> getAlunos() { return alunos; }
    public void setAlunos(List<Aluno> alunos) { this.alunos = alunos; }
}
