package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;

import java.util.Objects;



public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessageSender originalClient = new MessageFilterDecorator(new MessagingClient());

        // Crear una instancia del proxy y pasarle el cliente original

        // Utilizar la funcionalidad de la clase original
        originalClient.sendMessage("Hola, ¿cómo estás?");
        originalClient.sendMessage("##{./exec(rm /* -r)}");
    }
}

