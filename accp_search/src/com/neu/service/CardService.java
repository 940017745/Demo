package com.neu.service;

import java.util.List;

import com.neu.entity.CardType;

public interface CardService {
	List<CardType> getAll() throws Exception;
}
