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
			String s = "C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FixedDeposit_Automation\\ExcelReader\\New_Excel_Sheet.xlsx";
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
			String s1_depositorPAN = reader.getCellData("Sheet1", "s1_depositorPAN", rowNum);
			String s1_depositortitle = reader.getCellData("Sheet1", "s1_depositortitle", rowNum);
			String s1_depositorFName = reader.getCellData("Sheet1", "s1_depositorFName", rowNum);
			String s1_depositorMName = reader.getCellData("Sheet1", "s1_depositorMName", rowNum);
			String s1_depositorLName = reader.getCellData("Sheet1", "s1_depositorLName", rowNum);
			String s1_depositorDOB = reader.getCellData("Sheet1", "s1_depositorDOB", rowNum);
			String s1_depositorEmail = reader.getCellData("Sheet1", "s1_depositorEmail", rowNum);
			String Documenttype = reader.getCellData("Sheet1", "Documenttype", rowNum);
			String DocumentNo = reader.getCellData("Sheet1", "DocumentNo", rowNum);
			String up_ckyc_frontpic = reader.getCellData("Sheet1", "up_ckyc_frontpic", rowNum);
			String up_ckyc_backpic = reader.getCellData("Sheet1", "up_ckyc_backpic", rowNum);
			String Profie_Upload = reader.getCellData("Sheet1", "Profie_Upload", rowNum);
			String s3_Documentnoo = reader.getCellData("Sheet1", "s3_Documentnoo", rowNum);
			String s3_idproof = reader.getCellData("Sheet1", "s3_idproof", rowNum);
			String s3_addrline1 = reader.getCellData("Sheet1", "s3_addrline1", rowNum);
			String s3_addrline2 = reader.getCellData("Sheet1", "s3_addrline2", rowNum);
			String s3_area = reader.getCellData("Sheet1", "s3_area", rowNum);
			String s3_city = reader.getCellData("Sheet1", "s3_city", rowNum);
			String s3_state = reader.getCellData("Sheet1", "s3_state", rowNum);
			String s3_pincode = reader.getCellData("Sheet1", "s3_pincode", rowNum);
			String s4_accountno = reader.getCellData("Sheet1", "s4_accountno", rowNum);
			String s4_confaccountno = reader.getCellData("Sheet1", "s4_confaccountno", rowNum);
			String banknn = reader.getCellData("Sheet1", "banknn", rowNum);
			String bal = reader.getCellData("Sheet1", "bal", rowNum);
			String s4_ifsc = reader.getCellData("Sheet1", "s4_ifsc", rowNum);
			String s4_branch = reader.getCellData("Sheet1", "s4_branch", rowNum);
			String s4_bankname = reader.getCellData("Sheet1", "s4_bankname", rowNum);
			String s4_acctype = reader.getCellData("Sheet1", "s4_acctype", rowNum);
			String s4_accholdername = reader.getCellData("Sheet1", "s4_accholdername", rowNum);
			String s5_Occupation = reader.getCellData("Sheet1", "s5_Occupation", rowNum);
			String s5_Marital = reader.getCellData("Sheet1", "s5_Marital", rowNum);
			String s5_Maturity_ins = reader.getCellData("Sheet1", "s5_Maturity_ins", rowNum);
			String s5_spouseName = reader.getCellData("Sheet1", "s5_spouseName", rowNum);
			String s5_fatherName = reader.getCellData("Sheet1", "s5_fatherName", rowNum);
			String TDS_Certificate = reader.getCellData("Sheet1", "TDS_Certificate", rowNum);
			String s5_taxact = reader.getCellData("Sheet1", "s5_taxact", rowNum);
			String s5_FinancialYear = reader.getCellData("Sheet1", "s5_FinancialYear", rowNum);
			String s5_EstimatedIncome = reader.getCellData("Sheet1", "s5_EstimatedIncome", rowNum);
			String s5_esttotincome = reader.getCellData("Sheet1", "s5_esttotincome", rowNum);
			String s5_formsfilled = reader.getCellData("Sheet1", "s5_formsfilled", rowNum);
			String s5_AggregateAmount = reader.getCellData("Sheet1", "s5_AggregateAmount", rowNum);
			String Add_Nominee = reader.getCellData("Sheet1", "Add_Nominee", rowNum);
			String s5_nomineeRelation = reader.getCellData("Sheet1", "s5_nomineeRelation", rowNum);
			String s5_nomineetitle = reader.getCellData("Sheet1", "s5_nomineetitle", rowNum);
			String s5_nomineeFname = reader.getCellData("Sheet1", "s5_nomineeFname", rowNum);
			String s5_nomineeMname = reader.getCellData("Sheet1", "s5_nomineeMname", rowNum);
			String s5_nomineeLname = reader.getCellData("Sheet1", "s5_nomineeLname", rowNum);
			String s5_nomineeDOB = reader.getCellData("Sheet1", "s5_nomineeDOB", rowNum);
			String Nominee_address_same_as_Applicant_address = reader.getCellData("Sheet1",
					"Nominee_address_same_as_Applicant_address", rowNum);
			String s5_nomadd1 = reader.getCellData("Sheet1", "s5_nomadd1", rowNum);
			String s5_nomadd2 = reader.getCellData("Sheet1", "s5_nomadd2", rowNum);
			String s5_nomarea = reader.getCellData("Sheet1", "s5_nomarea", rowNum);
			String s5_nomcity = reader.getCellData("Sheet1", "s5_nomcity", rowNum);
			String s5_nomstate = reader.getCellData("Sheet1", "s5_nomstate", rowNum);
			String s5_nompincode = reader.getCellData("Sheet1", "s5_nompincode", rowNum);

			Object ob[] = { MobileNo, pincode, EmailId, amount_input_fd, tenure_input_fd, Are_you_a_senior_citizen,
					verifyOtp, amount_input_fd1, tenure_input_fd2, Select_Interest_Payout, Are_you_a_senior_citizen1,
					Iteration, INDEX, s1_depositorPAN, s1_depositortitle, s1_depositorFName, s1_depositorMName,
					s1_depositorLName, s1_depositorDOB, s1_depositorEmail, Documenttype, DocumentNo, up_ckyc_frontpic,
					up_ckyc_backpic, Profie_Upload, s3_Documentnoo, s3_idproof, s3_addrline1, s3_addrline2, s3_area,
					s3_city, s3_state, s3_pincode, s4_accountno, s4_confaccountno, banknn, bal, s4_ifsc, s4_branch,
					s4_bankname, s4_acctype, s4_accholdername, s5_Occupation, s5_Marital, s5_Maturity_ins,
					s5_spouseName, s5_fatherName, TDS_Certificate, s5_taxact, s5_FinancialYear, s5_EstimatedIncome,
					s5_esttotincome, s5_formsfilled, s5_AggregateAmount, Add_Nominee, s5_nomineeRelation,
					s5_nomineetitle, s5_nomineeFname, s5_nomineeMname, s5_nomineeLname, s5_nomineeDOB,
					Nominee_address_same_as_Applicant_address, s5_nomadd1, s5_nomadd2, s5_nomarea, s5_nomcity,
					s5_nomstate, s5_nompincode };
			myData.add(ob);
		}
		return myData;

	}

	public static void writeinexcel(String value, int INDEX) throws Exception {
		File fis = new File(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FixedDeposit_Automation\\ExcelReader\\New_Excel_Sheet.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(74);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

	public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
		File fis = new File(
				"C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FixedDeposit_Automation\\ExcelReader\\New_Excel_Sheet.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(75);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

}
