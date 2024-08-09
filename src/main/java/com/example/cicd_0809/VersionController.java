package com.example.cicd_0809;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

    @GetMapping
    public ResponseEntity<String> getVersion() {
        System.out.println("aaaa");
        return ResponseEntity.ok("OKOK");
    }
}
