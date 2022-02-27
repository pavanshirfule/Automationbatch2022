package parametrization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.vel.config.Configuration;

public class Readtest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(Configuration.exelpath);

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");

	//	String test = sh.getRow(0).getCell(0).getStringCellValue();

		int length = sh.getLastRowNum();
		int length1 = sh.getRow(0).getLastCellNum();

		System.out.println(length);

		// System.out.println(test);
	for (int i = 0; i < length; i++) {
			String test1 = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.print(test1+" ");
		}
		for (int i = 0; i < length1; i++) {
			String test2 = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(test2+" ");
		}

	}
}
