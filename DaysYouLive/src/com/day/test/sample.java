package com.day.test;

import java.util.*;
import java.io.*;

public class sample {

	 public static void main(String[] args) throws IOException {
	  System.out.print("생년 월일 입력 : ");
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String imsi = br.readLine();
	  Calendar birth = Calendar.getInstance();
	  StringTokenizer sf = new StringTokenizer(imsi, "-");
	  int year = Integer.parseInt(sf.nextToken());
	  int mon = Integer.parseInt(sf.nextToken());
	  int date = Integer.parseInt(sf.nextToken());
	  birth.set(year, mon-1, date);
	  
	  Calendar now = Calendar.getInstance();

	  long  past = birth.getTime().getTime();
	   long  today = now.getTime().getTime();

	   long day = (today - past)/(24*60*60*1000);

	  System.out.println(day+"일");
	 }
	}

