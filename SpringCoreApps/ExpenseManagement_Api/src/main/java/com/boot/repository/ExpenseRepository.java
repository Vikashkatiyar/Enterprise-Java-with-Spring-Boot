package com.boot.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

	List<Expense> findByType(String type);

	List<Expense> findByDateBetween(Date startDate, Date endDate);

}
