
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
 * 2017-04-02T17:32:50.640+03:00
 * Generated source version: 3.1.10
 * 
 */
public final class WSLibrary_WSLibraryPort_Client {

    private static final QName SERVICE_NAME = new QName("http://controller/", "WS_LibraryService");

    private WSLibrary_WSLibraryPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = WSLibraryService.WSDL_LOCATION;
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
      
        WSLibraryService ss = new WSLibraryService(wsdlURL, SERVICE_NAME);
        WSLibrary port = ss.getWSLibraryPort();  
        
        {
        System.out.println("Invoking getBooks...");
        java.util.List<controller.Book> _getBooks__return = port.getBooks();
        System.out.println("getBooks.result=" + _getBooks__return);


        }
        {
        System.out.println("Invoking updateBook...");
        controller.Book _updateBook_arg0 = new controller.Book();
        _updateBook_arg0.setAuthor("Author-1176310819");
        _updateBook_arg0.setId(808573613);
        _updateBook_arg0.setName("Name1233909205");
        port.updateBook(_updateBook_arg0);


        }
        {
        System.out.println("Invoking addBook...");
        controller.Book _addBook_arg0 = new controller.Book();
        _addBook_arg0.setAuthor("Author-1439509052");
        _addBook_arg0.setId(-2122501925);
        _addBook_arg0.setName("Name-96643692");
        port.addBook(_addBook_arg0);


        }
        {
        System.out.println("Invoking deleteBook...");
        java.lang.String _deleteBook_arg0 = "_deleteBook_arg0-327258086";
        port.deleteBook(_deleteBook_arg0);


        }

        System.exit(0);
    }

}