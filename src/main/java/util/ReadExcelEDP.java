package util;



import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Base.ProjectSpecificMthods;

public class ReadExcelEDP extends ProjectSpecificMthods {

	public static String[][] readexcelData(String Filename) throws IOException {
		// TODO Auto-generated method stub

		// to get in to workbook

		XSSFWorkbook wb = new XSSFWorkbook("./data/"+Filename+".xlsx");

		//// to get in to worksheet

		XSSFSheet sheet = wb.getSheet("Sheet1");

	
		
		// to get the no of rows
		
		int lastRowNum = sheet.getLastRowNum();
		
		System.out.println(lastRowNum);
		
		// to get the no of rows including header
		
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println(physicalNumberOfRows);
//		
		
		// to get no of cells
		
		short lastCellNum = sheet.getRow(1).getLastCellNum();
		System.out.println(lastCellNum);
		
		String[][] data=new String[lastRowNum][lastCellNum];
	
		for (int i = 1; i <= lastRowNum; i++) {
			for (int j = 0; j < lastCellNum; j++) {
 
				String CellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(CellValue);
				
				data[i-1][j]=CellValue;
			}
		}

		wb.close();

		return data;
	}

}
