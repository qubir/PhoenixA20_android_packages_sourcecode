/*
 * Copyright (C) 2010 The Android Open Source Project
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

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.android.settings.R;
import android.provider.Settings;
import android.content.ContentResolver;
import android.util.Log;

public class SystemWorkModeEnabler implements CompoundButton.OnCheckedChangeListener  {
    private final Context mContext;
    private Switch mSwitch;
    
    public SystemWorkModeEnabler(Context context, Switch switch_) {
        mContext = context;
        mSwitch = switch_;
    }

    public void setSwitch(Switch switch_) {
        if (mSwitch == switch_) return;
        mSwitch.setOnCheckedChangeListener(null);
        mSwitch = switch_;
        mSwitch.setOnCheckedChangeListener(this);

				String modeStr = Settings.Secure.getString(mContext.getContentResolver(), "system_work_mode");
				if(modeStr.equals("1")){
      			mSwitch.setChecked(true);
      	}else {
      			mSwitch.setChecked(false);
      	}
    }

    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
    	
    		 //Log.v("kinier", "onCheckedChanged call! " + isChecked);
    	
				 mSwitch.setChecked(isChecked);
				 if(isChecked){
				 		Settings.Secure.putString(mContext.getContentResolver(), "system_work_mode", "1");
				 }else{
						Settings.Secure.putString(mContext.getContentResolver(), "system_work_mode", "2");
				 }	 
    }

}
