
package org.muhia.app.psi.integ.wsdl.am.directdebit;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.math.BigDecimal;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "ServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface ServiceSoap {


    /**
     * @param password
     * @param amount
     * @param merchantWalletMsisdn
     * @param customerMobileNumber
     * @param userName
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "DirectDebitAPI", action = "http://tempuri.org/DirectDebitAPI")
    @WebResult(name = "DirectDebitAPIResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DirectDebitAPI", targetNamespace = "http://tempuri.org/", className = "org.muhia.app.psi.integ.wsdl.am.directdebit.DirectDebitAPI")
    @ResponseWrapper(localName = "DirectDebitAPIResponse", targetNamespace = "http://tempuri.org/", className = "org.muhia.app.psi.integ.wsdl.am.directdebit.DirectDebitAPIResponse")
    String directDebitAPI(
            @WebParam(name = "UserName", targetNamespace = "http://tempuri.org/")
                    String userName,
            @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
                    String password,
            @WebParam(name = "CustomerMobileNumber", targetNamespace = "http://tempuri.org/")
                    String customerMobileNumber,
            @WebParam(name = "Amount", targetNamespace = "http://tempuri.org/")
                    BigDecimal amount,
            @WebParam(name = "MerchantWalletMsisdn", targetNamespace = "http://tempuri.org/")
                    String merchantWalletMsisdn);

}