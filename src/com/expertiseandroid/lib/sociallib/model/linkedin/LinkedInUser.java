/** 
 * Copyright (C) 2010  Expertise Android
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.expertiseandroid.lib.sociallib.model.linkedin;

import com.expertiseandroid.lib.sociallib.model.User;

/**
 * A user on LinkedIn
 * @author Expertise Android
 *
 */
public class LinkedInUser extends User{

  public String id, firstName, lastName, headline, industry, status;
  public int distance, nConnections;

  @Override
  public String getUsername() {
    return firstName + ' ' + lastName;
  }
  
  @Override
  public String toString(){
    return getUsername() + ',' + headline;
  }
}