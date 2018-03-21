package application.Events;


import lombok.Value;

@Value
public class CustomerCreatedEvent {
    public String customerId ;
    public String name ;

}
