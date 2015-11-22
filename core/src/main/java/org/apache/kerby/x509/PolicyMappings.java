package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1SequenceOf;

/**
 * Ref. RFC3280.
 * <pre>
 *    PolicyMappings ::= SEQUENCE SIZE (1..MAX) OF SEQUENCE {
 *      issuerDomainPolicy      CertPolicyId,
 *      subjectDomainPolicy     CertPolicyId }
 * </pre>
 */
public class PolicyMappings extends Asn1SequenceOf<PolicyMapping> {

}
