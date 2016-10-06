import java.util.*;
import java.util.stream.Collectors;

public class SeguridadSocial {

    private Map<String, Persona> personaMapDni = new HashMap<>();
    private Map<String, Persona> personaMapNumSS = new HashMap<>();

    public void altaPersona(Persona persona) {
        if (!personaMapDni.containsKey(persona.getDni()) && !personaMapNumSS.containsKey(persona.getNumss())) {
            personaMapDni.put(persona.getDni(), persona);
            personaMapNumSS.put(persona.getNumss(), persona);
        }
    }

    public void bajaPersona(String dni) {
        personaMapNumSS.remove(personaMapDni.get(dni).getNumss());

    }

    public Persona obtenerPersonaPorDNI(String dni) {

        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
        return personaMapNumSS.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {

        /*
        List<Persona> aux = new ArrayList<>();

        for (Persona persona:personaMapDni.values()){
            if(persona.getSalario()>= min && persona.getSalario()<=max){
                aux.add(persona);
            }
        }
        return aux;
        */

        return personaMapNumSS.values().stream().filter
                (persona -> persona.getSalario() >= min && persona.getSalario() <= max).
                collect(Collectors.toList());
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad) {

        List<Persona> a = new ArrayList<>();

        for (Persona persona : personaMapDni.values()) {
            if (persona.getEdad() > edad) {
                a.add(persona);
            }
        }
        return a;

    }

    public List<Persona> obtenerTodas() {

        List<Persona> a = new ArrayList<>();
        a.addAll(personaMapDni.values());
        return a;
    }


/** Con arraylists:

 private List<Persona> personasList;

 public SeguridadSocial() {
 personasList = new ArrayList<>();
 }

 // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social
 public void altaPersona(Persona persona) {
 personasList.add(persona);
 }

 public void bajaPersona(String dni) {
 for (int i = 0; i < personasList.size(); i++) {
 Persona a = personasList.get(i);
 if (dni.equals(a.getDni())) {
 personasList.remove(i);
 i = personasList.size();
 }
 }
 }

 public Persona obtenerPersonaPorDNI(String dni) {
 Persona a = personasList.get(0);
 for (int i = 0; i < personasList.size(); i++) {
 a = personasList.get(i);
 if (dni.equals(a.getDni())) {
 i = personasList.size();
 }
 }
 return a;
 }

 public Persona obtenerPersonaPorNumSS(String numSS) {
 Persona a;

 //        for (int i = 0; i < personasList.size(); i++) {
 //            a = personasList.get(i);
 //            if (numSS.equals(a.getNumss())) {
 //                i = personasList.size();
 //            }
 //        }

 int i = 0;
 do {
 a = personasList.get(i);
 i++;
 } while (!numSS.equals(a.getNumss()));

 return a;
 }

 public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {
 List<Persona> lista = new ArrayList<>();
 for (int i = 0; i < personasList.size(); i++) {
 if (personasList.get(i).getSalario() >= min && personasList.get(i).getSalario() <= max) {
 lista.add(personasList.get(i));
 }
 }
 return lista;
 }

 public List<Persona> obtenerPersonasMayoresQue(int edad) {
 List<Persona> listapersonas = new ArrayList<>();
 for (int i = 0; i < personasList.size(); i++) {
 if (personasList.get(i).getEdad() > edad) {
 listapersonas.add(personasList.get(i));
 }
 }
 return listapersonas;

 }

 public List<Persona> obtenerTodas() {
 return personasList;
 }

 @Override public String toString() {
 return "SeguridadSocial{" +
 "personasList=" + personasList +
 '}';
 }
 **/
}