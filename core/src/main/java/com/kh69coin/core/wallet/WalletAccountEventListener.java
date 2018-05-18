package com.kh69coin.core.wallet;

import com.kh69coin.core.coins.Value;

/**
 * @author John L. Jegutanis
 */
public interface WalletAccountEventListener {

    void onNewBalance(Value newBalance);

    void onNewBlock(WalletAccount pocket);

    void onTransactionConfidenceChanged(WalletAccount pocket, AbstractTransaction tx);

    void onTransactionBroadcastFailure(WalletAccount pocket, AbstractTransaction tx);

    void onTransactionBroadcastSuccess(WalletAccount pocket, AbstractTransaction tx);

    void onWalletChanged(final WalletAccount pocket);

    void onConnectivityStatus(WalletConnectivityStatus connectivityStatus);
}
