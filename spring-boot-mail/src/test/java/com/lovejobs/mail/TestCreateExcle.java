package com.lovejobs.mail;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MailApplication.class)
public class TestCreateExcle {

    private HSSFWorkbook workbook=new HSSFWorkbook();
    private HSSFCellStyle style = workbook.createCellStyle();



    @Test
    public void createExcle(){

        HSSFSheet sheet=workbook.createSheet();

        HSSFRow row=sheet.createRow(0);
        row.setHeightInPoints(30);//设置行的高度
        HSSFCell cell=null;
        String[] title={"序号","姓名","年龄"};
        for(int i=0;i<title.length;i++){
            cell=row.createCell(i);
            cell.setCellValue(title[i]);
            sheet.setColumnWidth(i, 20 * 256);//设置列的宽度
            this.setTitlCellStyle(cell);
        }

        //写入数据
        for (int i=1;i<=10;i++){
            HSSFRow nrow=sheet.createRow(i);
            HSSFCell ncell=nrow.createCell(0);
            this.setCellStyle(ncell);
            ncell.setCellValue(""+i);
            ncell=nrow.createCell(1);
            this.setCellStyle(ncell);
            ncell.setCellValue("user"+i);
            ncell=nrow.createCell(2);
            this.setCellStyle(ncell);
            ncell.setCellValue("24");
            this.setCellStyle(ncell);


        }

        File file=new File(this.getClass().getResource("/").getPath().concat("/test.xlsx"));
        try {
            file.createNewFile();
            //将excel写入
            FileOutputStream stream= new FileOutputStream(file);
            workbook.write(stream);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void setTitlCellStyle(HSSFCell ncell){
        HSSFCellStyle style = workbook.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);//水平居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
        HSSFFont font = workbook.createFont();
        font.setFontName("宋体");//设置字体名称
        font.setFontHeightInPoints((short)16);//设置字号
        font.setBold(true);//设置是否加粗
        font.setColor(IndexedColors.BLACK1.index);//设置字体颜色
        style.setFont(font);
        ncell.setCellStyle(style);

    }
    private void setCellStyle(HSSFCell ncell){
        HSSFCellStyle style = workbook.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);//水平居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
        HSSFFont font = workbook.createFont();
        font.setFontName("宋体");//设置字体名称
        font.setFontHeightInPoints((short)12);//设置字号
        font.setColor(IndexedColors.BLACK1.index);//设置字体颜色
        style.setFont(font);
        ncell.setCellStyle(style);

    }
}
