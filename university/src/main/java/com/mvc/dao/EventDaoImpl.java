package com.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.mvc.Model.Event;

public class EventDaoImpl implements Event_Dao {

	private JdbcTemplate jdbcTemp;

	public EventDaoImpl(DataSource dataSource) {
		jdbcTemp = new JdbcTemplate(dataSource);
	}

	
	@Override
	public List<Event> eventList() {
		List<Event> list = jdbcTemp.query("SELECT * FROM event", new RowMapper<Event>() {

			@Override
			public Event mapRow(ResultSet rs, int rowNum) throws SQLException {
				Event emp = new Event();

				/*emp.setName(rs.getString("ename"));
				emp.setDesignation(rs.getString("designation"));
				emp.setDept(rs.getString("dept"));
				emp.setSalary(rs.getInt("salary"));
				emp.setLocation(rs.getString("location"));*/
				emp.setEvent_name(rs.getString(1));
				emp.setEvent_descr(rs.getString(2));
				emp.setDateofevent(rs.getString(3));
				emp.setAddrs(rs.getString(4));
				emp.setDateofevent(rs.getString(5));
				emp.setAddrs(rs.getString(6));
				emp.setPhone(rs.getString(7));
				emp.setEmail(rs.getString(8));
				emp.setRules(rs.getString(9));
				

				return emp;
			}

		});

		return list;
	}
}