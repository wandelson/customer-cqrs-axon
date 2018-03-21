package application.CommandHandlers;


import application.Commands.CreateCustomerCommand;
import application.Events.CustomerCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;


@Aggregate
public class CustomerHandler {

    @AggregateIdentifier
    private String id;

    private  String name;

    @SuppressWarnings("unused")
    private CustomerHandler() {
    }



    @CommandHandler
    public CustomerHandler(CreateCustomerCommand command) {
        apply(new CustomerCreatedEvent(command.getCustomerId(), command.getName()));
    }


    @EventSourcingHandler
    public void on(CustomerCreatedEvent event) {
        this.id = event.customerId;
    }


}
