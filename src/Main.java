public class Main {
    static Agenda agenda = new Agenda();

    public static void main(String[] args) {

        Persona p1 = new Persona("Unai", "Simón",
                "676485748", "unai@ejemplo.es");
        Persona p2 = new Persona("Álvaro", "Morata",
                "676849578", "morata@ejemplo.es");
        Persona p3 = new Persona("Pau", "Torres",
                "676928374", "pautorres@ejemplo.es");
        Persona p4 = new Persona("Koke", "Resurrección",
                "676485748", "koke@ejemplo.es");

        agenda.addPersona(p1);
        agenda.addPersona(p2);
        agenda.addPersona(p3);
        agenda.addPersona(p4);

        System.out.println(agenda);
        imprimirBusqueda(p4);

        System.out.println(agenda.ordenarPorApellidos());
    }

    private static void imprimirBusqueda(Persona p){
        System.out.println("\nBuscando personas...\n");
        System.out.print("Buscando a ");
        System.out.println(p);
        System.out.println(agenda.buscarPersona(p));
    }
}