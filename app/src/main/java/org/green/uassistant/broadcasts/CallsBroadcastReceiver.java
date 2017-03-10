package org.green.uassistant.broadcasts;

import org.green.uassistant.app.UAssistantApplication;
import org.green.uassistant.model.Call;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by w.castiblanco on 07/03/2017.
 */
public class CallsBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            if (state != null && state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String phoneNumber = extras.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                ((UAssistantApplication) context.getApplicationContext()).bus().send(new Call(phoneNumber));
                Log.e("DEBUG", phoneNumber);
            }
        }
    }

}
