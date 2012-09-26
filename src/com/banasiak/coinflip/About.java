/*
 *========================================================================
 * About.java
 * Sep 26, 2012 03:02:52 PM | variable
 * Copyright (c) 2011 Richard Banasiak
 *========================================================================
 * This file is part of CoinFlip.
 *
 *    CoinFlip is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    CoinFlip is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with CoinFlip.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.banasiak.coinflip;

import android.app.Activity;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class About extends Activity
{
    // debugging tag
    private static final String TAG = "About";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        Log.d(TAG, "onCreate()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        
        // pull the version name from the manifest so it doesn't have to be manually updated in the strings files
        try 
        {
			String versionName = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
			TextView versionText = (TextView) findViewById(R.id.about_version_text_view);
			versionText.setText(versionName);
		} 
        catch (NameNotFoundException e) 
        {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
