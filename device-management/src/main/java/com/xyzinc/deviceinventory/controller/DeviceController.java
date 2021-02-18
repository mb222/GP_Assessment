package com.xyzinc.deviceinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyzinc.deviceinventory.common.Utilities;
import com.xyzinc.deviceinventory.entity.Device;
import com.xyzinc.deviceinventory.exception.InvalidMachineCodeException;
import com.xyzinc.deviceinventory.exception.InvalidSerialNumberException;
import com.xyzinc.deviceinventory.service.DeviceService;

@RestController
@RequestMapping("/device")
public class DeviceController {
	
	@Autowired
	DeviceService deviceService;
	
	@PostMapping("/add")
	public void addADevice(@RequestBody Device device) {
		String machineCode = device.getMachineCode();
		if(machineCode == null || machineCode.trim().isEmpty())
			throw new InvalidMachineCodeException();
		
		if(!Utilities.isAValidString(device.getSerialNumber()))
				throw new InvalidSerialNumberException();
		
		deviceService.saveADevice(device);
	}
	
	
	  @PutMapping("/update") 
	  public void updateADevice(@RequestBody Device device) { 
		  deviceService.updateADevice(device); 
      }
	  
		
	  
}
