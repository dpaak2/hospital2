package com.hospital.web.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hospital.web.domain.DoctorDTO;
import com.hospital.web.service.DoctorService;

@Repository
public class DoctorServiceImpl implements DoctorService{
	@Autowired DoctorService service;
	@Override
	public int join(DoctorDTO bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DoctorDTO findbyId(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorDTO login(DoctorDTO bean) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int change(DoctorDTO bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(DoctorDTO bean) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
