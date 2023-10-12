package com.example.demo;

import java.util.List;

import com.example.demo.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cv);
	public String updateCloudVendor(CloudVendor cv);
	public String deleteCloudVendor(String contactorID);
	public CloudVendor getCloudVendor(String contactorID);
	public List<CloudVendor> getallCloudVendor();
		
}
