package org.apache.kerby.cms;

import org.apache.kerby.asn1.type.Asn1SetOf;

/**
 * RelativeDistinguishedName ::= SET SIZE (1..MAX) OF AttributeTypeAndValue
 */
public class RelativeDistinguishedName extends Asn1SetOf<AttributeTypeAndValue> {
}
