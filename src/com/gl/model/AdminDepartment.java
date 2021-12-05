/**
 * 
 */
package com.gl.model;

/**
 * @author Venunath ----------------------------------------------------
 *         departmentName will return “ Admin Department “ getTodaysWork will
 *         return “Complete your documents Submission” getWorkDeadline will
 *         return “ Complete by EOD “
 * 
 */
public class AdminDepartment extends SuperDepartment {

	public AdminDepartment(String departName) {
		super(departName);

	}

	public String departmentName() {
		return "Admin Department ";

	}

	public String getTodaysWork() {
		return "Complete your documents submission";

	}

	public String getWorkDeadline() {
		return "Complete by EOD ";

	}

}
