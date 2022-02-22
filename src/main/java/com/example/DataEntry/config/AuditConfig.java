package com.example.DataEntry.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component

public class AuditConfig implements AuditorAware<String>{

	@Override
	public Optional<String> getCurrentAuditor() {
		return Optional.of("Admin");
		
		/*
		 * 
		 *   Authentication authentication = SecurityContextHolder
                .getContext()
                .getAuthentication();
        String uname = "system";
        if (authentication != null) {
            uname = authentication
                    .getName();
        }
        return Optional.of(uname);
        
        
        ////////////////////////USED FOR GETTING CURRENT LOGINED USER
		 */

	}

}
