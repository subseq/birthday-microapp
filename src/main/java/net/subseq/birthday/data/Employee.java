package net.subseq.birthday.data;


import org.joda.time.Days;
import org.joda.time.LocalDate;

public class Employee {
	
    public Employee(String firstname, String lastname, LocalDate birthday) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    private String firstname;
    private String lastname;
    private LocalDate birthday;
    
    private boolean hasBirthdayWithIn3Days = false;
    private int daysTillBirthday;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    public boolean getHasBirthdayWithIn3Days() {
    	this.hasBirthdayWithIn3Days = hasBirthDayInXDays(this.birthday, 3);
        return hasBirthdayWithIn3Days;
    }
    
    public int getDaysTillBirthday() {
    	LocalDate today = new LocalDate();
		today = LocalDate.now();
		
		if (Days.daysBetween(today, this.birthday.withYear(today.getYear())).getDays() >= 0) {
			daysTillBirthday =  Days.daysBetween(today, this.birthday.withYear(today.getYear())).getDays();
		}
		else daysTillBirthday =  Days.daysBetween(today, this.birthday.withYear(today.getYear()).plusYears(1)).getDays();
		
		return daysTillBirthday;
    }
    
    public boolean hasBirthDayInXDays(LocalDate birthday, int xDays){
		LocalDate today = new LocalDate();
		today = LocalDate.now();
		
		if (birthday.withYear(today.getYear()).compareTo(today) >= 0 && 
				birthday.withYear(today.getYear()).compareTo(today.plusDays(xDays)) <= 0){
			return true;
		}
		else {
			return false;
		}
	}
    
}
