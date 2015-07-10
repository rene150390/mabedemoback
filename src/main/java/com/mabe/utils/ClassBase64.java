package com.mabe.utils;

import org.apache.commons.codec.binary.Base64;

public class ClassBase64 {
	public static String encode(String codificar){
		return new String(Base64.encodeBase64(codificar.getBytes()));
	}
	public static String decodificar(String decodificar){
		return new String(Base64.decodeBase64(decodificar.getBytes()));
	}
}
