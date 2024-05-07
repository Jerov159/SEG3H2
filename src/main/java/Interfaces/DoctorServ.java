package Interfaces;

import Domain.Doctor;
import Domain.Paciente;

import javax.print.Doc;
import java.util.List;


public interface DoctorServ {
    void crearMedico(Doctor doctor);
    Doctor leerMedico(int id);
    List<Doctor> leerTodosMedicos();
    void actualizarMedico(Doctor doctor);
    void eliminarMedico(int id);
    void atenderPaciente(Doctor medico, Paciente paciente);
}
