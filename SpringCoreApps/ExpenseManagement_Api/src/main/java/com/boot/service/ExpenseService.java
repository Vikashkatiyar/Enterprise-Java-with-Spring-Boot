package com.boot.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Expense;
import com.boot.repository.ExpenseRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense createExpense(Expense expense) {
        // Implement validation logic here if needed
        return expenseRepository.save(expense);
    }

    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Expense not found"));
    }

    public Expense updateExpense(Long id, Expense expense) {
        //Expense existingExpense = getExpenseById(id);
        
        // Implement update logic here
        
        return expenseRepository.save(expense);
    }

    public void deleteExpense(Long id) {
        expenseRepository.deleteById(id);
    }
    
    public List<Expense> getExpensesByType(String type) {
        return expenseRepository.findByType(type);
    }
    
    public double getTotalExpenses() {
        List<Expense> allExpenses = getAllExpenses();
        return allExpenses.stream()
            .mapToDouble(Expense::getAmount)
            .sum();
    }
    
    public List<Expense> getExpensesInDateRange(Date startDate, Date endDate) {
        return expenseRepository.findByDateBetween(startDate, endDate);
    }


    
}

