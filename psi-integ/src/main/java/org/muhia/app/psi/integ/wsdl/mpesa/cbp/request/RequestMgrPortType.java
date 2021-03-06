
package org.muhia.app.psi.integ.wsdl.mpesa.cbp.request;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RequestMgrPortType", targetNamespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RequestMgrPortType {


    /**
     * 
     * @param requestMsg
     * @param requestSOAPHeader
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GenericAPIRequest")
    @WebResult(name = "ResponseMsg", targetNamespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request", partName = "ResponseMsg")
    public String genericAPIRequest(
        @WebParam(name = "RequestMsg", targetNamespace = "http://api-v1.gen.mm.vodafone.com/mminterface/request", partName = "RequestMsg")
        String requestMsg,
        @WebParam(name = "RequestSOAPHeader", targetNamespace = "http://www.huawei.com.cn/schema/common/v2_1", header = true, partName = "RequestSOAPHeader")
        RequestSOAPHeader requestSOAPHeader);

}
