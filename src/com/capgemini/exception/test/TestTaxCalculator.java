package com.capgemini.exception.test;

import org.junit.Test;

import com.capgemini.exception.main.CountryNotValidException;
import com.capgemini.exception.main.EmployeeNameInvalidException;
import com.capgemini.exception.main.TaxCalculator;
import com.capgemini.exception.main.TaxNotEligibleException;

public class TestTaxCalculator {

	TaxCalculator object1;
	TaxCalculator object3;

	// Employee not an Indian Citizen
	@Test
	public void testValidCitizenshipWithoutHandler() {
		try {
			object1 = new TaxCalculator("RAM", false, 34000);

		} catch (Exception e) {
			System.out.println("The employee should be an indian citizen calculating tax");
		}
	}

	@Test(expected = CountryNotValidException.class)
	public void testValidCitizenship()
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		object1 = new TaxCalculator("RAM", false, 34000);

	}

	// Invalid Name of the Employee
	@Test
	public void testValidNameWithoutHandler() {
		try {
			object3 = new TaxCalculator("", true, 34000);

		} catch (Exception e) {
			System.out.println("The employee name cannot be empty");
		}

	}

	@Test(expected = EmployeeNameInvalidException.class)
	public void testValidName()
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		object3 = new TaxCalculator("", true, 34000);

	}

	// Employee Salary = 1000
	@Test
	public void testValidSalaryWithoutHandler() {
		try {
			TaxCalculator object2 = new TaxCalculator("RAM", true, 1000);
			object2.calculateTax();
		} catch (Exception e) {
			System.out.println("The employee does not need to pay tax");
		}

	}

	@Test(expected = TaxNotEligibleException.class)
	public void testValidSalary()
			throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		TaxCalculator object2 = new TaxCalculator("RAM", true, 1000);
		object2.calculateTax();
	}

}
