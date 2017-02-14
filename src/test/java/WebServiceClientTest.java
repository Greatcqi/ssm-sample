import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.junit.Test;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

/**
 * Created by XieChen on 2017/2/13.
 */
public class WebServiceClientTest {
    private final String userName = "hwzhhjypt";
    private final String password = "zlzk_157";
    private final String endpointAddress = "http://10.39.170.106:8888/Service/WebService.asmx";
    @Test
    public void callSMSService() throws ServiceException, MalformedURLException {
        //init caller
        Service service = new Service();
        Call call = (Call) service.createCall();
        call.setTargetEndpointAddress(new java.net.URL(endpointAddress));
        call.setUsername(userName);
        call.setPassword(password);
        //call webservice

    }
}
