package com.dev.demo.api;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Simple {
	private String name;
	private String value;
}
