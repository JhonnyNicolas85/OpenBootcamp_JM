public class App_Objetos2 {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona();
        // Edad
        persona1.setEdad(23);
        System.out.println(persona1.getEdad());

        // Nombre
        persona1.setNombre("Jhonny Martínez");
        System.out.println(persona1.getNombre());

        // Teléfono
        persona1.setTelefono(302248171);
        System.out.println(persona1.getTelefono());

        // Cliente junto con todas sus propiedades como cliente
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Pepito Perez");
        cliente.setTelefono(123456789);
        cliente.setCredito(1200000);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        // Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(25);
        trabajador.setNombre("Pepita Perez");
        trabajador.setTelefono(111111111);
        trabajador.setSalario(2500000);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());

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

class Cliente extends Persona {
    float credito;

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCredito() {
        return this.credito;
    }

}

class Trabajador extends Persona {
    float salario;

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

}
