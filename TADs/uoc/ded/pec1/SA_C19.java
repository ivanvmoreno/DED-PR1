package uoc.ded.pec1;

import java.util.Date;

public interface SA_C19 {
    /** Adds a user into the system
     * @pre true
     * @post a new user is registered in the system, or an existing user 
     *  has been updated
     * @param user_id ID of the user
     * @param user_name user first name
     * @param surname user surname (last name)
     * @param birthdate user birthdate
     * @param cert COVID certificate of the user */
    void addUser(String user_id, String user_name, String surname, 
        Date birthdate, CovidCertificate cert);
    
    /** Adds or updates an organization into the system
     * @pre a valid organization which may or may not be already 
     *  registered in the system
     * @post a new organization is registered in the system, or an existing organization 
     *  has been updated 
     * @param org_id ID of the organization
     * @param name name of the organization
     * @param description description of the organization */
    void addOrganization(String org_id, String name, String description);

    /** Registers an event application into the system 
     * @pre the specified application is not present in the system
     * @post the application is registered to the system
     * @param app_id ID of the application
     * @param event_id ID of the event
     * @param org_id ID of the organization
     * @param event_date date of the event
     * @param online true for on-line, false for in-person
     * @param capacity maximum capacity */
    void addApplication(String app_id, String event_id, String org_id, 
        Date event_date, boolean online, short capacity);

    /** Approves an already registered event application
     * @pre an existing application in the system
     * @post getAllEvents().size() == $old(getAllEvents().size()) + 1
     * @param app_id ID of the application to validate
     * @param processing_date date of validation */
    void approveApplication(String app_id, Date processing_date);
    
    /** Rejects an already registered event application
     * @pre an existing application in the system
     * @post totalRejectedApplications() == $old(totalRejectedApplications()) + 1
     * @param app_id ID of the application to reject
     * @param processing_date date of rejection
     * @param reason description of the rejection criteria */
    void rejectApplication(String app_id, Date processing_date, String reason);

    /** Assigns a ticket to a user for a registered event
     * @pre an existing user and event
     * @post getUserActivities(user_id) == $old(getUserActivities(user_id)) + 1
     *  or throws an error if the user or event are non existent
     * @param user_id ID of the user who buys the ticket
     * @param event_id ID of the event of the ticket */
    void purchaseTicket(String user_id, String event_id);

    /** Assigns a seat to a ticket pending assignation
     * @pre an existing event with at least one purchased ticket
     * @post the event will have a seat assigned to the first
     *  ticket in the queue
     * @param event_id ID of the event in which to assign the seat
     * @param seat_id ID of the seat to assign */
    void assignSeat(String event_id, String seat_id);

    /** Returns the total rejected event applications
     * @pre true
     * @post $return == $old(totalRejectedApplications()) or throws an error 
     *  if no applications have been rejected
     * @return total rejected applications  */
    short totalRejectedApplications();

    /** Returns the average of rejected event applications
     * @pre true
     * @post $return == $old(avgRejectedApplications())
     * @return a fractional between 0 and 1 specifying the ratio of approved to rejected 
     *  applications is returned */
    float avgRejectedApplications();

    /** Returns all activities associated to an organzation
     * @pre an existing organization
     * @post $return == $old(getOrgEvents())
     *  or throws an exception if the organization have no activities
     * @param org_id ID of the organization
     * @return a list of all the activities linked to the organization */
    Event[] getOrgEvents(String org_id);

    /** Returns all the events registered in the system
     * @pre true
     * @post $return == $old(getAllEvents()) 
     *  or throws an exception if no events exist
     * @return a list of all the events registered in the system */
    Event[] getAllEvents();

    /** Returns all the activities a user has attended to
     * @pre an existing user
     * @post $return == $old(getUserActivities())
     *  or throws an exception if the user has not attended any activities
     * @param user_id ID of the user to fetch all activities from
     * @return a list of all the activities the user has tickets for */
    Event[] getUserActivities(String user_id);

    /** Adds a rating from a user to an event
     * @pre an existing user and event
     * @post $exists(i:getActivityRatings(act_id),i.getUserId().equals(user_id))
     * @param user_id ID of the reviewer
     * @param act_id ID of the event to review
     * @param num_rating numerical value of the review
     * @param desc_rating text-based review of the event */
    void addRating(String user_id, String act_id, byte num_rating, String desc_rating);

    /** Returns a list of all the ratings associated to an event
     * @pre an existing event
     * @post $return == $old(getActivityRatings(event_id))
     *  or throws an exception if there are no ratings for the event
     * @param event_id ID of the event
     * @return list of all ratings of the event */
    Rating[] getActivityRatings(String event_id);

    /** Returns the most active (i.e. with the most attended activities) beta tester
     * @pre true
     * @post $return == $old(mostActiveTester()) or throws an exception if no users 
     *  with tickets exist
     * @return user with most attended activities */
    User mostActiveTester();

    /** Returns the top rated event in the system
     * @pre true
     * @post $return == $old(mostValuedActivity())
     *  or throws an exception if no rated activities exist
     * @return event with the highest averaged rating */
    Event mostValuedActivity();
}
