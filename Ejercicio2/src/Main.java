import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Asignatura, List<Alumno>> mapaAsignaturas = new HashMap<>();
        ArrayList<Alumno> alumnos1 = new ArrayList<>();
        ArrayList<Alumno> alumnos2 = new ArrayList<>();

        // Lista de alumnado
        Alumno a1 = new Alumno("Arenas", "Eluhei", "e.arenas@mail.com");
        Alumno a2 = new Alumno("Valadez", "Otilia", "o.valadez@mail.com");
        Alumno a3 = new Alumno("Munguia", "Nehuén", "n.munguia@mail.com");
        Alumno a4 = new Alumno("Ayala", "Ivany", "i.ayala@mail.com");

        // Lista asignaturas
        Asignatura asignatura1 = new Asignatura("Lenguaje", 1);
        Asignatura asignatura2 = new Asignatura("BBDD", 2);

        // Grupos de alumnado
        alumnos1.add(a1);
        alumnos1.add(a2);
        alumnos1.add(a3);
        alumnos2.add(a4);
        alumnos2.add(a1);

        // Añadir al mapa los alumnos y la asignaturas creadas
        mapaAsignaturas.put(asignatura1, alumnos1);
        mapaAsignaturas.put(asignatura2, alumnos2);
        System.out.println(mapaAsignaturas);
        pintarMapaAsignaturas(mapaAsignaturas);
        System.out.println("\n");
        pintarMapaAlumnado(estructuraPorAlumno(mapaAsignaturas));
    }

    public static HashMap<Alumno, List<Asignatura>> estructuraPorAlumno(Map<Asignatura, List<Alumno>> mapaAsignaturas) {
        Map<Alumno, List<Asignatura>> map = new HashMap<>();
        int cont = 0;

        for (Map.Entry mapa : mapaAsignaturas.entrySet()) {
            List<Asignatura> listaAsignaturas = new ArrayList<>();
            listaAsignaturas.add((Asignatura) mapa.getKey());
        }

        for (List<Alumno> alumnos : mapaAsignaturas.values()) {
            map.put(alumnos.get(cont), null);
            cont++;
        }
        return (HashMap<Alumno, List<Asignatura>>) map;
    }

    public static void pintarMapaAlumnado(Map<Alumno, List<Asignatura>> mapaAlumno) {
        for (Map.Entry mapa : mapaAlumno.entrySet()) {
            System.out.println("Alumno: " + mapa.getKey());
            System.out.println("Asignatura: " + mapa.getValue());
        }
    }

    public static void pintarMapaAsignaturas(Map<Asignatura, List<Alumno>> mapaAsignaturas) {
        for (Map.Entry mapa : mapaAsignaturas.entrySet()) {
            System.out.println("Asignatura: " + mapa.getKey());
            System.out.println("Alumnos: " + mapa.getValue());
        }
    }

}