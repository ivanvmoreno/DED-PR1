package uoc.ded.pec1;

import java.util.Date;

public interface Application extends EventBase {
    /** Returns the ID of the application
     * @pre true
     * @post $return == $old(getApplicationId())
     * @return ID of the application */
    String getApplicationId();

    /** Returns the date of submission of the application
     * @pre true
     * @post $return == $old(getSubmissionDate())
     * @return date of the submission */
    Date getSubmissionDate();

    /** Returns the description of the application
     * @pre true
     * @post $return == $old(getApplicationDescription())
     * @return description of the event */
    String getApplicationDescription();
}
