package com.addicted.web;

import java.io.*;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.*;

public class EncryptionServer {
	
	private String algorithm;
	private KeyGenerator keygen;
	private SecureRandom random;
	private Key key;
	private File randDev;
	private Cipher cipher;
	
	public EncryptionServer(String alg) {
		this.algorithm = alg;
		randDev = new File("/dev/random");
		
		try {
			byte[] randData = new byte[100];
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(randDev));
		} catch (FileNotFoundException e) {
			System.err.println("Error reading /dev/random");
			System.err.println("Error initializating EncryptionServer");
			e.printStackTrace();
		}
	}
	
	public byte[] encrypt(String arg) {
		byte[] data = null;
		
		return data;
	}
	
	public String decrypt(byte[] arg) {
		String text = new String();
		
		return text;
	}

}
