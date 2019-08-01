package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.ScardInfo;

public class ScardDaoImpl implements ScardDao{

	DBUtils db=new DBUtils();
	
	@Override
	public List<ScardInfo> getAll() throws Exception {
		String sql="select * from s_card_info ";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql);
		ScardInfo scardInfo=null;
		List<ScardInfo> list=new ArrayList<>();
		 Integer sid;
		 String sname;
		 String idcard;
		 Double scard;
		 Date sdate;
		 String stype;
		 while(rs.next()) {
			 sid=rs.getInt("s_id");
			 sname=rs.getString("s_name");
			 idcard=rs.getString("id_card");
			 scard=rs.getDouble("s_card");
			 sdate= rs.getDate("s_date");
			 stype=rs.getString("s_type");
			 scardInfo=new ScardInfo(sid, sname, idcard, scard, sdate, stype);
			 list.add(scardInfo);
		 }
		 return list;
	}

}
