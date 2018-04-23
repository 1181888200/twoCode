package com.qrCode;

public class TestQRCode {

	public static void main(String[] args) {
		 
		//生成二维码
		 String imgPath = "d:/qrCode.png";
		 String encoderContent = "D"+System.currentTimeMillis()+"signxxx123oasd534af5ad05";
		 QRCode.encoderQRCode(encoderContent, imgPath, "png",15);
		 System.out.println("encoder success!!!");
		 
		 //解析二维码
		 String imgPath2 = "d:/qrCode.png";
		 String qrCon = QRCode.decoderQRCode(imgPath2);
		 System.out.println("decoder success!!!");
		 System.out.println("二维码内容为:" + qrCon);
	}
}
