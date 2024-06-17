package com.retailer_backend.retailer_backend.Controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.retailer_backend.retailer_backend.model.Customers;
import com.retailer_backend.retailer_backend.model.Transactions;
import com.retailer_backend.retailer_backend.service.CalculateRewardsService;

@RestController
public class CalculateRewardsController {
    private static final Logger logger = LoggerFactory.getLogger(CalculateRewardsController.class);
   
    @Autowired
    private CalculateRewardsService calculateRewardsService;

   
    @GetMapping("/rewards")
    public Map<String, Map<String, Integer>> getRewards() {
        logger.info("Fetching rewards data");
        List<Customers> customers = getJSONData();
        return calculateRewardsService.calculateRewards(customers);
    }

    private List<Customers> getJSONData() {
        Customers customer1 = new Customers();
        customer1.setCustomerId(10);
        customer1.setCustomerName("James Brown");
        customer1.setTransactions(Arrays.asList(
                new Transactions(100,120.0, LocalDate.of(2024, 1, 04)),
                new Transactions(101,100.0, LocalDate.of(2024, 1, 05))
        ));

        Customers customer2 = new Customers();
        customer2.setCustomerId(11);
        customer2.setCustomerName("Michael Phelps");
        customer2.setTransactions(Arrays.asList(
                new Transactions(102,50.0, LocalDate.of(2024, 1, 04)),
                new Transactions(103,150.0, LocalDate.of(2024, 1,8))
        ));

        Customers customer3 = new Customers();
        customer3.setCustomerId(12);
        customer3.setCustomerName("Robert Williams");
        customer3.setTransactions(Arrays.asList(
            new Transactions(104,250.0, LocalDate.of(2024, 2, 8)),
            new Transactions(105,60.0, LocalDate.of(2024, 3,8))
        ));

        Customers customer4 = new Customers();
        customer4.setCustomerId(13);
        customer4.setCustomerName("Linda Hamilton");
        customer4.setTransactions(Arrays.asList(
            new Transactions(106,200.0, LocalDate.of(2024, 1, 8)),
            new Transactions(107,300.0, LocalDate.of(2024, 2,8)),
            new Transactions(108,400.0, LocalDate.of(2024, 3,8))
        ));
        return Arrays.asList(customer1, customer2, customer3,customer4);
    }
}
