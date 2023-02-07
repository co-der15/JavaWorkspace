package com.kh.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		// 1. 사용할 서버의 포트번호
		int port = 7700;
		String ip = "127.0.0.1"; // loopBack 주소(컴퓨터 자기자신)
		
		
		try {
			// 2. 서버와 연결할 객체 생성
			DatagramSocket socket = new DatagramSocket();
			InetAddress server = InetAddress.getByName(ip);
			
			// 3. 주고 받을 패켓 선언
			byte[] inMsg = new byte[100]; // 받을올 양
			byte[] outMsg = "이 편지는 1960년 영국에서 시작되었으며...".getBytes(); // 보낼 메시지
			
			// 4. 패켓에 메시지 담기
			DatagramPacket inPacket = new DatagramPacket(inMsg, inMsg.length);
			DatagramPacket outPacket = new DatagramPacket(outMsg, outMsg.length, server, port);
			
			socket.send(outPacket);
			socket.receive(inPacket);
			
			System.out.println("서버에서 받은 정보 : " + new String(inMsg));
			
			// 5. 소켓 종료
			socket.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}

	}
	

}
