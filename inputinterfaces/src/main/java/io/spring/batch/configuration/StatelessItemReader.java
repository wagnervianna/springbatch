package io.spring.batch.configuration;

import java.util.Iterator;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class StatelessItemReader implements ItemReader<String> {

	private final Iterator<String> data;
	
	public StatelessItemReader(List<String> data) {
		this.data = data.iterator();
	}
	
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if(this.data.hasNext()) {
			return this.data.next();
		} else {
			return null;	
		}
	}

	
}
