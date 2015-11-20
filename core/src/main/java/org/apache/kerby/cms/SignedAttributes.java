package org.apache.kerby.cms;

import org.apache.kerby.asn1.type.Asn1SetOf;

/**
 * SignedAttributes ::= SET SIZE (1..MAX) OF Attribute
 */
public class SignedAttributes extends Asn1SetOf<Attribute>{
}
