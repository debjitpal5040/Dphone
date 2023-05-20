package com.debjit.pal.Dphone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.debjit.pal.Dphone.model.Referral;
import com.debjit.pal.Dphone.service.ReferralService;

@RestController
public class ReferralController {
	
	@Autowired
	private ReferralService referralService;
	
	@GetMapping("/referrals")
	public List<Referral> all() {
		return referralService.showall();
	}

}
