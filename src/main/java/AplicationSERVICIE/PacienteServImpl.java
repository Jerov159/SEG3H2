package AplicationSERVICIE;

import Domain.Paciente;
import Infraestructura.PacienteREPOImpl;
import Interfaces.PacienteREPO;
import Interfaces.PacienteService;

import java.util.List;

public class PacienteServImpl implements PacienteService {
    private PacienteREPO pacienteRepository;

    public PacienteServImpl(PacienteREPOImpl pacienteREPO) {
    }

    @Override
    public void crear(Paciente paciente) {
    }

    @Override
    public Paciente leer(int id) {
        return null;
    }

    @Override
    public List<Paciente> leerTodos() {
        return null;
    }

    @Override
    public void actualizar(Paciente paciente) {

    }

    @Override
    public void eliminar(int id) {

    }

    @Override
    public void marcarPacienteAtendido(Paciente paciente) {

    }
}
