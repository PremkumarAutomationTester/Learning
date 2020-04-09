package VideoLearning;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	@Test(dataProvider = "loginData")
	public Object[][] readExcel() throws IOException
	{
		FileInputStream file = new FileInputStream("D:\\readExcel.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(file);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[row-1][cell];
		for (int i = 1; i < row; i++) {
			XSSFRow rowvalue = sheet.getRow(i);
						for (int j = 0; j < cell; j++) {
							
			XSSFCell cellvalue = rowvalue.getCell(j);
			data[i-1][j] = cellvalue.getStringCellValue();
		
			}
		}
		wbook.close();
			return data;
		}
		
		
		
		
		
		
		
		/*Iterator<Row> row = sheet.iterator();
		while(row.hasNext())
		{
			Row rowValue = row.next();
			Iterator<Cell> cell = rowValue.iterator();
			while(cell.hasNext())
			{
				Cell cellValue = cell.next();
				System.out.println(cellValue);
			}
			
		}*/
		
		
	}
	

	/*public static void main(String[] args) throws IOException {
		ReadExcel read = new ReadExcel();
		read.readExcel();
		

	}
*/

