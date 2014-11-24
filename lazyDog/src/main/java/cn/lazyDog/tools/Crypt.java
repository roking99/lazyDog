package cn.lazyDog.tools;


import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class Crypt {
	private static String Algorithm = "DES"; // 定义 加密算法,可用DES,DESede,Blowfish
	static boolean debug = false;

	static {
		Security.addProvider(new com.sun.crypto.provider.SunJCE());
	}

	// 生成密钥, 注意此步骤时间比较长
	public static byte[] getKey() throws Exception {
		KeyGenerator keygen = KeyGenerator.getInstance(Algorithm);
		SecretKey deskey = keygen.generateKey();
		if (debug)
			System.out.println("生成密钥:" + byte2hex(deskey.getEncoded()));
		return deskey.getEncoded();
	}

	 // 加密
	 public static byte[] encode(byte[] input, byte[] key) throws Exception {
	 SecretKey deskey = new javax.crypto.spec.SecretKeySpec(key, Algorithm);
	 if (debug) {
	 System.out.println("加密前的二进串:" + byte2hex(input));
	 System.out.println("加密前的字符串:" + new String(input));
	 }
	 Cipher c1 = Cipher.getInstance(Algorithm);
	 c1.init(Cipher.ENCRYPT_MODE, deskey);
	 byte[] cipherByte = c1.doFinal(input);
	 if (debug)
	 System.out.println("加密后的二进串:" + byte2hex(cipherByte));
	 return cipherByte;
	 }
	
	 // 解密
	 public static byte[] decode(byte[] input, byte[] key) throws Exception {
	 SecretKey deskey = new javax.crypto.spec.SecretKeySpec(key, Algorithm);
	 if (debug)
	 System.out.println("解密前的信息:" + byte2hex(input));
	 Cipher c1 = Cipher.getInstance(Algorithm);
	 c1.init(Cipher.DECRYPT_MODE, deskey);
	 byte[] clearByte = c1.doFinal(input);
	 if (debug) {
	 System.out.println("解密后的二进串:" + byte2hex(clearByte));
	 System.out.println("解密后的字符串:" + (new String(clearByte)));
	 }
	 return clearByte;
	 }

	public static String DataEncrypt(String str, byte[] key) {
		String encrypt = null;
		try {
			byte[] ret = encode(str.getBytes("UTF-8"), key);
			encrypt = new String(Base64.encode(ret));
		} catch (Exception e) {
			
			encrypt = str;
		}
		return encrypt;
	}

	public static String DataDecrypt(String str, byte[] key) {
		String decrypt = null;
		try {
			byte[] ret = decode(Base64.decode(str), key);
			decrypt = new String(ret, "UTF-8");
		} catch (Exception e) {
			
			decrypt = str;
		}
		return decrypt;
	}

	// md5()信息摘要, 不可逆
	public static byte[] md5(byte[] input) throws Exception {
		java.security.MessageDigest alg = java.security.MessageDigest
				.getInstance("MD5"); // or "SHA-1"
		if (debug) {
			System.out.println("摘要前的二进串:" + byte2hex(input));
			System.out.println("摘要前的字符串:" + new String(input));
		}
		alg.update(input);
		byte[] digest = alg.digest();
		if (debug)
			System.out.println("摘要后的二进串:" + byte2hex(digest));
		return digest;
	}

	// 字节码转换成16进制字符串
	public static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
			if (n < b.length - 1)
				hs = hs + ":";
		}
		return hs.toUpperCase();
	}

	public static void main(String[] args) throws Exception {
		debug = true;
		// byte[] key = getKey();
		byte[] key = "好好学习".getBytes();
		decode(encode("测试加密".getBytes(), key), key);
		// md5("测试加密".getBytes());
	}
}
