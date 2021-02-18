package com.xyzinc.deviceinventory.repository;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.xyzinc.deviceinventory.entity.Device;

@Repository
@Transactional
public interface DeviceRepository extends JpaRepository<Device, Integer> {
	
	@Query(value = "SELECT * FROM device WHERE serial_number= :serialNumber", nativeQuery = true)
	Collection<Device> findDeviceBySerialNumber(@Param("serialNumber") String serialNumber);
	
	@Query(value = "SELECT * FROM device WHERE machine_code= :machineCode", nativeQuery = true)
	Collection<Device> findDeviceByMachineCode(@Param("machineCode") String machineCode);
	
	@Modifying
	@Query(value = "UPDATE device d SET d.device_name= :deviceName WHERE d.machine_code= :machineCode AND d.serial_number= :serialNumber", nativeQuery = true)
	int updateADevice(@Param("deviceName") String deviceName, @Param("machineCode") String machineCode,@Param("serialNumber") String serialNumber);

}
