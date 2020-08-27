package com.java08.functional_interface;

@FunctionalInterface
public interface CounsumerHumanMade<T> {
	void accept(T t);
}
