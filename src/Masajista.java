public class Masajista extends EquipoDePersonas{
    private String titulacion;
    private int añosDeExperiencia;
    @Override
    public void descansar() {
        System.out.println("El masajista esta descansando.");
    }
    @Override
    public void concentrarse() {
        System.out.println("El masajista esta concentrandose.");
    }
    @Override
    public  void comer (){System.out.println("Estan comiendo");}
    @Override
    public void dormir (){ System.out.println("La persona debe descansar");}

    @Override
    public void viajar() {
        System.out.println("El masajista esta viajando.");
    }
    public void darMasaje(){
        System.out.println("El masajista esta dando un masaje.");
    }


    public Masajista(String pApellidos, int pEdad, int pId, String pNombre, String pTitulacion, int pAñosDeExperiencia) {
        super(pApellidos, pEdad, pId, pNombre);
        this.titulacion = pTitulacion;
        this.añosDeExperiencia = pAñosDeExperiencia;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int pAñosDeExperiencia) {
        this.añosDeExperiencia = pAñosDeExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String pTitulacion) {
        this.titulacion = pTitulacion;
    }
}
