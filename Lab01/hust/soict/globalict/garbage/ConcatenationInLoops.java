package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConcatenationInLoops {
	public static void main(String []args) throws IOException {
		String filename = "C:\\Users\\HP\\Desktop\\OOP\\OOLT.ICT.20202.20194877.NguyenTranMinhTuan"
				+ "\\Lab01\\hust\\soict\\globalict\\garbage\\test"; //  is the name or the path to an executable file
		byte[] inputBytes = { 0 };
		long startTimeBuf, endTimeBuf,startTimeStr, endTimeStr, startTimeBui, endTimeBui;
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTimeBuf = System.currentTimeMillis();
		StringBuffer outputStringBuffer = new StringBuffer();
		for(byte b : inputBytes) {
			outputStringBuffer.append((char)b);
		}
		endTimeBuf = System.currentTimeMillis();
		System.out.println("String Buffer takes: " + (endTimeBuf - startTimeBuf) + " millis");
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTimeStr = System.currentTimeMillis();
		String outputString = "";
		for(byte b : inputBytes) {
			outputString += (char)b;
		}
		endTimeStr = System.currentTimeMillis();
		System.out.println("String + takes: " + (endTimeStr - startTimeStr) + " millis");
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTimeBui = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte b : inputBytes) {
			outputStringBuilder.append((char)b);
		}
		endTimeBui = System.currentTimeMillis();
		System.out.println("String Builder takes: " + (endTimeBui - startTimeBui) + " millis");
	}
}