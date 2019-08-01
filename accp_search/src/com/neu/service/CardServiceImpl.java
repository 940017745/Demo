package com.neu.service;

import java.util.List;

import com.neu.dao.CardDao;
import com.neu.dao.CardDaoImpl;
import com.neu.entity.CardType;

public class CardServiceImpl implements CardService {
	CardDao dao = new CardDaoImpl(); 
	@Override
	public List<CardType> getAll() throws Exception {
		List<CardType> cardType = dao.getAll();
		return cardType;
	}

}
