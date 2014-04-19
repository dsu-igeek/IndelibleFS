/*
 * Copyright 2002-2014 iGeek, Inc.
 * All Rights Reserved
 * @Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.@
 */
 
package com.igeekinc.indelible.indeliblefs.uniblock.casstore;

import java.util.EventObject;

public class CASStoreStatusChangedEvent extends EventObject
{
	private CASStoreStatus status;	
	private static final long	serialVersionUID	= 1690843021407842599L;
	public CASStoreStatusChangedEvent(Object paramObject,  CASStoreStatus status)
	{
		super(paramObject);
		this.status = status;
	}
	public CASStoreStatus getStatus()
	{
		return status;
	}
}