package Infraestructura;

import Domain.Paciente;
import Interfaces.PacienteREPO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PacienteREPOImpl implements PacienteREPO {
    private Map<Integer, Paciente> pacientesMap = new HashMap<>();

    @Override
    public void crear(Paciente paciente) {
        pacientesMap.put(paciente.getId(), paciente);
    }

    @Override
    public Paciente leer(int id) {
        return pacientesMap.get(id);
    }

    @Override
    public List<Paciente> leerTodos() {
        return new ArrayList<>(pacientesMap.values());
    }

    @Override
    public void actualizar(Paciente paciente) {
        pacientesMap.put(paciente.getId(), paciente);
    }

    @Override
    public void eliminar(int id) {
        pacientesMap.remove(id);
    }
}
