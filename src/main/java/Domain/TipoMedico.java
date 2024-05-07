package Domain;

public enum TipoMedico {
    //Aca estan los tipos de medicos para usarse en la clase Doctor
    MEDICOGENERAL("Médico de familia o médico general") {
        @Override
        public String getDescripcionEspecialidad() {
            return "El médico de familia o médico general es el profesional sanitario que presta atención médica integral a individuos, familias y comunidades.";
        }
    },
    CARDIOLOGO("Cardiólogo: trata enfermedades del corazón y sistema circulatorio") {
        @Override
        public String getDescripcionEspecialidad() {
            return "El cardiólogo es un especialista en enfermedades del corazón y sistema circulatorio que diagnostica y trata afecciones cardiovasculares.";
        }
    },
    ONCOLOGO("Oncólogo: trata cáncer y tumores") {
        @Override
        public String getDescripcionEspecialidad() {
            return "El oncólogo es un especialista en cáncer y tumores que diagnostica y trata enfermedades oncológicas.";
        }
    },
    ;
    private String descripcion;
    TipoMedico(String descripcion) {
        this.descripcion =descripcion;
    }

    public abstract String getDescripcionEspecialidad();

    @Override
    public String toString() {
        return "TipoMedico{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
