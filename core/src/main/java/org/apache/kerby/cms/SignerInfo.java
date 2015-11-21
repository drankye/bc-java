/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.apache.kerby.cms;

import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1SequenceType;

/**
 * <a href="http://tools.ietf.org/html/rfc5652#section-5.3">RFC 5652</a>:
 * Signature container per Signer, see {@link SignerIdentifier}.
 * <pre>
 * PKCS#7:
 *
 * SignerInfo ::= SEQUENCE {
 *     version                   Version,
 *     sid                       SignerIdentifier,
 *     digestAlgorithm           DigestAlgorithmIdentifier,
 *     authenticatedAttributes   [0] IMPLICIT Attributes OPTIONAL,
 *     digestEncryptionAlgorithm DigestEncryptionAlgorithmIdentifier,
 *     encryptedDigest           EncryptedDigest,
 *     unauthenticatedAttributes [1] IMPLICIT Attributes OPTIONAL
 * }
 *
 * EncryptedDigest ::= OCTET STRING
 *
 * DigestAlgorithmIdentifier ::= AlgorithmIdentifier
 *
 * DigestEncryptionAlgorithmIdentifier ::= AlgorithmIdentifier
 *
 * -----------------------------------------
 *
 * RFC 5652:
 *
 * SignerInfo ::= SEQUENCE {
 *     version            CMSVersion,
 *     sid                SignerIdentifier,
 *     digestAlgorithm    DigestAlgorithmIdentifier,
 *     signedAttrs        [0] IMPLICIT SignedAttributes OPTIONAL,
 *     signatureAlgorithm SignatureAlgorithmIdentifier,
 *     signature          SignatureValue,
 *     unsignedAttrs      [1] IMPLICIT UnsignedAttributes OPTIONAL
 * }
 *
 * -- {@link SignerIdentifier} referenced certificates are at containing
 * -- {@link SignedData} certificates element.
 *
 * SignerIdentifier ::= CHOICE {
 *     issuerAndSerialNumber {@link IssuerAndSerialNumber},
 *     subjectKeyIdentifier  [0] SubjectKeyIdentifier }
 *
 * -- See Attributes for generalized SET OF {@link Attribute}
 *
 * SignedAttributes   ::= SET SIZE (1..MAX) OF Attribute
 * UnsignedAttributes ::= SET SIZE (1..MAX) OF Attribute
 * 
 * {@link Attribute} ::= SEQUENCE {
 *     attrType   OBJECT IDENTIFIER,
 *     attrValues SET OF AttributeValue }
 *
 * AttributeValue ::= ANY
 * 
 * SignatureValue ::= OCTET STRING
 * </pre>
 */
public class SignerInfo extends Asn1SequenceType {
    private static final int CMS_VERSION = 0;
    private static final int SID = 1;
    private static final int DIGEST_ALGORITHM = 2;
    private static final int SIGNED_ATTRS = 3;
    private static final int SIGNATURE_ALGORITHMS = 4;
    private static final int SIGNATURE = 5;
    private static final int UNSIGNED_ATTRS = 6;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[]{
        new Asn1FieldInfo(CMS_VERSION, CMSVersion.class),
        new Asn1FieldInfo(SID, SignerIdentifier.class),
        new Asn1FieldInfo(DIGEST_ALGORITHM, DigestAlgorithmIdentifier.class),
        new Asn1FieldInfo(SIGNED_ATTRS, SignedAttributes.class),
        new Asn1FieldInfo(SIGNATURE_ALGORITHMS, SignatureAlgorithmIdentifier.class),
        new Asn1FieldInfo(SIGNATURE, SignatureValue.class),
        new Asn1FieldInfo(UNSIGNED_ATTRS, UnsignedAttributes.class)
    };

    public SignerInfo() {
        super(fieldInfos);
    }

    public int getCmsVersion() {
        return getFieldAsInteger(CMS_VERSION);
    }

    public void setCmsVersion(int version) {
        setFieldAsInt(CMS_VERSION, version);
    }

    public SignerIdentifier getSignerIdentifier() {
        return getFieldAs(SID, SignerIdentifier.class);
    }

    public void setSignerIdentifier(SignerIdentifier signerIdentifier) {
        setFieldAs(SID, signerIdentifier);
    }

    public DigestAlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return getFieldAs(DIGEST_ALGORITHM, DigestAlgorithmIdentifier.class);
    }

    public void setDigestAlgorithmIdentifier(DigestAlgorithmIdentifier digestAlgorithmIdentifier) {
        setFieldAs(DIGEST_ALGORITHM, digestAlgorithmIdentifier);
    }

    public SignedAttributes getSignedAttributes() {
        return getFieldAs(SIGNED_ATTRS, SignedAttributes.class);
    }

    public void setSignedAttributes(SignedAttributes signedAttributes) {
        setFieldAs(SIGNED_ATTRS, signedAttributes);
    }

    public SignatureAlgorithmIdentifier getSignatureAlgorithmIdentifier() {
        return getFieldAs(SIGNATURE_ALGORITHMS, SignatureAlgorithmIdentifier.class);
    }

    public void setSignatureAlgorithmIdentifier(SignatureAlgorithmIdentifier signatureAlgorithmIdentifier) {
        setFieldAs(SIGNATURE_ALGORITHMS, signatureAlgorithmIdentifier);
    }

    public SignatureValue getSignatureValue() {
        return getFieldAs(SIGNATURE, SignatureValue.class);
    }

    public void setSignatureValue(SignatureValue signatureValue) {
        setFieldAs(SIGNATURE, signatureValue);
    }

    public UnsignedAttributes getUnsignedAttributes() {
        return getFieldAs(UNSIGNED_ATTRS, UnsignedAttributes.class);
    }

    public void setUnsignedAttributes(UnsignedAttributes unsignedAttributes) {
        setFieldAs(UNSIGNED_ATTRS, unsignedAttributes);
    }
}
