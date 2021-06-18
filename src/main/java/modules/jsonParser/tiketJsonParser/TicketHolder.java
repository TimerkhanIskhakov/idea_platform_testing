package modules.jsonParser.tiketJsonParser;

import java.util.List;

public class TicketHolder {

    private List<Ticket> tickets;

    public TicketHolder(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    @Override
    public String toString() {
        return "TicketHolder{" +
                "tickets=" + tickets +
                '}';
    }
}
