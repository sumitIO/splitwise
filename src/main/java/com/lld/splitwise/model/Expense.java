package com.lld.splitwise.model;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class Expense {

	int id;
	int amount;
	String description;
	Group group;
	List<UserExpense> userExpenses;
	Timestamp createdOn;
	Timestamp updatedOn;
}
