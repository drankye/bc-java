package org.apache.kerby.x509;

/**
 * Ref. RFC 3039
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
 */
public class SubjectDirectoryAttributes extends Attributes {

}
