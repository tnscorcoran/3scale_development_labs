package com.redhat.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-06-15T14:18:39.932-03:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "Stores", 
                  wsdlLocation = "file:/home/pszuster/Documents/RedHat/SME/Workshops/3Scale/workspace/Stores/src/main/resources/wsdl/Stores.wsdl",
                  targetNamespace = "http://www.rhmart.com/Stores/") 
public class Stores_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.rhmart.com/Stores/", "Stores");
    public final static QName StoresSOAP = new QName("http://www.rhmart.com/Stores/", "StoresSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/pszuster/Documents/RedHat/SME/Workshops/3Scale/workspace/Stores/src/main/resources/wsdl/Stores.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Stores_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/pszuster/Documents/RedHat/SME/Workshops/3Scale/workspace/Stores/src/main/resources/wsdl/Stores.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Stores_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Stores_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Stores_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Stores_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Stores_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Stores_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns Stores
     */
    @WebEndpoint(name = "StoresSOAP")
    public Stores getStoresSOAP() {
        return super.getPort(StoresSOAP, Stores.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Stores
     */
    @WebEndpoint(name = "StoresSOAP")
    public Stores getStoresSOAP(WebServiceFeature... features) {
        return super.getPort(StoresSOAP, Stores.class, features);
    }

}
