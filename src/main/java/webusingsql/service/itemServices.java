package webusingsql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import webusingsql.dao.itemsdao;

@Service
public class itemServices {
	@Autowired
	itemsdao dao;
	
	@Transactional
	public List ServiceGetListItems() {
		return dao.getItems();
	}
}
