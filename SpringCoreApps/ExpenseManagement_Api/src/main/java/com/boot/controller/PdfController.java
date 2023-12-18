package com.boot.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.boot.model.PdfData;
import com.boot.service.PdfService;

@RestController
@RequestMapping("/pdf")
public class PdfController {

    @Autowired
    private PdfService pdfService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadPdf(@RequestParam("file") MultipartFile file) {
        try {
            byte[] pdfBytes = file.getBytes();
            PdfData savedPdfData = pdfService.extractTextAndStoreInDatabase(pdfBytes);
            return ResponseEntity.ok("PDF data saved with ID: " + savedPdfData.getId());
        } catch (IOException e) {
            return ResponseEntity.badRequest().body("Error uploading or processing the PDF file.");
        }
    }
    
    @GetMapping("/allDetail")
    public ResponseEntity<List<PdfData>> getAllExpenses() {
        List<PdfData> expenses = pdfService.getAllExpenses();
        return ResponseEntity.ok(expenses);
    }
}


