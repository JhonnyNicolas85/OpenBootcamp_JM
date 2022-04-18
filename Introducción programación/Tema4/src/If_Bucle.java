public class If_Bucle {
    public static void main(String[] args) throws Exception {
        // Primer punto
        System.out.println("Primer punto");
        int numeroif = -4;
        if (numeroif > 0) {
            System.out.println("El número es positivo");
        } else if (numeroif < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El valor es cero");
        }
        // Segundo punto
        System.out.println("Segundo punto");
        float numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        // Tercer punto
        float contador = 0;
        System.out.println("Tercer punto");
        do {
            contador++;
            System.out.println(contador);
            break; // esto dado que solicitaba que solo se ejecutara una vez
        } while (contador > 1);

        // Cuarto punto
        System.out.println("Cuarto punto");
        for (int numerofor = 0; numerofor <= 3; numerofor++) {
            System.out.println("Iteración: " + numerofor);
        }
        // Quinto punto
        System.out.println("Quinto punto");
        var estacion = "Invierno";
        switch (estacion) {
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Estación no especificada");
                System.out.println(estacion);
                break;
        }
    }
}