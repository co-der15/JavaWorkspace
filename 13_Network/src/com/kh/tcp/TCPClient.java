package com.kh.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		// 1. 서버가 설정한  port 번호와 서버 주소 작성하기
		int port = 8800;
		String ip = "127.0.0.1";
		
		try {
			// 2. 서버 객체 생성하기
			Socket socket = new Socket(ip, port);
			
			// 만약 연결에 실패했다면 null 값을 돌려주기 때문에
			// if 조건으로 null인지 먼저 확인을 해주어야 한다!
			if(socket != null) {
				// 3. 클라이언트 연결 객체 IO 스트림 만글기
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				
				PrintWriter pw = new PrintWriter(out);
				
				// 4. 서버와 메시지 주고 방기
				pw.println("하이염, 사용자입니다!");
				
				pw.flush();
				
				System.out.println("서버로부터 정보 받기 : ");
				System.out.println(br.readLine());
				
				// 5. 사용한 IO 객체 반납
				br.close();
				pw.close();
			}
			
			socket.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
		
		
	}

}
