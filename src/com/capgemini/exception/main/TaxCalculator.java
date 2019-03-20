package com.capgemini.exception.main;

public class TaxCalculator {

	private String empName;
	private boolean isIndian = true;
	private double empSalary;
	private double taxAmount;

	public TaxCalculator() {
		super();
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public boolean isIndian() {
		return isIndian;
	}

	public void setIndian(boolean isIndian) {
		this.isIndian = isIndian;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public TaxCalculator(String empName, boolean isIndian, double empSalary)
			throws CountryNotValidException, EmployeeNameInvalidException {
		super();
		// condition for checking citizenship
		if (isIndian)
			this.isIndian = isIndian;
		else
			throw new CountryNotValidException("The employee should be a indian citizen");

		// condition for checking valid name
		if (empName == null)
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		else
			this.empName = empName;

		this.isIndian = isIndian;
		this.empSalary = empSalary;
	}

	public void calculateTax() throws TaxNotEligibleException {

		// condition for calculating tax
		if (empSalary > 100000 && isIndian) {
			taxAmount = empSalary * 8 / 100;
		} else if (empSalary > 50000 && empSalary < 100000) {
			taxAmount = empSalary * 6 / 100;
		} else if (empSalary > 30000 && empSalary < 50000) {
			taxAmount = empSalary * 5 / 100;
		} else if (empSalary > 10000 && empSalary < 30000) {
			taxAmount = empSalary * 4 / 100;
		} else
			throw new TaxNotEligibleException("The employee does not need to pay tax");

		System.out.println("Tax amount is" + taxAmount);
	}

}
