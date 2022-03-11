package com.lq.acc;

import java.io.File;

public class GetDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Student\\Documents");
		if (f.isDirectory()) {
			String[] contents = f.list();
			for (String s : contents) {
				System.out.println(s);
			}
		}
	}

}
