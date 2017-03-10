package org.green.uassistant.app;

import android.app.Application;

import org.green.uassistant.rxbus.RxBus;

/**
 * Created by w.castiblanco on 09/03/2017.
 */
public class UAssistantApplication extends Application {
    private RxBus bus;

    @Override
    public void onCreate() {
        super.onCreate();
        bus = new RxBus();
    }

    public RxBus bus() {
        return bus;
    }
}
