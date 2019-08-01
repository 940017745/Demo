package com.neu.dao;

import java.util.List;

import com.neu.entity.CardType;
import com.neu.entity.ScardInfo;

public interface CardDao {

	List<CardType> getAll() throws Exception;
}
