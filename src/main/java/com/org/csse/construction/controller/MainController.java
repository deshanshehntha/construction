package com.org.csse.construction.controller;

import com.org.csse.construction.data.DataServer;
import com.org.csse.construction.service.ServiceHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")

@Controller
public class MainController {

    @Autowired
    ServiceHandler serviceHandler;

    @Autowired
    DataServer dataServer;

    @GetMapping("/construction")
    public ResponseEntity allData(
            @RequestParam(value = "RT") String reqTyp) {
        return serviceHandler.handleServiceRequest(reqTyp);
    }

}
