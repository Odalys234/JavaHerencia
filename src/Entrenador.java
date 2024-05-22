public class Entrenador extends EquipoDePersonas {
   private String id_Federacion;

    @Override
    public void concentrarse() {
        System.out.println("El entrenador esta concentrado.");
    }
    @Override
    public void descansar() {
        System.out.println("El entrenador  esta descansando.");
    }
    @Override
    public void viajar() {
        System.out.println("El entrenador esta viajando.");
    }
    public void dirigirPartido(){
    System.out.println("El entrenador esta dirigiendo el partido.");
    }
    public void dirigirEntrenamiendo(){
        System.out.println("El entrenador esta dirigiendo el entrenamiento");
    }
    public Entrenador(String pApellidos, int pEdad, int pId, String pNombre, String pId_Federacion) {
        super(pApellidos, pEdad, pId, pNombre);
        this.id_Federacion = pId_Federacion;
    }

    public String getId_Federacion() {
        return id_Federacion;
    }

    public void setId_Federacion(String pId_Federacion) {
        this.id_Federacion = pId_Federacion;
    }
}
