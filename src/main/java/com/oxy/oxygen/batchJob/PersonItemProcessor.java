package com.oxy.oxygen.batchJob;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.ItemProcessor;

import com.oxy.oxygen.model.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	private static final Logger logger = LogManager.getLogger(PersonItemProcessor.class);

	@Override
	public Person process(final Person person) throws Exception {

		final String firstName = person.getFirstName().toUpperCase();
		final String lastName = person.getLastName().toUpperCase();

		final Person transformedPerson = new Person(firstName, lastName);

		logger.info("Converting " + person + " into " + transformedPerson);

		return transformedPerson;
	}

}
