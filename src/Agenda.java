public class Agenda {
    private Contacto redDecontactos[] = new Contacto[10];

    public boolean registrarContacto(Contacto contacto){
        for (int i = 0; i < redDecontactos.length; i++) {
            if (redDecontactos[i] == null){
                redDecontactos[i] = contacto;
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        for (int i = 0; i < redDecontactos.length && redDecontactos[i] != null; i++) {
            System.out.println("Nombre: " + redDecontactos[i].getNombre() + " - Número: " + redDecontactos[i].getNumero());
        }
    }

    public void buscarContacto(String nombre){
        for (int i = 0; i < redDecontactos.length; i++) {
            if (redDecontactos[i] != null && redDecontactos[i].getNombre().equals(nombre) ){
                System.out.println("El número de contacto es: " + redDecontactos[i].getNumero());
            }
        }
    }

    public int disponibles(){
        int contador = 0;
        while (redDecontactos[contador] != null){
            contador++;
        }
        return 10-contador;
    }

}
