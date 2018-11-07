package com.yylc.learnLSB.util;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

public class ExcelUtil {
    /**
     * @功能：手工构建一个简单格式的Excel
     */
    public static void createExcel() {
        // 第一步，创建一个webbook，对应一个Excel文件
        HSSFWorkbook wb = new HSSFWorkbook();
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet("sheet1");
        sheet.setDefaultColumnWidth(15);// 默认列宽
        sheet.setDefaultRowHeight((short) 400); // 默认行高
        CellRangeAddress callRangeAddress = new CellRangeAddress(0,0,0,7);//起始行,结束行,起始列,结束列
        CellRangeAddress callRangeAddress1 = new CellRangeAddress(1,4,0,7);

        CellRangeAddress callRangeAddress2 = new CellRangeAddress(5,7,0,0);
        CellRangeAddress callRangeAddress3 = new CellRangeAddress(5,5,2,3);
        CellRangeAddress callRangeAddress4 = new CellRangeAddress(5,5,5,7);
        CellRangeAddress callRangeAddress5 = new CellRangeAddress(6,6,2,3);
        CellRangeAddress callRangeAddress6 = new CellRangeAddress(6,6,5,7);
        CellRangeAddress callRangeAddress7 = new CellRangeAddress(7,7,2,3);
        CellRangeAddress callRangeAddress8 = new CellRangeAddress(7,7,5,7);

        CellRangeAddress callRangeAddress9 = new CellRangeAddress(8,10,0,0);
        CellRangeAddress callRangeAddress10 = new CellRangeAddress(8,8,2,3);
        CellRangeAddress callRangeAddress11 = new CellRangeAddress(8,8,5,7);
        CellRangeAddress callRangeAddress12 = new CellRangeAddress(9,9,2,3);
        CellRangeAddress callRangeAddress13 = new CellRangeAddress(9,9,5,7);
        CellRangeAddress callRangeAddress14 = new CellRangeAddress(10,10,2,3);
        CellRangeAddress callRangeAddress15 = new CellRangeAddress(10,10,5,7);

        CellRangeAddress callRangeAddress16 = new CellRangeAddress(11,11,0,1);
        CellRangeAddress callRangeAddress17 = new CellRangeAddress(11,11,2,7);

        CellRangeAddress callRangeAddress18 = new CellRangeAddress(12,12,0,1);
        CellRangeAddress callRangeAddress19 = new CellRangeAddress(12,12,2,7);

        CellRangeAddress callRangeAddress20 = new CellRangeAddress(13,13,0,1);
        CellRangeAddress callRangeAddress21 = new CellRangeAddress(13,13,2,4);
        CellRangeAddress callRangeAddress22 = new CellRangeAddress(13,13,5,7);

        CellRangeAddress callRangeAddress23 = new CellRangeAddress(14,14,0,1);
        CellRangeAddress callRangeAddress24 = new CellRangeAddress(14,14,2,4);
        CellRangeAddress callRangeAddress25 = new CellRangeAddress(14,14,5,7);

        CellRangeAddress callRangeAddress26 = new CellRangeAddress(21,21,1,3);
        CellRangeAddress callRangeAddress27 = new CellRangeAddress(21,21,5,7);

        CellRangeAddress callRangeAddress28 = new CellRangeAddress(22,25,0,0);
        CellRangeAddress callRangeAddress29 = new CellRangeAddress(22,25,1,7);

        CellRangeAddress callRangeAddress30 = new CellRangeAddress(26,29,0,0);
        CellRangeAddress callRangeAddress31 = new CellRangeAddress(26,29,1,7);

        sheet.addMergedRegion(callRangeAddress);
        sheet.addMergedRegion(callRangeAddress1);
        sheet.addMergedRegion(callRangeAddress2);
        sheet.addMergedRegion(callRangeAddress3);
        sheet.addMergedRegion(callRangeAddress4);
        sheet.addMergedRegion(callRangeAddress5);
        sheet.addMergedRegion(callRangeAddress6);
        sheet.addMergedRegion(callRangeAddress7);
        sheet.addMergedRegion(callRangeAddress8);
        sheet.addMergedRegion(callRangeAddress9);
        sheet.addMergedRegion(callRangeAddress10);
        sheet.addMergedRegion(callRangeAddress11);
        sheet.addMergedRegion(callRangeAddress12);
        sheet.addMergedRegion(callRangeAddress13);
        sheet.addMergedRegion(callRangeAddress14);
        sheet.addMergedRegion(callRangeAddress15);
        sheet.addMergedRegion(callRangeAddress16);
        sheet.addMergedRegion(callRangeAddress17);
        sheet.addMergedRegion(callRangeAddress18);
        sheet.addMergedRegion(callRangeAddress19);
        sheet.addMergedRegion(callRangeAddress20);
        sheet.addMergedRegion(callRangeAddress21);
        sheet.addMergedRegion(callRangeAddress22);
        sheet.addMergedRegion(callRangeAddress23);
        sheet.addMergedRegion(callRangeAddress24);
        sheet.addMergedRegion(callRangeAddress25);
        sheet.addMergedRegion(callRangeAddress26);
        sheet.addMergedRegion(callRangeAddress27);
        sheet.addMergedRegion(callRangeAddress28);
        sheet.addMergedRegion(callRangeAddress29);
        sheet.addMergedRegion(callRangeAddress30);
        sheet.addMergedRegion(callRangeAddress31);

        // 样式
        HSSFCellStyle allCenter = createCellStyle(wb,(short)10,false,true);
        HSSFCellStyle verticalCenter = createCellStyle(wb,(short)10,false,false);
        // 表头，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
        HSSFRow row0 = sheet.createRow(0);
        HSSFCell cell0 = row0.createCell(0);
        row0.setHeightInPoints(20);
        cell0.setCellStyle(allCenter);
        cell0.setCellValue("代开增值税发票缴纳税款申报单");

        HSSFRow row1 = sheet.createRow(1);
        HSSFCell cell1 = row1.createCell(0);
        cell1.setCellStyle(verticalCenter);
        cell1.setCellValue("代开人申明："+ "\r\n" + "       本次缴纳税款申报提供的开票信息真实、完整、" +
                "可靠、准确，符合有关法律法规，现申请代开增值税普通发票。" + "\r\n\r\n\r\n"+"                          " +
                "                                                              " +
                "代开人（盖章）：                                "+"                           "+"年        月        日");

        HSSFRow row2 = sheet.createRow(5);
        row2.setHeightInPoints(20);
        HSSFCell cell2 = row2.createCell((short)0);
        cell2.setCellStyle(allCenter);
        cell2.setCellValue("购买方信息");

        HSSFCell cell21 = row2.createCell((short)1);
        cell21.setCellStyle(verticalCenter);
        cell21.setCellValue("名称");

        HSSFCell cell22 = row2.createCell(2);
        cell22.setCellStyle(allCenter);
        cell22.setCellValue("购买方名称");

        HSSFCell cell23 = row2.createCell(4);
        cell23.setCellStyle(verticalCenter);
        cell23.setCellValue("纳税人识别号");

        HSSFCell cell24 = row2.createCell(5);
        cell24.setCellStyle(allCenter);
        cell24.setCellValue("9999999");

        HSSFRow row3 = sheet.createRow(6);
        HSSFCell cell31 = row3.createCell(1);
        row3.setHeightInPoints(20);
        cell31.setCellStyle(verticalCenter);
        cell31.setCellValue("地址");

        HSSFCell cell32 = row3.createCell(2);
        cell32.setCellStyle(allCenter);
        cell32.setCellValue("绍兴市柯桥区");

        HSSFCell cell33 = row3.createCell(4);
        cell33.setCellStyle(verticalCenter);
        cell33.setCellValue("开户银行");

        HSSFCell cell34 = row3.createCell(5);
        cell34.setCellStyle(allCenter);
        cell34.setCellValue("绍兴银行");

        HSSFRow row4 = sheet.createRow(7);
        HSSFCell cell41 = row4.createCell(1);
        row4.setHeightInPoints(20);
        cell41.setCellStyle(verticalCenter);
        cell41.setCellValue("电话");

        HSSFCell cell42 = row4.createCell(2);
        cell42.setCellStyle(allCenter);
        cell42.setCellValue("13456788765");

        HSSFCell cell43 = row4.createCell(4);
        cell43.setCellStyle(verticalCenter);
        cell43.setCellValue("银行账户");

        HSSFCell cell44 = row4.createCell(5);
        cell44.setCellStyle(allCenter);
        cell44.setCellValue("12345678");



        HSSFRow row8 = sheet.createRow(8);
        HSSFCell cell8 = row8.createCell((short)0);
        row8.setHeightInPoints(20);
        cell8.setCellStyle(allCenter);
        cell8.setCellValue("销售方信息");

        HSSFCell cell81 = row8.createCell((short)1);
        cell81.setCellStyle(verticalCenter);
        cell81.setCellValue("名称");

        HSSFCell cell82 = row8.createCell(2);
        cell82.setCellStyle(allCenter);
        cell82.setCellValue("购买方名称");

        HSSFCell cell83 = row8.createCell(4);
        cell83.setCellStyle(verticalCenter);
        cell83.setCellValue("纳税人识别号");

        HSSFCell cell84 = row8.createCell(5);
        cell84.setCellStyle(allCenter);
        cell84.setCellValue("9999999");

        HSSFRow row9 = sheet.createRow(9);
        HSSFCell cell91 = row9.createCell(1);
        row9.setHeightInPoints(20);
        cell91.setCellStyle(verticalCenter);
        cell91.setCellValue("地址");

        HSSFCell cell92 = row9.createCell(2);
        cell92.setCellStyle(allCenter);
        cell92.setCellValue("绍兴市柯桥区");

        HSSFCell cell93 = row9.createCell(4);
        cell93.setCellStyle(verticalCenter);
        cell93.setCellValue("开户银行");

        HSSFCell cell94 = row9.createCell(5);
        cell94.setCellStyle(allCenter);
        cell94.setCellValue("绍兴银行");

        HSSFRow row10 = sheet.createRow(10);
        HSSFCell cell101 = row10.createCell(1);
        row10.setHeightInPoints(20);
        cell101.setCellStyle(verticalCenter);
        cell101.setCellValue("电话");

        HSSFCell cell102 = row10.createCell(2);
        cell102.setCellStyle(allCenter);
        cell102.setCellValue("13456788765");

        HSSFCell cell103 = row10.createCell(4);
        cell103.setCellStyle(verticalCenter);
        cell103.setCellValue("银行账户");

        HSSFCell cell104 = row10.createCell(5);
        cell104.setCellStyle(allCenter);
        cell104.setCellValue("12345678");


        HSSFRow row11 = sheet.createRow(11);
        HSSFCell cell110 = row11.createCell(0);
        row11.setHeightInPoints(20);
        cell110.setCellStyle(allCenter);
        cell110.setCellValue("代开人类型");
        HSSFCell cell111 = row11.createCell(2);
        cell111.setCellStyle(allCenter);
        cell111.setCellValue("自然人□                       其他纳税人□");

        HSSFRow row12 = sheet.createRow(12);
        row12.setHeightInPoints(30);
        HSSFCell cell120 = row12.createCell(0);
        cell120.setCellStyle(allCenter);
        cell120.setCellValue("减免税标识（代开普通\n发票，符合条件填写）");
        HSSFCell cell121 = row12.createCell(2);
        cell121.setCellStyle(allCenter);
        cell121.setCellValue("是□                                否□");

        HSSFRow row13 = sheet.createRow(13);
        HSSFCell cell130 = row13.createCell(0);
        row13.setHeightInPoints(20);
        cell130.setCellStyle(allCenter);
        cell130.setCellValue("减免税种");
        HSSFCell cell131 = row13.createCell(2);
        cell131.setCellStyle(allCenter);
        cell131.setCellValue("减免税类型");
        HSSFCell cell132 = row13.createCell(5);
        cell132.setCellStyle(allCenter);
        cell132.setCellValue("减免原因");

        HSSFRow row14 = sheet.createRow(14);
        HSSFCell cell140 = row14.createCell(0);
        row14.setHeightInPoints(20);
        cell140.setCellStyle(allCenter);
        cell140.setCellValue("xxx");
        HSSFCell cell141 = row14.createCell(2);
        cell141.setCellStyle(allCenter);
        cell141.setCellValue("xxx");
        HSSFCell cell142 = row14.createCell(5);
        cell142.setCellStyle(allCenter);
        cell142.setCellValue("xxx");

        HSSFRow row15 = sheet.createRow(15);
        HSSFCell cell150 = row15.createCell(0);
        row15.setHeightInPoints(30);
        cell150.setCellStyle(allCenter);
        cell150.setCellValue("货物或应税\n劳务、服务名称");
        HSSFCell cell151 = row15.createCell(1);
        cell151.setCellStyle(allCenter);
        cell151.setCellValue("规格类型（\n服务类型）");
        HSSFCell cell152 = row15.createCell(2);
        cell152.setCellStyle(allCenter);
        cell152.setCellValue("计量单位");
        HSSFCell cell153 = row15.createCell(3);
        cell153.setCellStyle(allCenter);
        cell153.setCellValue("数量");
        HSSFCell cell154 = row15.createCell(4);
        cell154.setCellStyle(allCenter);
        cell154.setCellValue("单价");
        HSSFCell cell155 = row15.createCell(5);
        cell155.setCellStyle(allCenter);
        cell155.setCellValue("不含税\n销售额");
        HSSFCell cell156 = row15.createCell(6);
        cell156.setCellStyle(allCenter);
        cell156.setCellValue("征收税");
        HSSFCell cell157 = row15.createCell(7);
        cell157.setCellStyle(allCenter);
        cell157.setCellValue("税额");

        // todo  增加一个 for 来输入 商品


        HSSFRow row21 = sheet.createRow(21);
        HSSFCell cell210 = row21.createCell(0);
        row21.setHeightInPoints(20);
        cell210.setCellStyle(allCenter);
        cell210.setCellValue("价税合计（大写）");
        HSSFCell cell211 = row21.createCell(1);
        cell211.setCellStyle(verticalCenter);
        cell211.setCellValue("XXXX");
        HSSFCell cell214 = row21.createCell(4);
        cell214.setCellStyle(allCenter);
        cell214.setCellValue("价税合计（小写）");
        HSSFCell cell215 = row21.createCell(5);
        cell215.setCellStyle(verticalCenter);
        cell215.setCellValue("xxxxx");

        HSSFRow row22 = sheet.createRow(22);
        row22.setHeightInPoints(20);
        HSSFCell cell220 = row22.createCell(0);
        cell220.setCellStyle(allCenter);
        cell220.setCellValue("受理税务机关");

        HSSFCell cell2201 = row22.createCell(1);
        cell2201.setCellStyle(verticalCenter);
        cell2201.setCellValue("税收完税凭证号：" + "\r\n\n" + "发票代码：" + "\r\n\n" + "发票号码：" + "\r\n" + "" +
                "                                                                    经办人（签字)                   " +
                "                        年     月     日");

        HSSFRow row26 = sheet.createRow(26);
        HSSFCell cell260 = row26.createCell(0);
        cell260.setCellStyle(allCenter);
        cell260.setCellValue("收件地址");

        HSSFCell cell261 = row26.createCell(1);
        cell261.setCellStyle(verticalCenter);
        cell261.setCellValue("收货人：" + "\r\n" + "地址：" + "\r\n" + "邮编：" + "\r\n" + "电话：");


        try {
            FileOutputStream fout = new FileOutputStream("D:/Members.xls");
            wb.write(fout);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



    public static HSSFCellStyle createCellStyle(HSSFWorkbook workbook, short fontsize,boolean flag,boolean flag1) {
        // TODO Auto-generated method stub
        HSSFCellStyle style = workbook.createCellStyle();
        //是否水平居中
        if(flag1){
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//水平居中
        }

        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中
        //创建字体
        HSSFFont font = workbook.createFont();
        //是否加粗字体
        if(flag){
            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        }
        font.setFontHeightInPoints(fontsize);
        //加载字体
        style.setFont(font);
        style.setWrapText(true);
        return style;
    }


    public static void main(String[] args) {
        ExcelUtil.createExcel();
    }
}