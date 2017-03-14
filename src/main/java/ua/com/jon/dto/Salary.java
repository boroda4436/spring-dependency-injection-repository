package ua.com.jon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Bohdan on 14.03.2017
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salary {
    private double amount;
    private String currency;
}
