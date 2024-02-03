package com.restdemo.restdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restdemo.restdemo.Entity.CloudVendor;

public interface CloudVendorRepo extends JpaRepository<CloudVendor,String> {
    
}
