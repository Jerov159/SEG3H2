package AplicationSERVICIE;

import Domain.Doctor;
import Domain.Paciente;
import Interfaces.DoctorREPO;
import Interfaces.DoctorServ;

import java.util.List;

public class DoctorServImpl implements DoctorServ {
    private DoctorREPO doctorREPO;

    public DoctorServImpl(DoctorREPO doctorREPO) {
        this.doctorREPO = doctorREPO;
    }

    @Override
    public void crearMedico(Doctor doctor) {
        doctorREPO.crear(doctor);
    }

    @Override
    public Doctor leerMedico(int id) {
        return doctorREPO.leer(id);
    }

    @Override
    public List<Doctor> leerTodosMedicos() {
        return doctorREPO.leerTodos();
    }

    @Override
    public void actualizarMedico(Doctor doctor) {
        doctorREPO.actualizar(doctor);
    }

    @Override
    public void eliminarMedico(int id) {
        doctorREPO.eliminar(id);
    }

    @Override
    public void atenderPaciente(Doctor doctor, Paciente paciente) {
        doctor.getPacientesAtendidos().add(paciente);
    }
}
