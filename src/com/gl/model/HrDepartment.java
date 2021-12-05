/**
 * 
 */
package com.gl.model;

/**
 * @author Venunath ----------------------------------------------------
 *         departmentName will return “ Hr Department “ getTodaysWork will
 *         return “ Fill today’s timesheet and mark your attendance”
 *         getWorkDeadline will return “ Complete by EOD “ doActivity “team
 *         Lunch”
 * 
 */
public class HrDepartment extends SuperDepartment {

	public HrDepartment(String departName) {
		super(departName);
		// TODO Auto-generated constructor stub
	}

	public String departmentName() {
		return "HR Department";

	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";

	}

	public String getWorkDeadline() {
		return "Complete by EOD";

	}

	public String doActivity() {
		return "team Lunch";

	}

}
