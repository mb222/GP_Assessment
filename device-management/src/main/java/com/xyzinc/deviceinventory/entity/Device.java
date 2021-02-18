package com.xyzinc.deviceinventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Device {
	
	
	@Id
	@GeneratedValue
	private int deviceId;
	private String serialNumber;
	private String machineCode;
	private String deviceName;
	
	public Device() {
		super();
	}
	public Device(int deviceId, String serialNumber, String machineCode, String deviceName) {
		super();
		this.deviceId = deviceId;
		this.serialNumber = serialNumber;
		this.machineCode = machineCode;
		this.deviceName = deviceName;
	}
	
	
	
	/**
	 * @return the deviceId
	 */
	public int getDeviceId() {
		return deviceId;
	}
	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * @return the machineCode
	 */
	public String getMachineCode() {
		return machineCode;
	}
	/**
	 * @param machineCode the machineCode to set
	 */
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}
	/**
	 * @return the deviceName
	 */
	public String getDeviceName() {
		return deviceName;
	}
	/**
	 * @param deviceName the deviceName to set
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	

}
