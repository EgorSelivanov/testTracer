package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class TestController {
    @GetMapping("/null")
    @ResponseStatus(HttpStatus.OK)
    public void testNull() {
        int test = 7 / 0;
    }

    @GetMapping("/index")
    @ResponseStatus(HttpStatus.OK)
    public void test() {
        throw new IndexOutOfBoundsException();
    }
}
