package hust.soict.globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String []args) throws IOException {
		String filename = "C:\\Users\\HP\\Desktop\\OOP\\OOLT.ICT.20202.20194877.NguyenTranMinhTuan"
				+ "\\Lab01\\hust\\soict\\globalict\\garbage\\test"; //  is the name or the path to an executable file
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte b : inputBytes) {
			outputStringBuilder.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
