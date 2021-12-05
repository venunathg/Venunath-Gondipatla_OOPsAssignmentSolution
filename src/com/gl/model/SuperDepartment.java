/**
 * 
 */
package com.gl.model;

/**
 * @author Venunath ----------------------------------------------------
 *         departmentName will return “ Super Department “ getTodaysWork will
 *         return “ No Work as of now” getWorkDeadline will return “ Nil “
 *         isTodayAHoliday will return “ Today is not a holiday”
 * 
 */
public class SuperDepartment {

	String depName = null;

	/**
	 * @param string
	 * 
	 */
	public SuperDepartment(String departName) {
		// TODO Auto-generated constructor stub
		this.depName = departName;
	}

	public String departmentName() {
		return "Super Department";
	}

	public String getTodaysWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}

}
