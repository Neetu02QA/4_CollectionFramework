package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		
	//current date current time
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
		System.out.println(d.toString());
		
	}

}
