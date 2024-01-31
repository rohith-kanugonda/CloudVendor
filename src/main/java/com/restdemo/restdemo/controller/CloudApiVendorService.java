package com.restdemo.restdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.restdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiVendorService {

    CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {

        return cloudVendor;
        // return new CloudVendor("C1", "Vendor1",
        // "Address1", "xxxxxxx");
    }
    @PostMapping
    public String createCloudVendorDetails( @RequestBody CloudVendor cloudVendor){

        this.cloudVendor = cloudVendor;
        return "Cloud vendor details saved successfully";
         
    }


    @PutMapping
    public String updateCloudVendorDetails( @RequestBody CloudVendor cloudVendor){

        this.cloudVendor = cloudVendor;
        return "Cloud vendor details updated  successfully";
         
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails( String vendorId){

        this.cloudVendor = null;
        return "Cloud vendor details deletd successfully";
         
    }
}
