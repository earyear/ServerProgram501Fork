package com.busanit501.boot501.dto.upload;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UploadProfileFileDTO {
    private MultipartFile file;
}
