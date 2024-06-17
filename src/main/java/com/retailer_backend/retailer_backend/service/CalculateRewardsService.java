package com.retailer_backend.retailer_backend.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.retailer_backend.retailer_backend.model.Customers;
import com.retailer_backend.retailer_backend.model.Transactions;

@Service
public class CalculateRewardsService {

     public Map<String, Map<String, Integer>> calculateRewards(List<Customers> customers) {
        Map<String, Map<String, Integer>> rewards = new HashMap<>();

        for (Customers customer : customers) {
            Map<String, Integer> monthlyPoints = new HashMap<>();
            int totalPoints = 0;

            for (Transactions transaction : customer.getTransactions()) {
                int points = calculatePointsPerMonth(transaction.getPurchaseAmount());
                totalPoints += points;
                monthlyPoints.merge(transaction.getDate().getMonth().toString(), points, Integer::sum);

            }
            monthlyPoints.merge("Total Rewards", totalPoints, Integer::sum);
            System.out.println(monthlyPoints);
            rewards.put(customer.getCustomerName(), monthlyPoints );
        }

        return rewards;
    }

    private int calculatePointsPerMonth(double amount) {
        int points = 0;

        if (amount > 100) {
            points += (((amount - 100) * 2) + (1 * 50));
          
        }

        if (amount > 50 && amount < 100  ) {
            points += (amount - 50);
        }

        return points;
    }

}
