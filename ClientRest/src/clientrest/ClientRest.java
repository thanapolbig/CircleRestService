/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientrest;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.HelloJerseyClient;

/**
 *
 * @author ASUS
 */
public class ClientRest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloJerseyClient client = new HelloJerseyClient();
        String xml = client.getXml("10");
        Result res = JAXB.unmarshal(new StringReader(xml),Result.class);
        System.out.println("line circle = " + res.getCircle());
        System.out.println("area circle = " + res.getareaCircle());

        

    }
    
}
