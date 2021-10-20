package uoc.ded.pec1;

public interface Seat {
    /** Returns the ID of the seat
     * @pre true
     * @post $return == $old(getId())
     * @return ID of the seat */
    String getId();
    
    /** Returns the ticket to which the seat is assigned
     * @pre true
     * @post $return == $old(getTicket())
     * @return ticket assigned */
    Ticket getTicket();
}
