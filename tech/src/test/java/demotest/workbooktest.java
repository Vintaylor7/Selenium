package demotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class workbooktest {

	@Test
	public void fetchData() throws Throwable {
		FileInputStream path = new FileInputStream("./src/test/resources/test.xlsx");
		Workbook wb = WorkbookFactory.create(path);
		Sheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getPhysicalNumberOfRows();
		int cellount = sh.getRow(0).getPhysicalNumberOfCells();
		for (int i=0;i<rowcount;i++) {
			for(int j=0;j<cellount;j++) {
				String data = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}
//		Row row = sh.getRow(3);
//		Cell cell= row.getCell(0);
//		String data= cell.getStringCellValue();
//		System.out.println(data);
		
		
	}
}
