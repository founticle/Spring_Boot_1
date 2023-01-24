package com.founticle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@SpringBootApplication

@RestController
@RequestMapping("api/v1/customers")
public class Main {

    private final customerRepository customerRepository;

    public Main(customerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
    @GetMapping
    public List<customer> getCustomers() {
        return customerRepository.findAll();
    }

    record NewCustomerRequest(
            String name,
            String email,
            Integer age
    ){

    }

    @PostMapping
    public void addCustomer(@RequestBody NewCustomerRequest request){
        customer Customer = new customer();
        Customer.setName(request.name());
        Customer.setEmail(request.email());
        Customer.setAge(request.age());
        customerRepository.save(Customer);
    }

    @DeleteMapping("{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer id){
        customerRepository.deleteById(id);
    }

    record updateCustomerRequest(
            String name,
            String email,
            Integer age
    ){

    }

    @PutMapping("{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer id,
                               @RequestBody updateCustomerRequest request
                               ){
        customer Customer = new customer();
        Customer.setName(request.name());
        Customer.setEmail(request.email());
        Customer.setAge(request.age());
        customerRepository.save(Customer);;
    }

}
