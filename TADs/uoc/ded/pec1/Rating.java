package uoc.ded.pec1;

import java.util.Date;

public interface Rating {
     /** Returns the date of the rating
     * @pre true
     * @post $return == $old(getId())
     * @return date of the rating */
    String getId();

    /** Returns the date of the rating
     * @pre true
     * @post $return == getDate() && getDate() == $old(getDate())
     * @return date of the rating */
    Date getDate();

    /** Returns the ID of the user which submitted the rating
     * @pre true
     * @post $return == $old(getUserId())
     * @return ID of the user which submitted the rating */
    String getUserId();

    /** Returns the ID of the event rated
     * @pre true
     * @post $return == $old(getEventId())
     * @return ID of the event rated */
    String getEventId();

    /** Returns the numerical user rating
     * @pre true
     * @post $return == $old(getNumerical())
     * @return numerical user rating */
    byte getNumerical();

    /** Returns the text-based user rating
     * @pre true
     * @post $return == $old(getText())
     * @return text-based user rating */
    String getText();
}
