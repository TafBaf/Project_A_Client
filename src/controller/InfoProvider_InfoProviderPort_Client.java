
package controller;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-27T23:21:34.092+03:00
 * Generated source version: 3.1.10
 * 
 */
public final class InfoProvider_InfoProviderPort_Client {

    private static final QName SERVICE_NAME = new QName("http://controller/", "InfoProviderService");

    private InfoProvider_InfoProviderPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = InfoProviderService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        InfoProviderService ss = new InfoProviderService(wsdlURL, SERVICE_NAME);
        InfoProvider port = ss.getInfoProviderPort();  
        
        {
        System.out.println("Invoking getInfo...");
        java.lang.String _getInfo_arg0 = "_getInfo_arg02035429464";
        java.lang.String _getInfo__return = port.getInfo(_getInfo_arg0);
        System.out.println("getInfo.result=" + _getInfo__return);


        }

        System.exit(0);
    }

}
