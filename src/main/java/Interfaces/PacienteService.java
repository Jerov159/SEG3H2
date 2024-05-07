package Interfaces;

import Domain.Paciente;

import java.util.List;

public interface PacienteService {
        void crear(Paciente paciente);
        Paciente leer(int id);
        List<Paciente> leerTodos();
        void actualizar(Paciente paciente);
        void eliminar(int id);
        void marcarPacienteAtendido(Paciente paciente);
}
