package com.coinomi.core.coins;

import com.google.bitcoin.core.Coin;

/**
 * @author Giannis Dzegoutanis
 */
public class PeercoinMain extends CoinType {
    public PeercoinMain() {
        id = "peercoin.main";

        addressHeader = 55;
        p2shHeader = 117;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };

        name = "Peercoin";
        symbol = "PPC";
        uriScheme = "peercoin"; // TODO verify, could be ppcoin?
        bip44Index = 13;
        // TODO set correct values
        feePerKb = Coin.valueOf(1);
        minNonDust = Coin.valueOf(1);
        throw new RuntimeException(name+" bip44Index " + bip44Index + "is not standardized");
    }

    private static PeercoinMain instance;
    public static synchronized PeercoinMain get() {
        if (instance == null) {
            instance = new PeercoinMain();
        }
        return instance;
    }
}
