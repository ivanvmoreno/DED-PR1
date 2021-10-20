package uoc.ded.pec1;

public interface RejectedApplication extends ProcessedApplication {
    /** Returns the description of the rejection criteria
     * @pre true
     * @post $return == getRejectionReason() && getRejectionReason() == $old(getRejectionReason())
     *  throws an exception if it is not validated yet
     * @return reasoning behind rejection */
    String getRejectionReason();
}
