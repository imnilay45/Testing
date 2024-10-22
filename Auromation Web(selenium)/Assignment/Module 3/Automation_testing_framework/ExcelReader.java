package Automation_testing_framework;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	String Filepath;
	String Sheetname;
	
	
	
	public ExcelReader(String Filepath, String Sheetname) {
		super();
		this.Filepath = Filepath;
		this.Sheetname = Sheetname;
	}



	public int rowcount () {
		int i =0;
		try {
		XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
		XSSFSheet worksheet = workbook.getSheet(Sheetname);
		i = worksheet.getPhysicalNumberOfRows();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public int colcount() {
		int i = 0 ;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(Filepath);
			XSSFSheet worksheet = workbook.getSheet(Sheetname);
		    i = worksheet.getRow(0).getPhysicalNumberOfCells();
							
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public String getdata(int row, int col) {
		String data = null;
		try {
			XSSFWorkbook  workbook = new XSSFWorkbook(Filepath);
			XSSFSheet worksheet  = workbook .getSheet(Sheetname);
			
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
}
