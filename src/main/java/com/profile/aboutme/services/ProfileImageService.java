package com.profile.aboutme.services;

import com.profile.aboutme.entities.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface ProfileImageService {
    public ResponseEntity<ResponseObject> storeFile(MultipartFile file);
    public Stream<Path> loadAllImage();
    public ResponseEntity<byte[]> readFile(String fileName);
    public void deleteFile();
}
