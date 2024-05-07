package Infraestructura;

import Domain.Doctor;
import Interfaces.DoctorREPO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoctorREPOImpl implements DoctorREPO {
    private Map<Integer, Doctor> medicosMap = new HashMap<>();

    @Override
    public void crear(Doctor doctor) {
        medicosMap.put(doctor.getId(), doctor);
    }

    @Override
    public Doctor leer(int id) {
        return medicosMap.get(id);
    }

    @Override
    public List<Doctor> leerTodos() {
        return new ArrayList<>(medicosMap.values());
    }

    @Override
    public void actualizar(Doctor doctor) {
        medicosMap.put(doctor.getId(), doctor);
    }

    @Override
    public void eliminar(int id) {
        medicosMap.remove(id);
    }
}
