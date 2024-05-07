package Interfaces;

import Domain.Doctor;

import java.util.List;

public interface DoctorREPO {
    void crear(Doctor doctor);
    Doctor leer(int id);

    List<Doctor> leerTodos();

    void actualizar(Doctor doctor);
    void eliminar(int id);
}
