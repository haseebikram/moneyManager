package com.example.enterprise;

import com.example.enterprise.dto.Income;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MoneyManagerController {



    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/income")
    public ResponseEntity fetchAllIncome() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/income/{id}/")
    public ResponseEntity fetchIncomeById(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);

    }

    @PostMapping(value="/income", consumes = "application/json", produces = "application/json")
    public Income addIncome(@RequestBody Income income){
        return income;
    }

}
