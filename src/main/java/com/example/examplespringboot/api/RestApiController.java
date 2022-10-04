package com.example.examplespringboot.api;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.example.examplespringboot.model.numberList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/demo")
public class RestApiController {
    private List<numberList> numberLists = new CopyOnWriteArrayList<>();

    @PostMapping("/add")
    public ResponseEntity addTwoNumber(@RequestBody numberList numberList) {
        numberLists.add(numberList);
        return ResponseEntity.ok().body(Integer.toString(Integer.parseInt(numberList.getNumberFirst()) + Integer.parseInt(numberList.getNumberSecond())));
    }

    @PostMapping("/sub")
    public ResponseEntity subTwoNumber(@RequestBody numberList numberList) {
        numberLists.add(numberList);
        return ResponseEntity.ok().body(Integer.toString(Integer.parseInt(numberList.getNumberFirst()) - Integer.parseInt(numberList.getNumberSecond())));
    }

    @PostMapping("/multip")
    public ResponseEntity multipTwoNumber(@RequestBody numberList numberList) {
        numberLists.add(numberList);
        return ResponseEntity.ok().body(Integer.toString(Integer.parseInt(numberList.getNumberFirst()) * Integer.parseInt(numberList.getNumberSecond())));
    }

    @PostMapping("/divide")
    public ResponseEntity divideTwoNumber(@RequestBody numberList numberList) {
        numberLists.add(numberList);
        return ResponseEntity.ok().body(Integer.toString(Integer.parseInt(numberList.getNumberFirst()) / Integer.parseInt(numberList.getNumberSecond())));
    }
}
