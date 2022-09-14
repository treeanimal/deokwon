package com.bisan.deokwon.restcontroller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/home")
    @ApiOperation(
            value = "홈",
            notes = "홈 화면 접근",
            httpMethod = "GET",
            produces = "application/json 입니다.,",
            consumes = "application/json 입니다.."
    )
    @ApiResponses({
            @ApiResponse(code = 200, message = "200OK.."),
            @ApiResponse(code = 404, message = "400Error...")
    })
    public String home(){
        return "hi";
    }
}
