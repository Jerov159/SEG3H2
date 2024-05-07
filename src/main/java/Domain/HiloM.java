package Domain;

import Interfaces.DoctorServ;
import Interfaces.PacienteService;

import java.util.List;
import java.util.Random;

public class HiloM extends Thread {

    private Doctor doctor;
    private List<Paciente> pacientes;
    private DoctorServ doctorServ;
    private PacienteService pacienteService;
    private Random random;

    public HiloM(Doctor doctor, List<Paciente> pacientes, DoctorServ doctorServ, PacienteService pacienteService) {
        this.doctor = doctor;
        this.pacientes = pacientes;
        this.doctorServ = doctorServ;
        this.pacienteService = pacienteService;
        this.random = new Random();
    }

    @Override
    public void run() {
        while (!pacientes.isEmpty()) {
            // Seleccionar un paciente adecuado según el tipo de médico
            Paciente paciente = seleccionarPacienteSegunTipoMedico(doctor.getTipoMedico(), pacientes);
            if (paciente != null) {
                // Simular tiempo de atención
                int tiempoAtencion = random.nextInt(5) + 1; // Entre 1 y 5 segundos
                try {
                    Thread.sleep(tiempoAtencion * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Registrar paciente atendido
                doctorServ.atenderPaciente(doctor, paciente);
                pacienteService.marcarPacienteAtendido(paciente);
                pacientes.remove(paciente);
            }
        }
    }

    private Paciente seleccionarPacienteSegunTipoMedico(TipoMedico tipoMedico, List<Paciente> pacientes) {
        // Implementar la lógica para seleccionar un paciente adecuado según el tipo de médico
        // Por ejemplo, si el médico es pediatra, seleccionar un paciente pediátrico
        // Si el médico es cardiólogo, seleccionar un paciente con una condición cardiaca
        // ...

        // Aquí se muestra una implementación simple que selecciona un paciente aleatorio
        if (!pacientes.isEmpty()) {
            int indexPaciente = random.nextInt(pacientes.size());
            return pacientes.get(indexPaciente);
        }
        return null;
    }


}
