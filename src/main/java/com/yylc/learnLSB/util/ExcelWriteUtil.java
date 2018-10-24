package com.yylc.learnLSB.util;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteUtil {
    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    public static void writeExcel(List<Map> dataList, String finalXlsxPath) {
        OutputStream out = null;
        try {
            // 读取Excel文档
            File finalXlsxFile = new File(finalXlsxPath);
            if (!finalXlsxFile.exists()) {
                createExcel(finalXlsxPath);
            }
            Workbook workBook = getWorkbok(finalXlsxFile);

            // sheet 对应一个工作页
            Sheet sheet = workBook.getSheetAt(0);

            // 删除原有数据，除了属性列
            int rowNumber = sheet.getLastRowNum();    // 第一行从0开始算
            System.out.println("原始数据总行数，除属性列：" + rowNumber);
            for (int i = 1; i <= rowNumber; i++) {
                Row row = sheet.getRow(i);
                sheet.removeRow(row);
            }
            // 创建文件输出流，输出电子表格：这个必须有，否则你在sheet上做的任何操作都不会有效
            out = new FileOutputStream(finalXlsxPath);
            workBook.write(out);

            // 往Excel中写新数据
            // 写入属性行
            Row rowTitle = sheet.createRow(0);
            int index = 0;
            for (Object key : dataList.get(0).keySet()) {
                Cell cell = rowTitle.createCell(index);
                cell.setCellValue(key.toString());
                index++;
            }
            // 写入数据
            for (int j = 0; j < dataList.size(); j++) {
                // 创建一行：从第二行开始，跳过属性列
                Row row = sheet.createRow(j + 1);

                index = 0;
                for (Object key : dataList.get(j).keySet()) {
                    Cell cell = row.createCell(index);
                    cell.setCellValue(dataList.get(j).get(key).toString());
                    index++;
                }

            }
            // 创建文件输出流，准备输出电子表格：这个必须有，否则你在sheet上做的任何操作都不会有效
            out = new FileOutputStream(finalXlsxPath);
            workBook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据导出成功");
    }

    public static void createExcel(String path) throws Exception {
        //创建Excel文件对象
        HSSFWorkbook wb = new HSSFWorkbook();
        //用文件对象创建sheet对象  
        HSSFSheet sheet = wb.createSheet("sheet1");
        sheet.setDefaultColumnWidth(20);// 默认列宽
        //用sheet对象创建行对象  
        HSSFRow row = sheet.createRow(0);
        //创建单元格样式     
        HSSFCellStyle cellStyle = wb.createCellStyle();
        //用行对象创建单元格对象Cell 
        Cell cell = row.createCell(0);
        //用cell对象读写。设置Excel工作表的值
        cell.setCellValue(1);
        //输出Excel文件
        FileOutputStream output = new FileOutputStream(path);
        wb.write(output);
        output.flush();
    }

    /**
     * 判断Excel的版本,获取Workbook
     */
    public static Workbook getWorkbok(File file) throws IOException {
        Workbook wb = null;
        FileInputStream in = new FileInputStream(file);
        if (file.getName().endsWith(EXCEL_XLS)) {     //Excel&nbsp;2003
            wb = new HSSFWorkbook(in);
        } else if (file.getName().endsWith(EXCEL_XLSX)) {    // Excel 2007/2010
            wb = new XSSFWorkbook(in);
        }
        return wb;
    }


    public static void main(String[] args) {

        Map<String, String> dataMap = new HashMap<String, String>();
        Map<String, String> dataMap_1 = new HashMap<String, String>();
        dataMap.put("name", "BankName");
        dataMap.put("addr", "Addr");
        dataMap.put("phone", "Phone");
        List<Map> list = new ArrayList<Map>();
        System.out.println(dataMap);
        list.add(dataMap);
        dataMap_1.put("name", "BankName");
        dataMap_1.put("phone", "Phone");
        dataMap_1.put("addr", "Addressss");
        list.add(dataMap_1);
        list.add(dataMap);
        System.out.println(list);
        writeExcel(list, "D://writeExcel.xlsx");

    }
}
