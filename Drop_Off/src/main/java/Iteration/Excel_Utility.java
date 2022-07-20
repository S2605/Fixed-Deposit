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
			String s = "C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\Drop_Off\\ExcelReader\\Book1.xlsx";
			System.out.println(s);
			reader = new ReadExcel(s);

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			String MobileNo = reader.getCellData("Sheet1", "MobileNo", rowNum);
			String pincode = reader.getCellData("Sheet1", "pincode", rowNum);
			String EmailID = reader.getCellData("Sheet1", "EmailID", rowNum);
			String verifyOtp = reader.getCellData("Sheet1", "verifyOtp", rowNum);
			String amount_input_fd = reader.getCellData("Sheet1", "amount_input_fd", rowNum);
			String tenureOptions = reader.getCellData("Sheet1", "tenureOptions", rowNum);
			String tenure_input_fd = reader.getCellData("Sheet1", "tenure_input_fd", rowNum);
			String select_Interest_Payout = reader.getCellData("Sheet1", "select_Interest_Payout", rowNum);
			String citizenyes = reader.getCellData("Sheet1", "citizenyes", rowNum);
			String s1_depositorPAN = reader.getCellData("Sheet1", "s1_depositorPAN", rowNum);
			String s1_depositortitle = reader.getCellData("Sheet1", "s1_depositortitle", rowNum);
			String s1_depositorMName = reader.getCellData("Sheet1", "s1_depositorMName", rowNum);
//			reader.getCellData("Sheet1", "citizenyes", rowNum);

			
			

			Object ob[] = { MobileNo, pincode, EmailID, verifyOtp, amount_input_fd, tenureOptions, tenure_input_fd,
					select_Interest_Payout, citizenyes,s1_depositorPAN,s1_depositortitle ,s1_depositorMName};
			myData.add(ob);
		}
		return myData;

	}

	public static void writeinexcel(String value, int INDEX) throws Exception {
		File fis = new File(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\Drop_Off\\ExcelReader\\Book1.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(10);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

	public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
		File fis = new File(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\Drop_Off\\ExcelReader\\Book1.xlsx");
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

}
