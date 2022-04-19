public class App_objetos {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        // Edad
        persona1.setEdad(23);
        System.out.println(persona1.getEdad());

        // Nombre
        persona1.setNombre("Jhonny Martínez");
        System.out.println(persona1.getNombre());

        //Teléfono
        persona1.setTelefono(3022481);
        System.out.println(persona1.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
