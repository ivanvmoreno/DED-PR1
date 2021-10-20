package uoc.ded.pec1;

import java.util.Date;

public interface User {
    /** Returns the ID of the user
     * @pre true
     * @post $return == $old(getId())
     * @return user ID */
    String getId();

    /** Returns the first name of the user
     * @pre true
     * @post $return == $old(getName())
     * @return user first name */
    String getName();
    
    /** Returns the last name of the user
     * @pre true
     * @post $return == $old(getSurname())
     * @return user last name */
    String getSurname();
    
    /** Returns the birthdate of the user
     * @pre true
     * @post $return ==  $old(getBirthdate())
     * @return user birthdate */
    Date getBirthdate();
    
    /** Returns the COVID certificate associated to the user
     * @pre true
     * @post $return == $old(getCovidCert())
     * @return user COVID certificate */
    CovidCertificate getCovidCert();
    
    /** Replaces the user COVID certificate
     * @pre true
     * @post getCovidCert().equals(cert)
     * @param cert COVID certificate to assign to the user */
    void addCovidCert(CovidCertificate cert);

    /** Return all the user tickets
     * @pre true
     * @post $return == $old(getTickets()) or throws an exception if 
     *  the user has not purchased any tickets 
     * @return list of all tickets associated to the user */
    Ticket[] getTickets();

    /** Assigns a ticket to the user
     * @pre ticket.getUser().equals(this)
     * @post $exists(i:getTickets(),i.equals(ticket))
     * @param ticket ticket to assign to the user */
    void addTicket(Ticket ticket);
}
