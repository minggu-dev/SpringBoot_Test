package com.example.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude={"v2"})
public class TestVo {
	private String v1;
	private String v2;
}
