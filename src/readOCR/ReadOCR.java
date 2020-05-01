package readOCR;

import java.io.File;
import java.util.Scanner;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadOCR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String filepath;
		System.out.println("Enter the file path:");
		filepath = sc.nextLine();
		
        File image = new File(filepath);
        ITesseract instance = new Tesseract();
        instance.setDatapath("F:\\Tess4J-3.4.8-src\\Tess4J\\tessdata");
        try {
			String result = instance.doOCR(image);
			System.out.println(result);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
        
	}

}
