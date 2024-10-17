package Assessment;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	String FilePath;
	String SheetName;
	public ExcelReader(String filePath, String sheetName) {
		super();
		FilePath = filePath;
		SheetName = sheetName;
	}
	
	public int RowCount() {
		int i = 0;
		try {
			
			XSSFWorkbook workbook = new XSSFWorkbook(FilePath);
			XSSFSheet worksheet = workbook.getSheet(SheetName);
			 i = worksheet.getPhysicalNumberOfRows();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public int colCount () {
		int i = 0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(FilePath);
			XSSFSheet worksheet = workbook.getSheet(SheetName);
			i = worksheet.getRow(0).getPhysicalNumberOfCells();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public String getdata (int row,int col) {
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(FilePath);
			XSSFSheet worksheet = workbook.getSheet(SheetName);
			
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
			
	}
}
