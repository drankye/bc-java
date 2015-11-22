package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.*;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.Time;

/**
 * <pre>
 * TBSCertificate ::= SEQUENCE {
 *      version          [ 0 ]  Version DEFAULT v1(0),
 *      serialNumber            CertificateSerialNumber,
 *      signature               AlgorithmIdentifier,
 *      issuer                  Name,
 *      validity                Validity,
 *      subject                 Name,
 *      subjectPublicKeyInfo    SubjectPublicKeyInfo,
 *      issuerUniqueID    [ 1 ] IMPLICIT UniqueIdentifier OPTIONAL,
 *      subjectUniqueID   [ 2 ] IMPLICIT UniqueIdentifier OPTIONAL,
 *      extensions        [ 3 ] Extensions OPTIONAL
 *      }
 * </pre>
 */
public class TBSCertificate extends Asn1SequenceType {
    private static final int VERSION = 0;
    private static final int SERIAL_NUMBER = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(VERSION, -1, Asn1Integer.class),
        new Asn1FieldInfo(SERIAL_NUMBER, -1, Asn1Integer.class)
    };

    public TBSCertificate() {
        super(fieldInfos);
    }

    public int getVersionNumber() {
        return -1;
    }

    public int getVersion() {
        return -1;
    }

    public int getSerialNumber() {
        return -1;
    }

    public AlgorithmIdentifier getSignature() {
        return null;
    }

    public X500Name getIssuer() {
        return null;
    }

    public Time getStartDate() {
        return null;
    }

    public Time getEndDate() {
        return null;
    }

    public X500Name getSubject() {
        return null;
    }

    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return null;
    }

    public byte[] getIssuerUniqueId() {
        return null;
    }

    public byte[] getSubjectUniqueId() {
        return null;
    }

    public Extensions getExtensions() {
        return null;
    }
}
