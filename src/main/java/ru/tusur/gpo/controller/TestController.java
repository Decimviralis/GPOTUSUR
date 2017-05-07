package ru.tusur.gpo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.tusur.gpo.repository.EmployeeRepository;

import java.util.Arrays;

/**
 * Created by nkurtushin on 07.05.2017.
 */
@RestController
public class TestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/calc/method")
    public String testMethod(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        return String.valueOf(employeeRepository.count());
    }
}
