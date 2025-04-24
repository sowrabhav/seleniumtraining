package org.codetemplates;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSDocument;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelOperations {

    public static void main(String[] args) {

    }

    public void createTestDataExcel(){
        HSSFWorkbook workbook = new HSSFWorkbook();
        Sheet workSheet = workbook.createSheet("TestData");

        Row headerRow =  workSheet.createRow(0);
        headerRow.createCell(0).setCellValue("SearchIndex");
        headerRow.createCell(1).setCellValue("SearchString");
        headerRow.createCell(2).setCellValue("UserName");
        headerRow.createCell(3).setCellValue("Password");

        // Write the data to the excel
        Row testDataRow1 = workSheet.createRow(1);
        testDataRow1.createCell(0).setCellValue("1");
        testDataRow1.createCell(1).setCellValue("Tajmahal");
        testDataRow1.createCell(2).setCellValue("admin");
        testDataRow1.createCell(3).setCellValue("admin123");

        // Write the data to the excel
        Row testDataRow2 = workSheet.createRow(2);
        testDataRow2.createCell(0).setCellValue("1");
        testDataRow2.createCell(1).setCellValue("IndiaGate");
        testDataRow2.createCell(2).setCellValue("admin");
        testDataRow2.createCell(3).setCellValue("admin123");

        File file = new File("/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/testdata/TestData.xls");
        try {
            workbook.write(file);
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void accessTestDataFromExcel(){
        // Access Excel data
        try {
            FileInputStream inputExcel = new FileInputStream("/Users/baba/Documents/GitHub/2025-Selenium/seleniumtraining/src/main/resources/testdata/TestData.xls");
            Workbook workbook = new HSSFWorkbook(inputExcel);
            Sheet sheet = workbook.getSheet("TestData");

            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    System.out.print(row.getCell(j).getStringCellValue() + " ");
                }
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readExcel() {
    }

    public void writeExcel() {
    }

    public void updateExcel() {
    }

    public void deleteExcel() {
    }

    public void createExcel() {
    }

    public void closeExcel() {
    }

    public void saveExcel() {
    }


}
