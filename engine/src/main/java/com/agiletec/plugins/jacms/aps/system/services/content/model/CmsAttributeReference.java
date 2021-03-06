/*
 * Copyright 2013-Present Entando Corporation (http://www.entando.com) All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.agiletec.plugins.jacms.aps.system.services.content.model;

/**
 * Rappresentazione delle referenze interne di un'attributo specifico per il cms.
 * @author E.Santoboni
 */
public class CmsAttributeReference {
	
	public CmsAttributeReference(String page, String content, String resource) {
		this._refPage = page;
		this._refContent = content;
		this._refResource = resource;
	}
	
	public String getRefContent() {
		return _refContent;
	}
	public String getRefPage() {
		return _refPage;
	}
	public String getRefResource() {
		return _refResource;
	}
	
	private String _refPage;
	private String _refContent;
	private String _refResource;
	
}
