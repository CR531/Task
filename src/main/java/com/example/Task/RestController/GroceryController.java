package com.example.Task.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GroceryController {

    private int coconuts=20;
    private int potatoes=10;

    @GetMapping(value = "/currentItems")
    public Grocery getCurrentItems()
    {
        return new Grocery(coconuts,potatoes);
    }
    @PostMapping(value = "/orderItems")
    public ResponseEntity<?> orderItems(@RequestBody Grocery grocery){
        coconuts=coconuts-grocery.getCoconuts();
        potatoes=potatoes-grocery.getPotatoes();
        return new ResponseEntity("You have successfully ordered "+grocery.getCoconuts()+" Coconuts and "+grocery.getPotatoes()+" Potatoes", HttpStatus.OK);
    }





}
