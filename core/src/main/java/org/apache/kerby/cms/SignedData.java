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
 * <a href="http://tools.ietf.org/html/rfc5652#section-5.1">RFC 5652</a>:
 * <p>
 * A signed data object containing multitude of {@link SignerInfo}s.
 * <pre>
 * SignedData ::= SEQUENCE {
 *     version CMSVersion,
 *     digestAlgorithms DigestAlgorithmIdentifiers,
 *     encapContentInfo EncapsulatedContentInfo,
 *     certificates [0] IMPLICIT CertificateSet OPTIONAL,
 *     crls [1] IMPLICIT RevocationInfoChoices OPTIONAL,
 *     signerInfos SignerInfos
 *   }
 *
 * DigestAlgorithmIdentifiers ::= SET OF DigestAlgorithmIdentifier
 *
 * SignerInfos ::= SET OF SignerInfo
 * </pre>
 * <p>
 * The version calculation uses following ruleset from RFC 5652 section 5.1:
 * <pre>
 * IF ((certificates is present) AND
 *    (any certificates with a type of other are present)) OR
 *    ((crls is present) AND
 *    (any crls with a type of other are present))
 * THEN version MUST be 5
 * ELSE
 *    IF (certificates is present) AND
 *       (any version 2 attribute certificates are present)
 *    THEN version MUST be 4
 *    ELSE
 *       IF ((certificates is present) AND
 *          (any version 1 attribute certificates are present)) OR
 *          (any SignerInfo structures are version 3) OR
 *          (encapContentInfo eContentType is other than id-data)
 *       THEN version MUST be 3
 *       ELSE version MUST be 1
 * </pre>
 * <p>
 */

public class SignedData extends Asn1SequenceType {
    private static final int CMS_VERSION = 0;
    private static final int DIGEST_ALGORITHMS = 1;
    private static final int ENCAP_CONTENT_INFO = 2;
    private static final int CERTIFICATES = 3;
    private static final int CRLS = 4;
    private static final int SIGNER_INFOS = 5;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[]{
        new Asn1FieldInfo(CMS_VERSION, CMSVersion.class),
        new Asn1FieldInfo(DIGEST_ALGORITHMS, DigestAlgorithmIdentifiers.class),
        new Asn1FieldInfo(ENCAP_CONTENT_INFO, EncapsulatedContentInfo.class),
        new Asn1FieldInfo(CERTIFICATES, CertificateSet.class),
        new Asn1FieldInfo(CRLS, RevocationInfoChoices.class),
        new Asn1FieldInfo(SIGNER_INFOS, SignerInfos.class)
    };

    public SignedData() {
        super(fieldInfos);
    }

    public int getVersion() {
        return getFieldAsInteger(CMS_VERSION);
    }

    public void setVersion(int version) {
        setFieldAsInt(CMS_VERSION, version);
    }

    public DigestAlgorithmIdentifiers getDigestAlgorithms() {
        return getFieldAs(DIGEST_ALGORITHMS, DigestAlgorithmIdentifiers.class);
    }

    public void setDigestAlgorithms(DigestAlgorithmIdentifiers digestAlgorithms) {
        setFieldAs(DIGEST_ALGORITHMS, digestAlgorithms);
    }

    public EncapsulatedContentInfo getEncapContentInfo() {
        return getFieldAs(ENCAP_CONTENT_INFO, EncapsulatedContentInfo.class);
    }

    public void setEncapContentInfo(EncapsulatedContentInfo contentInfo) {
        setFieldAs(ENCAP_CONTENT_INFO, contentInfo);
    }

    public CertificateSet getCertificates() {
        return getFieldAs(CERTIFICATES, CertificateSet.class);
    }

    public void setCertificates(CertificateSet certificates) {
        setFieldAs(CERTIFICATES, certificates);
    }

    public RevocationInfoChoices getCrls() {
        return getFieldAs(CRLS, RevocationInfoChoices.class);
    }

    public void setCrls(RevocationInfoChoices crls) {
        setFieldAs(CRLS, crls);
    }

    public SignerInfos getSignerInfos() {
        return getFieldAs(SIGNER_INFOS, SignerInfos.class);
    }

    public void setSignerInfos(SignerInfos signerInfos) {
        setFieldAs(SIGNER_INFOS, signerInfos);
    }
}
