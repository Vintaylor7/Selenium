package genricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readExcel {

	FileInputStream path;
	Workbook wb;
	public Object[][] ReadMultipleData(String SheetName) {
		
		try {
			path = new FileInputStream("./src/test/resources/test.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			wb = WorkbookFactory.create(path);
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sh = wb.getSheet(SheetName);
		int rowcount = sh.getPhysicalNumberOfRows();
		int cellount = sh.getRow(0).getPhysicalNumberOfCells();
		Object [][] data = new Object[rowcount][cellount];
		for(int i=0;i<rowcount;i++) {
			for(int j=0;j<cellount;j++) {
				data[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
		return data;
	}
}
