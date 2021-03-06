package controller;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-02T17:32:50.703+03:00
 * Generated source version: 3.1.10
 * 
 */
@WebServiceClient(name = "WS_LibraryService", 
                  wsdlLocation = "http://localhost:8080/project_1/services/WS_LibraryPort?wsdl",
                  targetNamespace = "http://controller/") 
public class WSLibraryService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://controller/", "WS_LibraryService");
    public final static QName WSLibraryPort = new QName("http://controller/", "WS_LibraryPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/project_1/services/WS_LibraryPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WSLibraryService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/project_1/services/WS_LibraryPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WSLibraryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WSLibraryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSLibraryService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WSLibraryService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WSLibraryService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WSLibraryService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WSLibrary
     */
    @WebEndpoint(name = "WS_LibraryPort")
    public WSLibrary getWSLibraryPort() {
        return super.getPort(WSLibraryPort, WSLibrary.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSLibrary
     */
    @WebEndpoint(name = "WS_LibraryPort")
    public WSLibrary getWSLibraryPort(WebServiceFeature... features) {
        return super.getPort(WSLibraryPort, WSLibrary.class, features);
    }

}
