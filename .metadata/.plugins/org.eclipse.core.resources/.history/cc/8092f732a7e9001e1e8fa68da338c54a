package com.firstproject.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.firstproject.model.Employee;

@Repository
public class EmployeeRepository {

	private JdbcTemplate jdbcTemplate;

	public EmployeeRepository() {
		super();
		System.out.println("EmployeeRepository constructor called");
	}

	public void save(Employee emp) {

		String query = "insert into employee (id, emp_name, designation) values (?,?,?)";
		/**
		 * Employee table should be there otherwise Error will be thrown
		 * 
		 * To resolve this error we can add a schema in the resources To initialize the
		 * table with existing data we can add data.sql file in the resources
		 */
		int rows = jdbcTemplate.update(query, emp.getId(), emp.getName(), emp.getDesignation());
		System.out.println(rows + " Rows updated");
	}

	public List<Employee> getAll() {

		String sqlQuery = "select * from employee";
		List<Employee> employees = jdbcTemplate.query(sqlQuery, (rs, row) -> {
			Employee employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setDesignation(rs.getString(3));
			return employee;
		});
		return employees;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * dependency injection provided for JDBC template
	 * 
	 * @param jdbcTemplate
	 */
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		System.out.println("setJdbcTemplate called...");
	}

}
