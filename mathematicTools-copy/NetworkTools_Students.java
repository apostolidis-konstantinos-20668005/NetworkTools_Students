
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
 * Κατασευαστής αντικειμένων της κλάσης NetworkTools
 */
public NetworkTools_Students ()
{
    // Παράδειγμα ανάθεσης - αρχικοποίηση μεταβλητών
    myIP = "192.168.1.130";
    myMask = "255.255.255.192";
     
    //Διαχωρισμός των octets μιας διεύθυνσης ΙΡ μετρώντας ένα-ένα τα στοιχεία της. 
    ip_array = new  String[4];
    char c1;
    int pos1=0;
    String octet1="";
     
    for (int i=0; i< myIP.lenght(); i++)
    {
        c1=myIP.charAt(i);
       if (c1 == '.')
       {
          ip_array[pos1] = octet1;
          pos2++;
          octet =""; 
       }
       else
       {
          octet1 = octet1 + String.value0f(c1);
       }
    }
   ip_array[3]=octet1;

   //Διαχωρισμός των octets μιας μάσκας μετρώντας ένα-ένα τα στοιχεία της
   mask_array = new String[4];
   char c2;
   int pos2 = 0;
   String octet2="";
   for (int i=0; i< myMask.length(); i++)
   {
     c2=myMask.charAt(i);
      if (c2 == '.')
     {
         mask_array[pos2] = octet2;
         pos2++;
         octet2 = "";
     }  
     else
     {
          octet2 = octet2 + String.value0f(c2);
     }     
   }
   mask_array[3]=octet2;
}