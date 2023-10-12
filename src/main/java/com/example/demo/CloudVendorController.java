package com.example.demo;

import com.example.demo.CloudVendor;
import com.example.demo.CloudVendorService;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController
{
	//CloudVendor cv;
	CloudVendorService cvs;
	
	public CloudVendorController(CloudVendorService cvs) {
		this.cvs = cvs;
	}

	private List<CloudVendor> cloudVendorHistory = new ArrayList<>();
	
	@GetMapping("{contactorID}")
	public CloudVendor getCloudVendorDetails(@PathVariable("contactorID") String contactorID) {
		
		return cvs.getCloudVendor(contactorID);
		/*
		 * for (CloudVendor cv : cloudVendorHistory) { if
		 * (cv.getContactorID().equals(contactorID)) { return cv; } } return null;
		 */
	}
	
	
	@GetMapping()
	public List<CloudVendor> getallCloudVendorDetails() {
		
		return cvs.getallCloudVendor();
		/*
		 * for (CloudVendor cv : cloudVendorHistory) { if
		 * (cv.getContactorID().equals(contactorID)) { return cv; } } return null;
		 */
	}
	
	@PostMapping
	public String createCloudVendordetails(@RequestBody CloudVendor cv)
	{
		/*
		 * cloudVendorHistory.add(cv) ;
		 */
		
		cvs.createCloudVendor(cv);
		return "Created Successfully";
	}
	
	@PutMapping("/{contactorID}")
	public String updateCloudVendordetails(@PathVariable String contactorID,@RequestBody CloudVendor updatedCV)
	{
		/*for (CloudVendor cv : cloudVendorHistory) {
            if (cv.getContactorID().equals(contactorID)) {
                // Update the existing CloudVendor object with the new data
                cv.setContactorName(updatedCV.getContactorName());
                cv.setContactNum(updatedCV.getContactNum());
                return "Updated Successfully";
            }*/
		
		cvs.updateCloudVendor(updatedCV);
		return "update success";
	//}
		//return "CloudVendor not found";
}
	
	@DeleteMapping("{contactorID}")
	public String deleteCloudVendordetails(@PathVariable("contactorID") String contactorID)
	{
		/*
		 * Iterator<CloudVendor> iterator = cloudVendorHistory.iterator(); while
		 * (iterator.hasNext()) { CloudVendor cv = iterator.next(); if
		 * (cv.getContactorID().equals(contactorID)) { iterator.remove(); return
		 * "Deleted Successfully"; } } return "Record Not found to delete";
		 */
		cvs.deleteCloudVendor(contactorID);
		return "delete success";
}
}