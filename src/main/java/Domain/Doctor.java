package Domain;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private int id;
    private TipoMedico tipoMedico;
    private List<Paciente> pacientesAtendidos;

    public Doctor(int id, TipoMedico tipoMedico) {
        this.id = id;
        this.tipoMedico = tipoMedico;
        this.pacientesAtendidos = new ArrayList<>();
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public TipoMedico getTipoMedico() {
        return tipoMedico;
    }

    public List<Paciente> getPacientesAtendidos() {
        return pacientesAtendidos;
    }
}
