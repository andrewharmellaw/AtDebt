/*
 * @Debt Copyright (C) 2010 Andrew Harmel-Law
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
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * To contact the development team, please refer to the project site at:
 *
 *   http://kenai.com/projects/csdutilities
 */
package com.capgemini.csd.debt.donotignore.test;

import com.capgemini.csd.debt.Debt;

/**
 *
 * @author Andrew Harmel-Law
 * @author Rob Horn
 */
@Debt(desc = "A secondary annotated class.", count = 2)
public class DummyClass
{
	@Debt(desc = "qwerty")
	private String str = "";
	@Debt(desc = "dummy constructor", count = 1)
	public DummyClass()
	{
//		@Debt(desc = "some value.", size = 2)
		int t = 3;
	}
}
