package com.kh69coin.core.wallet.families.bitcoin;

import com.kh69coin.core.network.AddressStatus;
import com.kh69coin.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
