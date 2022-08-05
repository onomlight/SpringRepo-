package com.korea.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum;
	private int amount;
	
	public Criteria() {
		this(1,10);
	}
	public Criteria(int pageNum,int amount) {
		
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	//Ãß°¡
	
	private String type;
	private String keyword;
}
