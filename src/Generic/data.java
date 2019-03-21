package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class data {
	public static String getdata(String path,String sheet,int row,int column)
	{
		String data="";
		try{
			FileInputStream f = new FileInputStream(path);
			Workbook book = WorkbookFactory.create(f);
			data=book.getSheet("sheet").getRow(row).getCell(column).getStringCellValue();
		}
		catch(Throwable e){
			
		}
		return data;
	}

}
