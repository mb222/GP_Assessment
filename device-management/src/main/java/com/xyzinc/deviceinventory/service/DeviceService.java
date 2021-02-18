package com.xyzinc.deviceinventory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyzinc.deviceinventory.entity.Device;
import com.xyzinc.deviceinventory.exception.MachineCodeNotFoundException;
import com.xyzinc.deviceinventory.exception.SerialNumberNotFoundException;
import com.xyzinc.deviceinventory.repository.DeviceRepository;

@Service
public class DeviceService {

	  @Autowired
	  DeviceRepository deviceRepository;
	  
	  public void saveADevice(Device device) {
		  deviceRepository.save(device);
	  }
	  
	  public void updateADevice(Device device) {
		  if(findADeviceBySerialNumber(device.getSerialNumber()) && 
				  findADeviceByAMachineCode(device.getMachineCode())) {
			  
			 deviceRepository.updateADevice(device.getDeviceName(), device.getMachineCode(), device.getSerialNumber());
			  
		  }
	  }
	  
	  public boolean findADeviceBySerialNumber(String serialId) {
		  List<Device> existingDevice = (List<Device>) deviceRepository.findDeviceBySerialNumber(serialId);
	      if (existingDevice.size() == 0)
	    	  throw new SerialNumberNotFoundException();
	      
	      return true;
	  }
	  
	  public boolean findADeviceByAMachineCode(String machineCode) {
		  List<Device> existingDevice = (List<Device>) deviceRepository.findDeviceByMachineCode(machineCode);
	      if (existingDevice.size() == 0)
	    	  throw new MachineCodeNotFoundException();
	      
	      return true;
	  }
	  
	  
}
