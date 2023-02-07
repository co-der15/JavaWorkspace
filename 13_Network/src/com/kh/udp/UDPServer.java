package com.kh.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) {
		// 1. UDP 서버 연결 포트 번호 설정
		int port = 7700;
		
		try {
			// 2. 서버 연결 소켓 생성
			DatagramSocket socket = new DatagramSocket(port);
		
			// 3. 연력할 사용자와 정보를 주고 받기 위한 DatagramPacket 준비
			DatagramPacket inPacket, outPacket;
		
			byte[] inMsg = new byte[100];
			byte[] outMsg = "어서와, UDP는 처음이지?".getBytes();
			
			// 4. 전달받을 메시지를 표현할 객체 생성
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			
			// 5. 사용자가 전달한 메시지 받기
			socket.receive(inPacket);
			
			// 6. 받은 정보 꺼내기
			System.out.println("받은 메시지 : " + new String(inMsg));
			
			// 7. 전달한 사용자의 정보를 사용해
			// 	   서버의 메시지 보내기
			InetAddress client = inPacket.getAddress();
			int clientPort = inPacket.getPort();
			
			outPacket = new DatagramPacket(outMsg, outMsg.length, client, clientPort);
			
			socket.send(outPacket);
			
			// 8. 소켓 종료
			socket.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
