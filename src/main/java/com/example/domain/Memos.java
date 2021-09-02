package com.example.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Memos {
	private int id;
	private String content;
	private String createdAt;
	private String updatedAt;
}
