package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.web3j.abi.datatypes.Fixed;

/**
 * Auto generated code.
 * <p><strong>Do not modifiy!</strong>
 * <p>Please use org.web3j.codegen.AbiTypesGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 */
public class Fixed128x56 extends Fixed {
    public static final Fixed128x56 DEFAULT = new Fixed128x56(BigInteger.ZERO);

    public Fixed128x56(BigInteger value) {
        super(128, 56, value);
    }

    public Fixed128x56(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(128, 56, m, n);
    }
}
