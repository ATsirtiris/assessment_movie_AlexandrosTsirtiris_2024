package com.casecode.mobilemovieexplorer.data.utils;

import io.reactivex.rxjava3.core.Flowable;

/**
 * Interface defining methods for monitoring network connectivity.
 */
public interface NetworkMonitor {

    /**
     * Returns a {@link Flowable} emitting boolean values indicating whether the device is online.
     *
     * @return A {@link Flowable} emitting {@code true} if online, {@code false} otherwise.
     */
    Flowable<Boolean> isOnline();
}