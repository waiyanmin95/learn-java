package turing.JavaSE.Day24;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("local = " + local);

        InetAddress host = InetAddress.getByName("www.google.com");
        System.out.println("host = " + host);

        InetAddress[] allhosts = InetAddress.getAllByName("www.google.com");
        for (InetAddress i : allhosts) {
            System.out.println("allhosts = " + i);
        }
        for (int j = 0; j < allhosts.length; j++) {
            System.out.println("ALLHosts = " + allhosts[j]);
        }
    }
}
