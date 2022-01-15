package com.wuhp.net.case1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress address = InetAddress.getByName("localhost");
        // InetAddress address = InetAddress.getByName("wuhp");
        InetAddress address = InetAddress.getByName("192.168.101.11");
        System.out.println("address = " + address);
        System.out.println("address.getAddress() = " + address.getAddress());
        System.out.println("address.getHostAddress() = " + address.getHostAddress());
        System.out.println("address.getCanonicalHostName() = " + address.getCanonicalHostName());
        System.out.println("address.getHostName() = " + address.getHostName());


    }
}
