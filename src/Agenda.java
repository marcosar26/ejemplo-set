import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Agenda {

    private Set<Persona> personas = new HashSet<>();

    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public boolean buscarPersona(Persona persona) {
        return personas.contains(persona);
    }

    public String toString() {
        return imprimirLista(this.personas);
    }

    public String ordenarPorApellidos() {
        List<Persona> personasOrdenadas = new ArrayList<>(personas);
        Collections.sort(personasOrdenadas);
        return this.imprimirLista(personasOrdenadas);
    }

    public String imprimirLista(Collection<Persona> lista) {
        StringBuilder sb = new StringBuilder();

        sb.append("AGENDA\n");
        sb.append("-------------------\n");

        for (Persona p : lista) {
            sb.append(p);
            sb.append("\n");
        }

        return sb.toString();
    }
}