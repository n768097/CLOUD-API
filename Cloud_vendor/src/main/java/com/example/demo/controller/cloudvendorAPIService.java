package com.example.demo.controller;
// how would spring know it is controller
import com.example.demo.model.cloudvendor;
import org.springframework.web.bind.annotation.*;

@RestController // controller annotation
@RequestMapping("/cloudvendor") // context path
public class cloudvendorAPIService {

    cloudvendor cloudvendor;
    @GetMapping("{Identifier}") // this is what we are expecting.
    public cloudvendor getCloudVendorDetails(@PathVariable String Identifier) {
        return cloudvendor;
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody cloudvendor cloudvendor){
        this.cloudvendor= cloudvendor;
        return "Created successfully!!";
//hhvjvjh
    }//
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody cloudvendor cloudvendor){
        this.cloudvendor= cloudvendor;
        return "Updated successfully!!";
        // It returns nothing.

    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudvendor= null;
        return "deleted successfully!!";

    }


}
