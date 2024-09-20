public class Main {
    public static void main(String[] args) {

        Agenda agendaDeLaura = new Agenda();
        Contacto contacto = new Contacto();
        Contacto contacto1 = new Contacto();
        Contacto contacto2 = new Contacto();

        contacto.setNombre("Cristian");
        contacto.setNumero("1672763562");

        contacto1.setNombre("Dario");
        contacto1.setNumero("1675273");

        contacto2.setNombre("Mery");
        contacto2.setNumero("7625632");

        agendaDeLaura.registrarContacto(contacto);
        agendaDeLaura.registrarContacto(contacto1);
        agendaDeLaura.registrarContacto(contacto2);
        agendaDeLaura.listarContactos();
        agendaDeLaura.buscarContacto("Mery");
        System.out.println("Contactos Disponibles: " + agendaDeLaura.disponibles());

    }
}