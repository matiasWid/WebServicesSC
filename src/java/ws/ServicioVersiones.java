package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName="ServicioVersiones")
public class ServicioVersiones {


    @WebMethod(operationName="hello")
    public String hello(@WebParam(name="name") String txt) {
        return "Hello "+txt+" !";
    }
}
