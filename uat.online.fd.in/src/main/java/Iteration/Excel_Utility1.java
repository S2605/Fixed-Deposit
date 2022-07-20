package Iteration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility1 {

	static ReadExcel reader;

	public static ArrayList<Object[]> getDataFromexcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			String s = "C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\uat.online.fd.in\\ExcelReader\\Book1.xlsx";
			System.out.println(s);
			reader = new ReadExcel(s);

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
			String Iteration = reader.getCellData("Sheet1", "Iteration", rowNum);
			String mobileNo = reader.getCellData("Sheet1", "mobileNo", rowNum);
			String pinCode = reader.getCellData("Sheet1", "pinCode", rowNum);
			String emailID = reader.getCellData("Sheet1", "emailID", rowNum);
			String ErrorMsg = reader.getCellData("Sheet1", "ErrorMsg", rowNum);
			String OTP = reader.getCellData("Sheet1", "OTP", rowNum);
			String Amount_input_fd = reader.getCellData("Sheet1", "Amount_input_fd", rowNum);
			String Tenure_input_fd = reader.getCellData("Sheet1", "Tenure_input_fd", rowNum);
			String Select_Interest_Payout = reader.getCellData("Sheet1", "Select_Interest_Payout", rowNum);
			String S1_depositorPAN = reader.getCellData("Sheet1", "S1_depositorPAN", rowNum);
			String S1_depositorMName = reader.getCellData("Sheet1", "S1_depositorMName", rowNum);

			Object ob[] = { INDEX, Iteration, ErrorMsg, mobileNo, pinCode, emailID, OTP, Amount_input_fd,
					Tenure_input_fd, Select_Interest_Payout, S1_depositorPAN, S1_depositorMName };
			myData.add(ob);
		}
		return myData;

	}

	public static void writeinexcel(String value, int INDEX) throws Exception {
		File fis = new File(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\uat.online.fd.in\\ExcelReader\\Book1.xlsx");
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
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\uat.online.fd.in\\ExcelReader\\Book1.xlsx");
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
