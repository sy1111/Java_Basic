package org.study.prj.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.DriverManager;

public class TestExceptionHandling {

	public static void main(String[] args) throws ClassNotFoundException {
		//int i = 10 / 0;
		// 예외 처리 구조
		loadJdbcDrvier();
			
	}
	
	public static void loadJdbcDrvier() throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}

}
