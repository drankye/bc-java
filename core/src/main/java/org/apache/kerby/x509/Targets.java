package org.apache.kerby.x509;

import java.util.Enumeration;

import org.apache.kerby.asn1.type.Asn1SequenceOf;
import org.apache.kerby.asn1.type.Asn1SequenceType;

/**
 * Targets structure used in target information extension for attribute
 * certificates from RFC 3281.
 * 
 * <pre>
 *            Targets ::= SEQUENCE OF Target
 *           
 *            Target  ::= CHOICE {
 *              targetName          [0] GeneralName,
 *              targetGroup         [1] GeneralName,
 *              targetCert          [2] TargetCert
 *            }
 *           
 *            TargetCert  ::= SEQUENCE {
 *              targetCertificate    IssuerSerial,
 *              targetName           GeneralName OPTIONAL,
 *              certDigestInfo       ObjectDigestInfo OPTIONAL
 *            }
 * </pre>
 */
public class Targets extends Asn1SequenceOf<Target> {

}
