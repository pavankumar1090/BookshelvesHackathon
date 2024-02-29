package utilies;


import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
 
import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class Excelsheet {

	// Static members to be shared across instances of the class

	public static FileInputStream filein;

	public static FileOutputStream fileout;

	public static XSSFWorkbook workbook;

	public static XSSFSheet sheet;

	public static XSSFRow row;

	public static XSSFCell cell;  

	// Method to set cell data at a specific row and column in an Excel sheet

	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException

	{

		filein=new FileInputStream(xlfile);

		workbook=new XSSFWorkbook(filein);

		sheet=workbook.getSheet(xlsheet);

		row=sheet.getRow(rownum);

		if(row==null)

		{

			row=sheet.createRow(rownum);

		}

		cell=row.createCell(colnum);

		cell.setCellValue(data);

		fileout=new FileOutputStream(xlfile);

		workbook.write(fileout);		

		workbook.close();

		filein.close();

		fileout.close();

	}
	public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		filein=new FileInputStream(xlfile);
		workbook=new XSSFWorkbook(filein);
		sheet=workbook.getSheet(xlsheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try 
		{
			//data=cell.toString();
			DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell);
            return data;
		}
		catch (Exception e) 
		{
			data="";
		}
		workbook.close();
		filein.close();
		return data;
	}
 
 
}

