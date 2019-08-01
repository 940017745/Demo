package com.neu.service;

import java.util.List;

import com.neu.entity.CardType;
import com.neu.entity.ScardInfo;

public interface ScardService {
	
	List<ScardInfo> getAll() throws Exception;
}
