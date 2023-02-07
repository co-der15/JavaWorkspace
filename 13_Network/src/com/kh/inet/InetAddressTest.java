package com.kh.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
			
		InetAddressTest inet = new InetAddressTest();
		
		inet.test();
	}
	
	public void test() {
		
		try {
			System.out.println("------ www.youtube.com ------");
			InetAddress ip = InetAddress.getByName("www.youtube.com");
		
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println("toString() : " + ip); // toString()은 생략
			
			System.out.println("------ www.google.com ------");
			InetAddress ip2 = InetAddress.getByName("www.google.com");
			
			System.out.println("getHostName() : " + ip2.getHostName());
			System.out.println("getHostAddress() : " + ip2.getHostAddress());
			System.out.println("toString() : " + ip2); // toString()은 생략
			
			InetAddress[] naverAddr = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress inet : naverAddr) {
				System.out.println("네이버 정보 : " + inet);
			}
					
		} catch (UnknownHostException e) {
			
			System.out.println("세상에! 그런 사이트는 없어요!");
			
		}
		
	}

}
