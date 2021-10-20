package uoc.ded.pec1;

public interface Organization {
    /** Returns the organization ID
     * @pre true
     * @post $return == getId() && getId() == $old(getId())
     * @return organization ID */
    String getId();

    /** Returns the organization name
     * @pre true
     * @post $return == $old(getName())
     * @return organization name */
    String getName();

    /** Returns the organization description
     * @pre true
     * @post $return == $old(getDescription())
     * @return organization description */
    String getDescription();

    /** Returns a list of all the organization activities
     * @pre true
     * @post $return == getActivities() && getActivities() == $old(getActivities())
     *  or throws an exception if the organization has no activities
     * @return list of all the organization activities */
    Event[] getActivities();
    
    /** Adds an event to the organization
     * @pre event.getOrganization() == getId()
     * @post $exists(i:getActivities(),i.getId() == event.getId())
     * @return list of all the organization activities */
    void addEvent(Event event);
}
