/**
 * 
 */
package com.gl.model;

/**
 * @author Venunath ----------------------------------------------------
 *         departmentName will return “ Tech Department “ getTodaysWork will
 *         return “ Complete coding of module 1” getWorkDeadline will return “
 *         Complete by EOD “ getTechStackInformation will return “core Java”
 * 
 */
public class TechDepartment extends SuperDepartment {

	public TechDepartment(String departName) {
		super(departName);
	}

	public String departmentName() {

		return "Tech Department ";

	}

	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

}
