package Domain;

public class Paciente {
    private int id;
    private String nombre;
    private boolean atendido;

    public Paciente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.atendido = false;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isAtendido() {
        return atendido;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }
}
