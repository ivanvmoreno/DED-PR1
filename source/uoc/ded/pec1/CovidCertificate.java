package uoc.ded.pec1;

import java.util.Date;

public interface CovidCertificate {
    /** Returns the ID of the COVID certificate
     * @pre true
     * @post $return == $old(getId())
     * @return ID of the certificate */
    String getId();

    /** Returns the date of the certificate
     * @pre true
     * @post $return == $old(getDate())
     * @return date of the certificate */
    Date getDate();
}
