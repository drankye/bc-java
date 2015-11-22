package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1SequenceOf;

/**
 * Target information extension for attributes certificates according to RFC
 * 3281.
 * 
 * <pre>
 *           SEQUENCE OF Targets
 * </pre>
 * 
 */
public class TargetInformation extends Asn1SequenceOf<Target> {

}
