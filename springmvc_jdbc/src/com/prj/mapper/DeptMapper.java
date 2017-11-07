package com.prj.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.prj.bean.Dept;

@Component("dm")
public class DeptMapper implements RowMapper<Dept>{

	public Dept mapRow(ResultSet rs, int arg1) throws SQLException {
		Dept dept = new Dept();
		dept.setId(rs.getInt(1));
		dept.setName(rs.getString(2));
		dept.setLoc(rs.getString(3));
		return dept;
	}
	
	
	
}
