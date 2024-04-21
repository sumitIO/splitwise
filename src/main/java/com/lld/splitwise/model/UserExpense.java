package com.lld.splitwise.model;

import com.lld.splitwise.model.enums.ExpenseType;
import com.lld.splitwise.model.enums.UserExpenseType;
import lombok.Data;

@Data
public class UserExpense {

	Expense expense;
	User user;
	int amount;
	UserExpenseType userExpenseType;
	ExpenseType expenseType;
}
