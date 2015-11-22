package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1SequenceOf;

/**
 * This extension may contain further X.500 attributes of the subject. See also
 * RFC 3039.
 *
 * <pre>
 *     SubjectDirectoryAttributes ::= Attributes
 *     Attributes ::= SEQUENCE SIZE (1..MAX) OF Attribute
 *     Attribute ::= SEQUENCE
 *     {
 *       type AttributeType
 *       values SET OF AttributeValue
 *     }
 *
 *     AttributeType ::= OBJECT IDENTIFIER
 *     AttributeValue ::= ANY DEFINED BY AttributeType
 * </pre>
 *
 * @see org.bouncycastle.asn1.x500.style.BCStyle for AttributeType ObjectIdentifiers.
 */
public class Attributes extends Asn1SequenceOf<Attribute> {

}
