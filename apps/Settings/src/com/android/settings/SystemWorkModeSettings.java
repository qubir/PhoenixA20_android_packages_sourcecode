/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.preference.Preference;
import android.preference.ListPreference;
import android.util.Log;


public class SystemWorkModeSettings extends SettingsPreferenceFragment {

	  //system work mode   
//    private static final String SYSTEM_WORK_MODE = "system_work_mode";
//    private ListPreference mSystemWorkModePreference;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource( R.xml.system_work_mode_introduction );
        
//        
//        // system work mode        
//        mSystemWorkModePreference = (ListPreference)findPreference(SYSTEM_WORK_MODE);    
//        mSystemWorkModePreference.setOnPreferenceChangeListener(this);
//        mSystemWorkModePreference.setValue(Settings.Secure.getString(getContentResolver(), "system_work_mode"));							
//        mSystemWorkModePreference.setSummary((String)mSystemWorkModePreference.getEntry());
    }
    
//    public boolean onPreferenceChange(Preference preference, Object newValue) {
//    		if(preference == mSystemWorkModePreference){
//        	  
//        	  mSystemWorkModePreference.setValue((String)newValue);
//        	  mSystemWorkModePreference.setSummary((String)mSystemWorkModePreference.getEntry());
//						
//						Settings.Secure.putString(getContentResolver(), "system_work_mode", (String)newValue);
//								
//        		return true;
//        }
//        
//        return false;
//    }

}
