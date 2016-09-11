package com.shiva.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shiva.domain.Category;

@Repository
public class ItemRepository {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	@Autowired
	private AllQueries queries;

	public List<Category> getCateregory() {
		
		List<Category>categories=new ArrayList<>();
		
		String sql=queries.get(AllQueries.Names.GET_ALL_CATEGORY);
		BeanPropertyRowMapper<Category>mapper=new BeanPropertyRowMapper<Category>(Category.class);
		categories=jdbcTemplate.query(sql,mapper);
		
		return categories;
	}

}
