package com.excilys.java.CDB.validator;

import com.excilys.java.CDB.DTO.RoleDTO;
import com.excilys.java.CDB.exception.RoleException;

public class ValidatorRoleDTO {
	public static void validatorName(String name) throws RoleException {
		if (name == null || name.trim().isEmpty()) {
			throw new RoleException("roleDTO name can't be empty");
		}
	}
	public static void validatorId(String id) throws RoleException {
		if (id == null || id.equals("0")) {
			throw new RoleException("id can't be null");
		}
	}

	public static void validate(RoleDTO roleDTO) throws RoleException {
		if(roleDTO == null) {
			throw new RoleException("roleDTO can't be null");
		}
		validatorName(roleDTO.getName());
		validatorId(roleDTO.getId());
	}
}