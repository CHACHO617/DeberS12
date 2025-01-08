public class Saludo {
    public String generarSaludo(String nombre, String idioma) {
        // Verificar si el nombre es nulo o vacío
        if (nombre == null || nombre.isEmpty()) {
            nombre = "Invitado";
        }

        // Seleccionar el saludo según el idioma
        switch (idioma.toLowerCase()) {
            case "es":
                return "¡Hola, " + nombre + "!";
            case "en":
                return "Hello, " + nombre + "!";
            case "fr":
                return "Bonjour, " + nombre + "!";
            default:
                return "¡Hola, " + nombre + "!";
        }
    }
}
