package org.green.uassistant.model;

/**
 * Created by w.castiblanco on 09/03/2017.
 */
public class Call extends Events.CallEvent {
    private final String phoneNumber;

    public Call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
