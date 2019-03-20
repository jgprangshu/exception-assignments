package com.capgemini.exception.main;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate(int day, int month, int year) throws DayEnteredNotValidException, MonthEnteredNotValidException {
		super();
		if(month==2)
		{
			if(day<29 && day>0)
				this.day = day;
			else
				throw new DayEnteredNotValidException("Day entered is invalid");
		}
		else if(month%2==0 && month<13 && month>0)
		{
			if(day<31 && day>0)
				this.day = day;
			else
				throw new DayEnteredNotValidException("Day entered is invalid");
		}
		else if(month%2!=0 && month<13 && month>0)
		{
			if(day<32 && day>0)
				this.day = day;
			else
				throw new DayEnteredNotValidException("Day entered is invalid");
		}
		
		if(month<13 && month>0)
			this.month = month;
		else
			throw new MonthEnteredNotValidException("Month entered was invalid");
		this.year = year;
	}
	public MyDate() {
		super();
		
	}
}
