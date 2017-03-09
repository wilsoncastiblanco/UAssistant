package org.green.uassistant.rxbus;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by amitshekhar on 06/02/17.
 */

public class RxBus {

    private PublishSubject<Object> bus = PublishSubject.create();

    public void send(Object object) {
        bus.onNext(object);
    }

    public Observable<Object> toObserverable() {
        return bus;
    }

    public boolean hasObservers() {
        return bus.hasObservers();
    }
}
