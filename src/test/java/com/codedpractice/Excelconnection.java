package com.codedpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelconnection {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("./ExcelFolder/test.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sh=wb.getSheet("Sheet1");
String test=sh.getRow(1).getCell(2).getStringCellValue();
System.out.println(test);
		
		
	}

}
