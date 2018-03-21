package com.example.demo;

import application.CommandHandlers.CustomerHandler;
import org.axonframework.test.aggregate.AggregateTestFixture;
import org.axonframework.test.aggregate.FixtureConfiguration;
import org.junit.Before;
import org.junit.Test;


public class CustomerHandlerTest {

	private FixtureConfiguration<CustomerHandler> fixture;

	@Before
	public void setUp() throws Exception{		
		fixture = new AggregateTestFixture<CustomerHandler>(CustomerHandler.class);
	}
		
	@Test
	public void testCreateCustomer( )throws Exception {
	//	CreateCustomerCommand command = new CreateCustomerCommand();
		//command.cnpj = 1;

		//fixture.givenNoPriorActivity().when(command)
		//.expectEvents(new CustomerAddedEvent(1));
	}



}
