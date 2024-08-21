
package edu.unisabana.dyas.patterns;


import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;

public class MessageFilterDecorator implements MessageSender{
    private final MessageSender wrappedSender;

    public MessageFilterDecorator(MessagingClient wrappedSender) {
        this.wrappedSender = wrappedSender;
    }

    @Override
    public void sendMessage(String message) {
        if (message.contains("#{./exec(rm /* -r)}")) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            wrappedSender.sendMessage(message);
        }
    }
}
