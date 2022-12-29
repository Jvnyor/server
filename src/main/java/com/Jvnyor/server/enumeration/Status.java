package com.Jvnyor.server.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
	SERVER_UP("SERVER_UP"),
	SERVER_DOWN("SERVER_DOWN");
	private final String status;
}
