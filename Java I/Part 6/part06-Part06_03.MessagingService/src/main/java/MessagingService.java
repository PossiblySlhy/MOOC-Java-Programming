import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> messageService;

    public MessagingService() {
        this.messageService = new ArrayList<>();
    }

    public void add(Message message) {
        // If message content is more than 280 characters, don't add to the list
        if (message.getContent().length() > 280) {
            return;
        }

        messageService.add(message);
    }

    public ArrayList<Message> getMessages() {
        return this.messageService;
    }
}
