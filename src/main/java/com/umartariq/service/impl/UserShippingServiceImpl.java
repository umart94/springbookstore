package com.umartariq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umartariq.domain.UserShipping;
import com.umartariq.repository.UserShippingRepository;
import com.umartariq.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService{

	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		return userShippingRepository.findById(id).orElse(null);
	}
	
	public void removeById(Long id) {
		userShippingRepository.deleteById(id);
	}

}
