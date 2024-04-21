package com.lld.splitwise.model;

import lombok.Data;

import java.util.List;

@Data
public class Group {

	int id;
	String name;
	User admin;
	List<User> members;
	List<Expense> expenses;
}
