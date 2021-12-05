/**
 * 
 */
package com.gl.service;

import com.gl.model.AdminDepartment;
import com.gl.model.HrDepartment;
import com.gl.model.TechDepartment;

/**
 * @author Venunath ----------------------------------------------------
 *
 */
public class DriverClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment("Admin");
		HrDepartment hd = new HrDepartment("HR");
		TechDepartment td = new TechDepartment("Tech");

		System.out.println("Welcome to " + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());

		System.out.println("\n");

		System.out.println("Welcome to " + hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());

		System.out.println("\n");

		System.out.println("Welcome to " + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());

	}

}
