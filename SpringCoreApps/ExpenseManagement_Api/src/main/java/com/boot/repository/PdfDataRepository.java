package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.PdfData;

public interface PdfDataRepository extends JpaRepository<PdfData, Long> {
}

