package com.addicted.web;

import java.io.*;

public class RandomDeviceTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File randomDevice = new File("/dev/random");
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(randomDevice));
		byte[] input = new byte[100];
		int result = bin.read(input);
		System.out.println("Bytes read: " + result);
		if(result > 1) {
			String contents = new String(input);
			System.out.println(contents);
		}
	}

}
