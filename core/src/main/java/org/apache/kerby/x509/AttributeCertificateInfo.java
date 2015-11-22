package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;

/**
 *
 * <pre>
 *  AttributeCertificateInfo ::= SEQUENCE {
 *       version              AttCertVersion -- version is v2,
 *       holder               Holder,
 *       issuer               AttCertIssuer,
 *       signature            AlgorithmIdentifier,
 *       serialNumber         CertificateSerialNumber,
 *       attrCertValidityPeriod   AttCertValidityPeriod,
 *       attributes           SEQUENCE OF Attribute,
 *       issuerUniqueID       UniqueIdentifier OPTIONAL,
 *       extensions           Extensions OPTIONAL
 *  }
 *
 *  AttCertVersion ::= INTEGER { v2(1) }
 * </pre>
 */
public class AttributeCertificateInfo extends Asn1SequenceType {
    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public AttributeCertificateInfo() {
        super(fieldInfos);
    }

    public int getVersion() {
        return -1;
    }

    public Holder getHolder() {
        return null;
    }

    public AttCertIssuer getIssuer() {
        return null;
    }

    public AlgorithmIdentifier getSignature() {
        return null;
    }

    public int getSerialNumber() {
        return -1;
    }

    public AttCertValidityPeriod getAttrCertValidityPeriod() {
        return null;
    }

    public Attributes getAttributes() {
        return null;
    }

    public byte[] getIssuerUniqueID() {
        return null;
    }

    public Extensions getExtensions() {
        return null;
    }
}
