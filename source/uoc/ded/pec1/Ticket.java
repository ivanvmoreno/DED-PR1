package uoc.ded.pec1;

public interface Ticket {
    /** Returns the user of the ticket owner
     * @pre true
     * @post $return == getUser() && getUser() == $old(getUser())
     * @return ticket owner user */
    User getUser();

    /** Returns event of the ticket
     * @pre true
     * @post $return == $old(getEvent())
     * @return event ID */
    Event getEvent(); 

    /** Returns the seat assigned to the user
     * @pre true
     * @post $return == $old(getSeat()) or throws an exception if the
     *  ticket has not been yet assigned a seat
     * @return assigned seat */
    Seat getSeat();

    /** Updates the seat assigned to the user at the event
     * @pre seat.getTicketId() == getId()
     * @post getSeatId() == seat.getId()
     * @param seat assigned seat */
    void assignSeat(Seat seat);
}
