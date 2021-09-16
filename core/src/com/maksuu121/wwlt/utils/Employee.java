package com.maksuu121.wwlt.utils;

import com.maksuu121.wwlt.enums.ActionType;
import com.maksuu121.wwlt.enums.EmployeeType;

public class Employee {
    String name;
    EmployeeType employeeType;
    ActionType actionType;

    public Employee(String name, EmployeeType employeeType) {
        this.name = name;
        this.employeeType = employeeType;
        actionType = ActionType.NOTHING;
    }
}
