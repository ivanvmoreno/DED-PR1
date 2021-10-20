package uoc.ded.pec1;

import java.util.Date;

public interface EventBase {
    /** Returns the ID of the event
     * @pre true
     * @post $return == $old(getId())
     * @return event ID */
    String getEventId();

    /** Returns the organization associated to the event
     * @pre true
     * @post $return == $old(getOrganization())
     * @return event organization ID */
    Organization getOrganization();

    /** Returns the date that the event is held
     * @pre true
     * @post $return == $old(getEventDate())
     * @return date of the event */
    Date getEventDate();

    /** Returns whether an event is handled online, or in person
     * @pre true
     * @post $return == $old(isOnline())
     * @return true if it is held online, false if in person */
    boolean isOnline();

    /** Returns the maximum user capacity of the event
     * @pre true
     * @post $return == $old(getCapacity())
     * @return maximum capacity of the event */
    short getCapacity();
}
