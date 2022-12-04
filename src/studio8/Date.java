package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private String month;
	private int year;
	private int day;
	private boolean isHoliday;
	
	


    public Date(String month, int year, int day, boolean isHoliday) {
		super();
		this.month = month;
		this.year = year;
		this.day = day;
		this.isHoliday = isHoliday;
	}




	public String getMonth() {
		return month;
	}




	public void setMonth(String month) {
		this.month = month;
	}




	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}




	public int getDay() {
		return day;
	}




	public void setDay(int day) {
		this.day = day;
	}




	public boolean isHoliday() {
		return isHoliday;
	}




	public void setHoliday(boolean isHoliday) {
		this.isHoliday = isHoliday;
	}



	public String toString() {
		if(this.isHoliday == false) {
			return day + " " + month + " " + year + " is not a holiday";
		}else {
			return day + " " + month + " " + year + " is a holiday";
		}
		
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && Objects.equals(month, other.month) && year == other.year;
	}




	public static void main(String[] args) {
		Date nov27 = new Date("November", 27, 2002, true);
		Date xmas = new Date("December", 25, 2022, true);
		Date xmas2 = new Date("December", 25, 2022, true);
		Date mar3 = new Date("March", 3, 1873, false);
		Date apr19 = new Date("April", 19, 2018, false);
		Date jul4 = new Date("July", 4, 1776, true);
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(jul4);
		list.add(apr19);
		list.add(nov27);
		list.add(xmas);
		list.add(xmas);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(xmas);
		set.add(xmas2);
		set.add(xmas);
		System.out.println(set);
		
		list.add(xmas);
		list.add(xmas2);
		list.add(xmas);
		System.out.println(list);
		
		
    }

}
