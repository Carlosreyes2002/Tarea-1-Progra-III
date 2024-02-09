import java.util.Random;

public class Tarea1 {
    static String[] palabra = { "Hoy es tu dia de suerte.",
    "La paciencia es la clave del exito.",
    "El viaje de mil millas comienza con un paso.",
    "La fortuna favorece a los valientes.",
    "Confia en tus instintos.",
    "El conocimiento es el mejor regalo.",
    "La perseverancia supera la habilidad.",
    "La vida es lo que pasa mientras estas ocupado haciendo otros planes."};

    public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(palabra.length);
        System.out.println(palabra[r]);
    }
}



