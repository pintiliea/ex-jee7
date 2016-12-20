
package ex.jaxws.client;

import ex.jaxws.endpoint.Echoer;
import ex.jaxws.endpoint.EchoerService;
import javax.xml.ws.WebServiceRef;

public class Client {
    @WebServiceRef(wsdlLocation = "http://localhost:8080/jaxws-backend/Echoer?wsdl")
    private static EchoerService echoer;

    public static void main(String[] args) {
       System.out.println(echo("CLIENT"));
    }

    private static String echo(String msg) {
        Echoer port = echoer.getEchoerPort();
        return port.echo(msg);
    }
}
