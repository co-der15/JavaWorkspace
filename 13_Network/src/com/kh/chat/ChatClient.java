package com.kh.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {
	      // 클라이언트용 프로그램
	      Scanner sc = new Scanner(System.in);
	      BufferedReader br = null;
	      PrintWriter pw = null;

	      try {
	         Socket socket = new Socket("127.0.0.1", 6780);
	         // 객체가 생성되면 자동으로 서버와 연결됨

	         // 스트림 생성하고, 입출력 처리함
	         br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	         pw = new PrintWriter(socket.getOutputStream());

	         do {
	            System.out.print("전송할 메세지 : ");
	            String sendMessage = sc.nextLine();
	            // sc.nextLine();

	            pw.println(sendMessage);
	            pw.flush();
	            System.out.println(br.readLine());

	            if (sendMessage.equals("quit")) {
	               br.close();
	               pw.close();
	               socket.close();
	               break;
	            }

	         } while (true);

	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (br != null && pw != null) {
	               br.close();
	               pw.close();
	            }
	         } catch (Exception e2) {
	            e2.printStackTrace();
	         }
	      }
	}
}
