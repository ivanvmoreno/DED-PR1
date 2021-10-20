package uoc.ded.pec1;

import java.util.Date;

public interface ProcessedApplication extends Application {
    /** Returns the date of validation of the application
     * @pre true
     * @post $return == getProcessedDate() 
     *  && getProcessedDate() == $old(getProcessedDate())
     * @return date of the validation */
    Date getProcessedDate();
}
