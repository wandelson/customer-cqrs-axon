package application.api;

import application.Commands.CreateCustomerCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class CustomerController {

    private CommandGateway commandGateway;

    @Autowired
    public CustomerController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }


    @RequestMapping(value = "/",  method = RequestMethod.GET)
    public String ping() {
        return "ping";
    }



    @RequestMapping(value = "/v1/customers", method = RequestMethod.POST)
    @ResponseStatus(OK)
    public void post( @RequestBody CustomerDto dto) {
        CreateCustomerCommand command = new CreateCustomerCommand(UUID.randomUUID().toString(), dto.name);
        commandGateway.send(command);
    }


}
