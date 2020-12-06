package com.example.attendance.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    boolean getExcel(MultipartFile file) throws Exception;
}
