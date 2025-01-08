public class Main {
    public static void main(String[] args) {
        System.out.println("***************");
        System.out.println("* JAVA PROJECT *");
        System.out.println("***************");

        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo", "es")); // Español
        System.out.println(saludo.generarSaludo("World", "en")); // Inglés
        System.out.println(saludo.generarSaludo("Mundo", "fr"));      // Francés

        // Crear instancia de la clase despedida
        Despedida despedida = new Despedida();
        System.out.println(despedida.generarDespedida("Mundo"));
    }
}