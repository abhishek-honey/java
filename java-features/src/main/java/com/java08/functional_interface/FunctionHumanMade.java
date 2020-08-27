package com.java08.functional_interface;

@FunctionalInterface
public interface FunctionHumanMade<T, R> {
	R apply(T t);
}
