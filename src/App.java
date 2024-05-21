public class App {
    public static void main(String[] args) {
Futbolista futbolista = new Futbolista("Martinez Perez",24,01,
        "Lucas","Portero",10);
System.out.println("Datos del futbolista: " + "ID: " + futbolista.getId() +
        " Nombre: " + futbolista.getNombre() +
        " Apellidos: " + futbolista.getApellidos() +
        " Edad: " + futbolista.getEdad() +
        " Demarcacion: " + futbolista.getDemarcacion() +
        " Dorsal: " + futbolista.getDorsal());
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.entrenar();
        futbolista.jugarPartido();

Entrenador entrenador = new Entrenador("Aguilar Mendez",40,02,
        "Juan Modrick","1kk234567891");
        System.out.println("Datos del Entrenador: "
                + "ID: " + entrenador.getId() +
                " Nombre: " + entrenador.getNombre() +
                " Apellidos: " + entrenador.getApellidos() +
                " Edad: " + entrenador.getEdad() +
                " Id federacion: " + entrenador.getId_Federacion() );
        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.dirigirEntrenamiendo();
        entrenador.dirigirPartido();

Masajista masajista = new Masajista("Mendelez Gutierrez", 28, 03,
        "Juana Luciana","Fisico Terapeuta",5);
        System.out.println("Datos del masajista: " +
                "ID: " + masajista.getId() +
                " Nombre: " + masajista.getNombre() +
                " Apellidos: " + masajista.getApellidos() +
                " Edad: " + masajista.getEdad() +
                " Titulacion: " + masajista.getTitulacion() +
                " Años de experiencia: " + masajista.getAñosDeExperiencia());
        masajista.concentrarse();
        masajista.viajar();
        masajista.darMasaje();


    }
}
