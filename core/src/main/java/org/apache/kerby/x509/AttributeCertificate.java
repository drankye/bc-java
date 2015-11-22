package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;

/**
 * <pre>
 *  AttributeCertificate ::= SEQUENCE {
 *       acinfo               AttributeCertificateInfo,
 *       signatureAlgorithm   AlgorithmIdentifier,
 *       signatureValue       BIT STRING
 *  }
 * </pre>
 */
public class AttributeCertificate extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public AttributeCertificate() {
        super(fieldInfos);
    }

    public AttributeCertificateInfo getAcinfo() {
        return null;
    }

    public AlgorithmIdentifier getSignatureAlgorithm() {
        return null;
    }

    public byte[] getSignatureValue() {
        return null;
    }
}
