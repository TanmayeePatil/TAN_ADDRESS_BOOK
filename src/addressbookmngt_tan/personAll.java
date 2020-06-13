/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbookmngt_tan;

/**
 *
 * @author tanmayee
 */
public class personAll {
    private String first_name;
    private String last_name;
    private String address_person;
    private String city;
    private String state;
    private int zip;
    private int ph_number;
    private int ab_id;
    
    public personAll(){}
    
    public personAll(String first_name,String last_name,String address_person,String city,String state,int zip,int ph_number,int ab_id)
    {
        this.first_name=first_name;
        this.last_name=last_name;
        this.address_person=address_person;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.ph_number=ph_number;
        this.ab_id=ab_id;
    }

    personAll(String string, String string0, String string1, String string2, byte[] bytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    String getFname(){
        return first_name;
    }

    String getLname(){
        return last_name;
    }

    String getAddress(){
        return address_person;
    }

    String getCity(){
        return city;
    }

    String getState(){
        return state;
    }

    int getZip(){
        return zip;
    }

    int getPhone(){
        return ph_number;
    }

    int getAB(){
        return ab_id;
    }

    Object getDiv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


