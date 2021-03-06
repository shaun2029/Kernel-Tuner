/*
 * This file is part of the Kernel Tuner.
 *
 * Copyright Predrag Čokulov <predragcokulov@gmail.com>
 *
 * Kernel Tuner is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Kernel Tuner is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Kernel Tuner. If not, see <http://www.gnu.org/licenses/>.
 */
package rs.pedjaapps.KernelTuner.entry;

public class SysCtlDatabaseEntry
{

	//private variables
    int _id;
    String _key;
    String _value;


    // Empty constructor
    public SysCtlDatabaseEntry()
	{

    }
    // constructor
    public SysCtlDatabaseEntry(int id, String key, String value)
	{
        this._id = id;
        this._key = key;
        this._value = value;
		;


    }

    // constructor
    public SysCtlDatabaseEntry(String key, String value)
	{
    	this._key = key;
        this._value = value;

    }
    // getting ID
    public int getID()
	{
        return this._id;
    }

    // setting id
    public void setID(int id)
	{
        this._id = id;
    }

    public String getKey()
	{
        return this._key;
    }


    public void setKey(String key)
	{
        this._key = key;
    }


    public String getValue()
	{
        return this._value;
    }


    public void setValue(String value)
	{
        this._value = value;
    }


}
