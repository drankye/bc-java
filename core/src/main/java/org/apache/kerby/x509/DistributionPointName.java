package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1Choice;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;

/**
 * The DistributionPointName object.
 * <pre>
 * DistributionPointName ::= CHOICE {
 *     fullName                 [0] GeneralNames,
 *     nameRelativeToCRLIssuer  [1] RDN
 * }
 * </pre>
 */
public class DistributionPointName extends Asn1Choice {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public DistributionPointName() {
        super(fieldInfos);
    }
}
