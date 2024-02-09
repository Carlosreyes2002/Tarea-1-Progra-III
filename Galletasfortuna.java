import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Galletasfortuna extends JFrame {

    private JButton botonObtenerMensaje;
    private JLabel etiquetaMensaje;

    private String[] mensajes = {
            "Hoy es tu día de suerte.",
            "La paciencia es la clave del éxito.",
            "El viaje de mil millas comienza con un paso.",
            "La fortuna favorece a los valientes.",
            "Confía en tus instintos.",
            "El conocimiento es el mejor regalo.",
            "La perseverancia supera la habilidad.",
            "La vida es lo que pasa mientras estás ocupado haciendo otros planes."
    };

    public Galletasfortuna() {
        super("Galletas de la Fortuna");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botonObtenerMensaje = new JButton("Obtener Mensaje");
        etiquetaMensaje = new JLabel();

        botonObtenerMensaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMensajeAleatorio();
            }
        });

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));
        panel.add(botonObtenerMensaje);
        panel.add(etiquetaMensaje);

        add(panel);

        setVisible(true);
    }

    private void mostrarMensajeAleatorio() {
        Random random = new Random();
        int indice = random.nextInt(mensajes.length);
        String mensaje = mensajes[indice];
        etiquetaMensaje.setText(mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Galletasfortuna();
            }
        });
    }
}
