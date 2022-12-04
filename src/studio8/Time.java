package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is12h;
	
	

	public Time(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}



	public int getHour() {
		return hour;
	}



	public void setHour(int hour) {
		this.hour = hour;
	}



	public int getMinute() {
		return minute;
	}



	public void setMinute(int minute) {
		this.minute = minute;
	}



	public boolean getIs12h() {
		return is12h;
	}



	public void setHrType(boolean is12h) {
		this.is12h = is12h;
	}


	public String toString() {
		if(is12h == true) {
			int temp = hour % 12 + 12;
			if(hour >= 12) {
				return temp + ":" + minute + " PM";
			}else {
				return temp + ":" + minute + " AM";
			}
		}else {
			return hour + ":" + minute;
		}
	}



	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}



	public static void main(String[] args) {
 
    	
    }

}