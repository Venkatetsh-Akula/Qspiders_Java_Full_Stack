 package com.ty.ams.responsestructure;

import java.util.Optional;

import com.ty.ams.entity.Attendance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	private int statusCode;
	private String message;
	private T body;
}
