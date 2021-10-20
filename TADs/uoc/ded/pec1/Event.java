package uoc.ded.pec1;

public interface Event extends EventBase { 
    /** Checks  all seats have been booked
     * @pre true
     * @post $return == (getSeats().size() == getCapacity())
     * @return true if there are remaining seats, false otherwise */
    boolean isFull();

    /** Returns a list of all the purchased event tickets
     * @pre true
     * @post $return == $old(getSeats()) or throws an exception if
     *  no ticket purchases have been yet registered
     * @return list of all event seats */
    Ticket[] getTickets();

    /** Registers a new ticket purchase
     * @pre ticket.getEvent().equals(this)
     * @post $exists(i:getTickets(),i.equals(ticket))
     * @param ticket purchased ticket to register */
    void addTicket(Ticket ticket);
    
    /** Returns a list of all the event seats
     * @pre true
     * @post $return == $old(getSeats()) or throws an exception if
     *  no seats have been yet assigned
     * @return list of all event seats */
    Seat[] getSeats();

    /** Assigns a seat to a ticket
     * @pre true
     * @post $exists(i:getSeats(),i.getTicket().equals(ticket))
     * @param ticket ticket for which to assign a seat
     * @param seat_id seat to assign */
    void assignSeat(Ticket ticket, Seat seat);

    /** Returns a list of all ratings associated to the event
     * @pre true
     * @post returns a list of all ratings associated to the event
     *  or throws an exception if there are no ratings associated
     * @return list of all ratings of the event */
    Rating[] getRatings();

    /** Adds a rating to the event
     * @pre true
     * @post $exists(i:getRatings(),i.getId() == rating.getId())
     * @param rating rating to add to the event */
    void addRating(Rating rating);
}
