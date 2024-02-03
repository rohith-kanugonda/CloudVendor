package com.restdemo.restdemo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restdemo.restdemo.Entity.CloudVendor;
import com.restdemo.restdemo.ExceptionHandling.CloudVendorNotFoundException;
import com.restdemo.restdemo.Repository.CloudVendorRepo;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepo cloudVendorRepo;

    public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
        this.cloudVendorRepo = cloudVendorRepo;
    }

    @SuppressWarnings("null")
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "success";
        
    }

    @SuppressWarnings("null")
    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepo.save(cloudVendor);
        return "success";
        
    }

    @SuppressWarnings("null")
    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepo.deleteById(cloudVendorId);
        return "Success";
        
    }

    @SuppressWarnings("null")
    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {

        if(cloudVendorRepo.findById(cloudVendorId).isEmpty())
         throw new CloudVendorNotFoundException("Requested Cloud Vendor Does Not Exists");
        return cloudVendorRepo.findById(cloudVendorId).get();
       
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {

        return cloudVendorRepo.findAll();
        
    }
    
}
