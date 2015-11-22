package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.x509.DistributionPointName;
import org.bouncycastle.asn1.x509.ReasonFlags;

/**
 * <pre>
 * IssuingDistributionPoint ::= SEQUENCE { 
 *   distributionPoint          [0] DistributionPointName OPTIONAL, 
 *   onlyContainsUserCerts      [1] BOOLEAN DEFAULT FALSE, 
 *   onlyContainsCACerts        [2] BOOLEAN DEFAULT FALSE, 
 *   onlySomeReasons            [3] ReasonFlags OPTIONAL, 
 *   indirectCRL                [4] BOOLEAN DEFAULT FALSE,
 *   onlyContainsAttributeCerts [5] BOOLEAN DEFAULT FALSE }
 * </pre>
 */
public class IssuingDistributionPoint extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public IssuingDistributionPoint() {
        super(fieldInfos);
    }

    public boolean onlyContainsUserCerts() {
        return false;
    }

    public boolean onlyContainsCACerts() {
        return false;
    }

    public boolean isIndirectCRL() {
        return false;
    }

    public boolean onlyContainsAttributeCerts() {
        return false;
    }

    public DistributionPointName getDistributionPoint() {
        return null;
    }

    public ReasonFlags getOnlySomeReasons() {
        return null;
    }
}
