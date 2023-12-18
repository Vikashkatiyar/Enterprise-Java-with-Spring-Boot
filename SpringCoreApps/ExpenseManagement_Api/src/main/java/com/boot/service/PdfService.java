package com.boot.service;

import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Expense;
import com.boot.model.PdfData;
import com.boot.repository.PdfDataRepository;

@Service
public class PdfService {

    @Autowired
    private PdfDataRepository pdfDataRepository;

    public PdfData extractTextAndStoreInDatabase(byte[] pdfBytes) {
        try (PDDocument document = PDDocument.load(pdfBytes)) {
            PDFTextStripper textStripper = new PDFTextStripper();
            String extractedText = textStripper.getText(document);

            PdfData pdfData = new PdfData();
            pdfData.setContent(extractedText);
            
            return pdfDataRepository.save(pdfData);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error extracting text from PDF and storing in the database");
        }
    }
    
    public List<PdfData> getAllExpenses() {
        return pdfDataRepository.findAll();
    }
}

