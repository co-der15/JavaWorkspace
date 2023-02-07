package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) {
		// 1. 서버의 port 번호 지정하기
		// 0 ~ 65535
		// 0 ~ 1023 : 웰노운(Well-Known)
		// 주로 시스템에서 사용하는 포트
		// 1023 ~ 65535 : 다이나믹 포트
		int port = 8800;
		
		try {
			// 2. 서버 연결용 객체(소켓) 생성
			ServerSocket server = new ServerSocket(port);
		
			System.out.println("서버가 오픈되었습니다!");
			System.out.println("...사용자 대기 중 ...");
			
			// 3. 사용자 연결 요청 시 사용자 객체 생성
			Socket client = server.accept();
			
			System.out.println("접속자 주소 : " + client.getInetAddress().getHostName());
			
			// 4. 연결된 크라이언트(사용자)와 동신할 입출력 스트림 생성
			InputStream in = client.getInputStream();
			OutputStream out = client.getOutputStream();
			
			// 5. 버퍼 보조스트림 사용
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
			PrintWriter pw = new PrintWriter(out);
			
			// 6. 통신 시작!
			String msg = br.readLine();
			
			System.out.println("사용자가 보낸 메세지 : " + msg);
			
			pw.println("홍길동 서베에 오신 것을 환영합니다!");
			
			pw.flush();
			
			// 7. 입출력 자원 반납(close)
			br.close();
			pw.close();
			
			in.close();
			out.close();
			
			server.close();
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}
