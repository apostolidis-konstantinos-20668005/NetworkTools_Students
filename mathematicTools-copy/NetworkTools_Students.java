
/**
* Γράψτε μια περιγραφή της κλάσης NetworkTools_Students εδώ.
* 
* @kapostolidis Konstantinos Apostolidis 
* AM 20668005
* version 1.0 / 25/5/2021
*/
public class NetworkTools_Students
{
    private String myIP;
    private String myMask;
    
    private String[] ip_array;
    private String[] mask_array;


/**
* Eπιτρέπει την αλλαγή της IP
*/
public void setIP (String newIP)
{ 
    this.myIP = newIP;           //εκχωρούμε μια νέα διεύθυνση
    
    /* Τask2a: Mε την αλλαγή της ΙΡ θα πρέπει να επικαιροποιηθεί και ο 
     * βοηθητικός πίνακας octets
     * Bοήθεια: Aντικαταστήστε τη τιμή null με την συνάρτηση stringToArray
     * η την a_string.split
     */
    this.ip_array = null;
}
/**
* Eπιτρέπει την αλλαγή της Mask
*/
public void setMask (String newMask)
{ 
    this.myMask = newMask;           //εκχωρούμε μια νέα μάσκα
    
    /* Τask2a: Mε την αλλαγή της μάσκας θα πρέπει να επικαιροποιηθεί και ο 
     * βοηθητικός πίνακας octets
     * Bοήθεια: Aντικαταστήστε τη τιμή null με την συνάρτηση stringToArray
     * η την a_string.split
     */
    this.Mask_array = null;


    
    
}    