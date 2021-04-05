package org.zerock.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class ToDoDTO {
	private String title;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date dueDate;
}
