public class Futbolista extends EquipoDePersonas{
    private int dorsal;
    private String demarcacion;

    public Futbolista(String pApellidos, int pEdad, int pId, String pNombre, String pDemarcacion, int pDorsal) {
        super(pApellidos, pEdad, pId, pNombre);
        this.demarcacion = pDemarcacion;
        this.dorsal = pDorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String pDemarcacion) {
        this.demarcacion = pDemarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int pDorsal) {
        this.dorsal = pDorsal;
    }

    @Override
    public void concentrarse() {
       System.out.println("El fulbolista se esta concentrando.");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista esta viajando.");
    }
    public void jugarPartido(){
        System.out.println("El futbolista esta jugando un partido.");

    }
    public void entrenar(){
        System.out.println("El futbolista esta entrenando.");
    }
}
