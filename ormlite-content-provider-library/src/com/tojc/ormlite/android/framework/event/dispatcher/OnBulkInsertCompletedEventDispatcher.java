package com.tojc.ormlite.android.framework.event.dispatcher;

import com.tojc.ormlite.android.framework.event.EventDispatcherBase;
import com.tojc.ormlite.android.framework.event.multieventlistener.OnBulkInsertCompletedMultiEventListener;
import com.tojc.ormlite.android.framework.event.multieventobject.OnBulkInsertCompletedMultiEventObject;

/**
 * Created by Jaken on 2014/05/05.
 */
public final class OnBulkInsertCompletedEventDispatcher
        extends EventDispatcherBase<OnBulkInsertCompletedMultiEventListener, OnBulkInsertCompletedMultiEventObject> {
    public OnBulkInsertCompletedEventDispatcher() {
        super();
    }

    @Override
    public void dispatch(OnBulkInsertCompletedMultiEventListener listener, OnBulkInsertCompletedMultiEventObject param) {
        listener.onBulkInsertCompleted(param);
    }
}