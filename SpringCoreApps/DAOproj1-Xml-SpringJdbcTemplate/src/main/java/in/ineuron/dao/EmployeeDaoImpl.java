package in.ineuron.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements IEmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int getEmpsCount() {
		System.out.println("jdbcTemplate name is:: "+ jdbcTemplate.getClass().getName());
		return 0;
	}

}
