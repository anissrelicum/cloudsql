package com.chandana.dev.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 * 
 * @author Chandana Napagoda
 *
 */

public class CustomerForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String address;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();

		if (getName() == null || ("".equals(getName()))) {
			errors.add("customer.err.name", new ActionMessage(
					"customer.err.name.required"));
		}

		if (getAddress() == null || ("".equals(getAddress()))) {
			errors.add("common.address.err", new ActionMessage(
					"customer.err.address.required"));
		}

		return errors;
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// reset properties
		name = "";
		address = "";
	}

}