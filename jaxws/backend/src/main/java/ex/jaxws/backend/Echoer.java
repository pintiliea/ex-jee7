
package ex.jaxws.backend;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class Echoer {

    private final String message = Echoer.class.getName() +" echoes: ";

    public void Echoer() {
    }

    @WebMethod
    public String echo(String msg) {
        return message + msg + ".";
    }
}
