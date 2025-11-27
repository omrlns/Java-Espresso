package com.monitoria.model;

import com.monitoria.model.enums.StatusProposta;
import java.time.LocalDateTime;

public class PropostaAgendamento {
    private int propostaID;
    private Duvida duvida;
    private Monitor monitor;
    private LocalDateTime horarioProposto;
    private String local;
    private StatusProposta status;

    public PropostaAgendamento() {}

    public int getPropostaID() { return propostaID; }
    public void setPropostaID(int propostaID) { this.propostaID = propostaID; }

    public Duvida getDuvida() { return duvida; }
    public void setDuvida(Duvida duvida) { this.duvida = duvida; }

    public Monitor getMonitor() { return monitor; }
    public void setMonitor(Monitor monitor) { this.monitor = monitor; }

    public LocalDateTime getHorarioProposto() { return horarioProposto; }
    public void setHorarioProposto(LocalDateTime horarioProposto) { this.horarioProposto = horarioProposto; }

    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }

    public StatusProposta getStatus() { return status; }
    public void setStatus(StatusProposta status) { this.status = status; }

    public boolean responder(int alunoRespostaID) { return false; }
}
