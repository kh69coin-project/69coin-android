package com.kh69coin.core.wallet.families.bitcoin;

import com.kh69coin.core.network.AddressStatus;
import com.kh69coin.core.network.ServerClient.UnspentTx;
import com.kh69coin.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
