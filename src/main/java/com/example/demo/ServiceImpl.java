package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.*;


@Service
public class ServiceImpl implements CloudVendorService{

	CloudVendorRepository cvr;
	
	public ServiceImpl(CloudVendorRepository cvr) {
		this.cvr = cvr;
	}

	@Override
	public String createCloudVendor(CloudVendor cv) {
		// TODO Auto-generated method stub
		cvr.save(cv);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cv) {
		// TODO Auto-generated method stub
		cvr.save(cv);
		return "update Success";
	}

	@Override
	public String deleteCloudVendor(String contactorID) {
		// TODO Auto-generated method stub
		cvr.deleteById(contactorID);
		return "Deletion Success";
	}

	@Override
	public CloudVendor getCloudVendor(String contactorID) {
		// TODO Auto-generated method stub
		return cvr.findById(contactorID).get();
	}

	@Override
	public List<CloudVendor> getallCloudVendor() {
		// TODO Auto-generated method stub
		return cvr.findAll();
	}

}
