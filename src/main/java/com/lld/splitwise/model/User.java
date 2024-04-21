package com.lld.splitwise.model;


import lombok.Data;

import java.util.List;

@Data
public class User {

	int id;
	String name;
	String phoneNumber;
	String email;
	List<Group> groups;

	public void totalOwnedAmount() {
		throw new UnsupportedOperationException();
	}
}
