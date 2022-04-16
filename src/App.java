public class App {
    public static void main(String[] args) throws Exception {
        int param1 = 5;
        int param2 = 7;
        int param3 = 6;
        int resultado;
        resultado = suma(param1,param2,param3);
        System.out.println(resultado);

    }

    private static int suma(int i, int j, int k) {
        return i + j + k;
    }
}
