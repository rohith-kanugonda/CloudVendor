package com.restdemo.restdemo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.restdemo.Entity.CloudVendor;
import com.restdemo.restdemo.Service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class Controller {

    CloudVendorService cloudVendorService;

    public Controller(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @PostMapping
    public ResponseEntity<String> createCloudVendorDetails(
            @RequestParam("vendorId") String vendorId,
            @RequestParam("vendorName") String vendorName,
            @RequestParam("vendorAddress") String vendorAddress,
            @RequestParam("phoneNumber") String phoneNumber) {

        CloudVendor cloudVendor = new CloudVendor(vendorId, vendorName, vendorAddress, phoneNumber);
        cloudVendorService.createCloudVendor(cloudVendor);
        return ResponseEntity.ok("Thanks for your response");
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        return cloudVendorService.getCloudVendor(vendorId);

    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {

        return cloudVendorService.getAllCloudVendors();

    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {

        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor details updated  successfully";

    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor details deletd successfully";

    }
}
