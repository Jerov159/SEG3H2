package Domain;

import AplicationSERVICIE.DoctorServImpl;
import AplicationSERVICIE.PacienteServImpl;
import Infraestructura.DoctorREPOImpl;
import Infraestructura.PacienteREPOImpl;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de repositorios
        DoctorREPOImpl doctorREPO = new DoctorREPOImpl();
        PacienteREPOImpl pacienteREPO = new PacienteREPOImpl();

        // Crear instancias de servicios
        DoctorServImpl medicoService = new DoctorServImpl(doctorREPO);
        PacienteServImpl pacienteService = new PacienteServImpl(pacienteREPO);

        // Crear médicos
        Doctor medico1 = new Doctor(1, TipoMedico.MEDICOGENERAL);
        Doctor medico2 = new Doctor(2, TipoMedico.CARDIOLOGO);
        Doctor medico3 = new Doctor(3, TipoMedico.ONCOLOGO);
        doctorREPO.crear(medico1);
        doctorREPO.crear(medico2);
        doctorREPO.crear(medico3);

        // Crear pacientes
        Paciente paciente1 = new Paciente(1, "Juan");
        Paciente paciente2 = new Paciente(2, "Jerónimo");
        Paciente paciente3 = new Paciente(3, "Diego");
        Paciente paciente4 = new Paciente(4, "Arle");
        pacienteREPO.crear(paciente1);
        pacienteREPO.crear(paciente2);
        pacienteREPO.crear(paciente3);
        pacienteREPO.crear(paciente4);

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);

        // Iniciar simulación
        List<HiloM> hilosMedicos = new ArrayList<>();
        hilosMedicos.add(new HiloM(medico1, pacientes, medicoService, pacienteService));
        hilosMedicos.add(new HiloM(medico2, pacientes, medicoService, pacienteService));
        hilosMedicos.add(new HiloM(medico3, pacientes, medicoService, pacienteService));

        for (HiloM hiloMedico : hilosMedicos) {
            hiloMedico.start();
        }

        // Esperar a que finalicen los hilos de los médicos
        for (HiloM hiloMedico : hilosMedicos) {
            try {
                hiloMedico.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Mostrar resultados
        List<Doctor> medicos = doctorREPO.leerTodos();
        for (Doctor medico : medicos) {
            System.out.println("Médico " + medico.getId() + " (" + medico.getTipoMedico() + ") atendió a " + medico.getPacientesAtendidos().size() + " pacientes.");
            for (Paciente paciente : medico.getPacientesAtendidos()) {
                System.out.println("- " + paciente.getNombre());
            }
            System.out.println();
        }
    }
}
