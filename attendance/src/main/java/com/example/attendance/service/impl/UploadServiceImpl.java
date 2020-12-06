package com.example.attendance.service.impl;

import com.example.attendance.mapper.StudentMapper;
import com.example.attendance.pojo.Student;
import com.example.attendance.service.UploadService;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class UploadServiceImpl implements UploadService
{

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public boolean getExcel(MultipartFile file) throws Exception {
        /*List<User> list = new ArrayList<User>();*/
// TODO Auto-generated method stub

        //1.得到上传的表
        Workbook workbook2 = WorkbookFactory.create(file.getInputStream());
        //2、获取test工作表
        Sheet sheet2 = workbook2.getSheet("Sheet1");
        //获取表的总行数
        int num = sheet2.getLastRowNum();
        System.out.println(num);
        //总列数
        int col = sheet2.getRow(0).getLastCellNum();


        //遍历excel每一行
        for (int j = 0; j <= num; j++) {
            Row row1 = sheet2.getRow(j);

            //如果单元格中有数字或者其他格式的数据，则调用setCellType()转换为string类型
            Cell cell1 = row1.getCell(0);
            cell1.setCellType(CellType.STRING);
            //获取表中第i行，第2列的单元格
            Cell cell2 = row1.getCell(1);
            cell2.setCellType(CellType.STRING);
            //excel表的第i行，第3列的单元格
            Cell cell3 = row1.getCell(2);
            cell3.setCellType(CellType.STRING);
            //excel表的第i行，第4列的单元格
            Cell cell4 = row1.getCell(3);
            cell4.setCellType(CellType.STRING);


            //这里new 一个对象，用来装填从页面上传的Excel数据，字段根据上传的excel决定
            Student student= new Student();
            student.setStudentNo(cell1.getStringCellValue());
            student.setStudentName(cell2.getStringCellValue());
            student.setCourseNo(cell3.getStringCellValue());
            student.setTeacherNo(cell4.getStringCellValue());
            this.studentMapper.insert(student);
        }

        return true;
    }
}
