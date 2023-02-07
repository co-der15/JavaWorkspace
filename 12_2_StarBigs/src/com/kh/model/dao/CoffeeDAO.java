package com.kh.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.model.vo.Coffee;

public class CoffeeDAO {
	 // IO :입출력 객체
	 //  컴퓨터에서 데이터를 저장, 불러오는 자원(객체)
	 //  읽어서 오는 것 : InputStream (Reader)
	 //  밖으로 꺼내는 것 : OutputStream (Writer)
	 // 기본 스트림
	 //    : 혼자서도 IO 기능을 수행할 수 있는 객체
	 // 보조 스트림
	 //    : 기본 스트림의 기능을 보조하는 객체
	 // Buffered In/Out : 임시공간을 활용하여 데이터를 한번에
	 //                   모아서 입, 출력하는 객체
	 // Data In/Out : 입력한 값의 자료형에 따라 byte단위로
	 //               잘라서 읽어주는 객체
	 // InputStreamReader / OutputStreamWriter
	 //     : byte를 문자형으로 바꾸어 주는 객체
	 // Object In/Out : 데이터를 객체 단위로 저장, 불러오는 객체
	
	public int saveList(ArrayList<Coffee> list) {
		 // 주문 목록을 파일로 저장하는 메소드
		 int result = -1;
		 
		 try(ObjectOutputStream oos = new ObjectOutputStream(
				 			  new FileOutputStream("coffee.dat"))){
			 // 7 버전
			 for(Coffee co : list) {
				 oos.writeObject(co);
			 }
			 
			 // 일회성 반복문 (Stream API)
			 // list.forEach(co -> outStream(oos, co));
			 			 
			 result = 1;
			 
		 } catch (FileNotFoundException e) {
			 System.out.println("파일이 존재하지 않습니다!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("개발 담당자 기창 사장님께 연락해주세요!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return result;
	}
	
	public ArrayList<Coffee> openList(){
		 // 주문 목록을 불러오는 기능 메소드
		 
		 // 불러온 주문 목록을 저장할 객체
		 ArrayList<Coffee> list = new ArrayList<>();
		
		 try(ObjectInputStream oin = new ObjectInputStream(
				 					new FileInputStream("coffee.dat"))
				 ) {
			 
			 while(oin.available() != -1) {
				 list.add((Coffee)oin.readObject());
			 }
			 
		 } catch (FileNotFoundException e) {
			System.out.println("아직 파일이 없습니다 ㅠㅠ");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return list;
	}
}
