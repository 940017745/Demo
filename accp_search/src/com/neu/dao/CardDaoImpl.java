package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.CardType;

public class CardDaoImpl implements CardDao{
		DBUtils db=new DBUtils();
	@Override
	public List<CardType> getAll() throws Exception {
		String sql="select * from card_type";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(connection, sql);
		List<CardType> list =new ArrayList<>();
		CardType cardType=null;
		 String stype;
		 String cardname;
		while(rs.next()) {
			stype=rs.getString("s_type");
			cardname=rs.getString("card_name");
			cardType=new CardType(stype, cardname);
			list.add(cardType);
		}
		return list;
	}

}
