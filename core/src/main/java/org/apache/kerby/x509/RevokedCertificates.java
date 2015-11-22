package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1SequenceOf;

/**
 * Ref. RFC-2459
 * <pre>
 *   revokedCertificates     SEQUENCE OF SEQUENCE  {
 *   userCertificate         CertificateSerialNumber,
 *   revocationDate          Time,
 *   crlEntryExtensions      Extensions OPTIONAL
 *                            -- if present, shall be v2
 *  }
 *
 * </pre>
 */
public class RevokedCertificates extends Asn1SequenceOf<RevokedCertificate> {

}
