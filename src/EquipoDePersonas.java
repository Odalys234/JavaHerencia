public class EquipoDePersonas {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public EquipoDePersonas(String pApellidos, int pEdad, int pId, String pNombre) {
        this.apellidos = pApellidos;
        this.edad = pEdad;
        this.id = pId;
        this.nombre = pNombre;
    }

    public void concentrarse(){
        System.out.println("La persona esta concentrandose...");
    }
    public void viajar(){
        System.out.println("Esta persona esta viajando...");
    }
    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String pApellidos) {
        this.apellidos = pApellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        this.id = pId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    public EquipoDePersonas() {
    }
}
