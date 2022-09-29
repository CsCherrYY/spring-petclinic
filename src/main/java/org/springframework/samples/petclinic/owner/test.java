package org.springframework.samples.petclinic.owner;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class test {

	@Nonnull String str;

	@Nullable public String nullable() {
		return "";
	}

	// case 1: return null in Nonnull methods
	@Nonnull public String nonnull() {
		return null;
	}

	public String getStr() {
		return str;
	}

	// case 2: directly use the return value of Nullable methods
	public static void main(String[] args) {
		System.out.println(new test().nullable().length());
		System.out.println(new test().nonnull().length());
	}

	abstract class A {
		@Nonnull abstract String nonnullMethod();
		@Nullable abstract String nullAbleMethod();
	}

	// case 3: implemented methods have no related Nonnull annotations
	class B extends A {
		String nonnullMethod() { return "empty string"; }
		String nullAbleMethod() { return "empty string"; }
	}

	// case 4: Assign an Nullable variable to an Nonnull variable
	void testList(@Nullable List<String> nullableList) {
		@Nonnull List<String> list2 = nullableList;
	}
}
