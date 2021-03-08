package com.flipkart.genericLib;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib 

{
		   public String readPropData(String PROP_PATH,String key) throws Throwable
		   { 
			  FileInputStream fis=new FileInputStream(PROP_PATH);
			  Properties prop=new Properties();
			  prop.load(fis);
			  String propValue=prop.getProperty(key, "Incorrect key");
			  return propValue;
		   }
			
			public String getData(String EXCEL_PATH,String sheet,int row,int cell) throws Throwable
			{
			  FileInputStream fis= new FileInputStream(EXCEL_PATH);
			  Workbook wb=WorkbookFactory.create(fis);
			  String val=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			  return val;
			}
			
			public int getRowCount(String EXCEL_PATH,String sheet) throws Throwable, InvalidFormatException, IOException
			{
				FileInputStream fis= new FileInputStream(EXCEL_PATH);
			    Workbook wb=WorkbookFactory.create(fis);
			    int rc=wb.getSheet(sheet).getLastRowNum();
			    return rc;
			}
			
			public int getCellCount(String EXCEL_PATH,String sheet,int row) throws Throwable, InvalidFormatException, IOException
			{
				FileInputStream fis= new FileInputStream(EXCEL_PATH);
			    Workbook wb=WorkbookFactory.create(fis);
			    int cc=wb.getSheet(sheet).getRow(row).getLastCellNum();
			    return cc;	
			}
			
			
			
		}





