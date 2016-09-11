package com.shiva.repository;

import java.util.Properties;

import org.springframework.stereotype.Component;

@Component
public class AllQueries {

	final Properties sql;

	public AllQueries(Properties sql) {
		super();
		this.sql = sql;
	}

	public String get(final String key) {
		final String result = sql.getProperty(key);
		if (result ==null) {
			throw new IllegalArgumentException(String.format("'%s was not recognized as a valid query", key));
		}
		return result;
	}

	public static class Names {
		public static final String GET_ALL_CATEGORY = "GetAllCategory.sql";

		private Names() {

		}
	}

}
