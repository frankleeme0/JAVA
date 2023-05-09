package WebDesignUDP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Demo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("FRANK-DESKTOP");
        String hostName = byName.getHostName();
        System.out.println("主机名是："+hostName);
        String hostAddress = byName.getHostAddress();
        System.out.println("ip地址是："+hostAddress);
    }
}
