package com.kh69coin.core.coins;

import com.kh69coin.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class Kh69coinMain extends BitFamily {
    private Kh69coinMain() {
        id = "Kh69coin.main";

        addressHeader = 69;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 176;

        name = "69coin";
        symbol = "69C";
        uriScheme = "kh69coin";
        bip44Index = 2;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 69C mininput
        softDustLimit = value(100000); // 0.001 69C
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("69coin Signed Message:\n");
    }

    private static Kh69coinMain instance = new Kh69coinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}