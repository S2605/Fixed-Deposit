package Iteration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
	static ReadExcel reader;

	public static ArrayList<Object[]> getDataFromexcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
               String s="C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FD\\ExcelReader\\Happy_Flow_TD.xlsx";
               System.out.println(s);
			reader = new ReadExcel(s);

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			System.out.println("hiii");
			String MobileNo = reader.getCellData("Sheet1", "MobileNo", rowNum);
			String pincode = reader.getCellData("Sheet1", "pincode", rowNum);
			String EmailId = reader.getCellData("Sheet1", "EmailId", rowNum);
			String amount_input_fd = reader.getCellData("Sheet1", "amount_input_fd", rowNum);
			String tenure_input_fd = reader.getCellData("Sheet1", "tenure_input_fd", rowNum);
			String Are_you_a_senior_citizen = reader.getCellData("Sheet1", "Are_you_a_senior_citizen", rowNum);
			String verifyOtp = reader.getCellData("Sheet1", "verifyOtp", rowNum); 
			String amount_input_fd1 = reader.getCellData("Sheet1", "amount_input_fd1", rowNum); 
			String tenure_input_fd2 = reader.getCellData("Sheet1", "tenure_input_fd2", rowNum); 
			String Select_Interest_Payout = reader.getCellData("Sheet1", "Select_Interest_Payout", rowNum); 
			String Are_you_a_senior_citizen1 = reader.getCellData("Sheet1", "Are_you_a_senior_citizen1", rowNum); 
			String Iteration = reader.getCellData("Sheet1", "Iteration", rowNum);
			String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
			Object ob[] = { MobileNo, pincode, EmailId, amount_input_fd, tenure_input_fd, Are_you_a_senior_citizen,
					verifyOtp,amount_input_fd1,tenure_input_fd2,Select_Interest_Payout,Are_you_a_senior_citizen1,Iteration,INDEX};
			myData.add(ob);
		}
		return myData;

	}


	public static void writeinexcel(String value, int INDEX) throws Exception {
		File fis = new File(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FD\\ExcelReader\\Happy_Flow_TD.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(15);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}
	public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
		File fis = new File(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FD\\ExcelReader\\Happy_Flow_TD.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(16);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

}
