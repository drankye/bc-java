package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.x509.Certificate;

/**
 *
 * <pre>
 *       CertificatePair ::= SEQUENCE {
 *         forward        [0]    Certificate OPTIONAL,
 *         reverse        [1]    Certificate OPTIONAL,
 *         -- at least one of the pair shall be present -- } 
 * </pre>
 */
public class CertificatePair extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public CertificatePair() {
        super(fieldInfos);
    }

    public Certificate getForward() {
        return null;
    }

    public Certificate getReverse() {
        return null;
    }
}
