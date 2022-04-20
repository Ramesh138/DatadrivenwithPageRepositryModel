package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadandWriteData {

	public static void main(String[] args) throws IOException, InvalidFormatException {

		//File file = new File("C:\\Users\\z011615\\eclipse-workspace\\herokupp\\Processing.xlsx");
		FileInputStream file = new FileInputStream(new File("./data/TestData.xlsx"));

		/* FileInputStream fi = new FileInputStream(file); */

		XSSFWorkbook xwb = new XSSFWorkbook(file);

		XSSFSheet xs = xwb.getSheet("Processing_spec");

		int rowcoun = xs.getLastRowNum() - xs.getFirstRowNum();
		int cellcoun = xs.getRow(0).getLastCellNum();
		
		int noOfColumns = xs.getRow(0).getPhysicalNumberOfCells();

		System.out.println(" no of rows " + rowcoun);
		
		System.out.println("no of col"+noOfColumns);
		
		xs.getRow(0).createCell(0).setCellValue("");

		
		System.out.println(xs.getRow(rowcoun).getCell(cellcoun-1));
		for (int i = 0; i < rowcoun; i++) {
			for (int j = 0; j < cellcoun; j++) {
				XSSFCell value =xs.getRow(i).getCell(j);
				
			}

		}

	}

}
