package com.gms.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;



@Component  
@Data
public class MemberDTO {
	private String 
				memberId,
				teamId,
				name,
				ssn,
				roll,
				pass,
				age,
				gender,
				subject;

	


}
