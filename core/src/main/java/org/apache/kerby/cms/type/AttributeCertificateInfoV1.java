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
package org.apache.kerby.cms.type;

import org.apache.kerby.asn1.type.Asn1BitString;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1Integer;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.apache.kerby.x509.type.AlgorithmIdentifier;
import org.apache.kerby.x509.type.AttCertIssuer;
import org.apache.kerby.x509.type.AttCertValidityPeriod;
import org.apache.kerby.x509.type.Attributes;
import org.apache.kerby.x509.type.CertificateSerialNumber;
import org.apache.kerby.x509.type.Extensions;

/**
 * AttributeCertificateInfoV1 ::= SEQUENCE {
 *   version AttCertVersionV1 DEFAULT v1,
 *   subject Subject,
 *   issuer GeneralNames,
 *   signature AlgorithmIdentifier,
 *   serialNumber CertificateSerialNumber,
 *   attCertValidityPeriod AttCertValidityPeriod,
 *   attributes SEQUENCE OF Attribute,
 *   issuerUniqueID UniqueIdentifier OPTIONAL,
 *   extensions Extensions OPTIONAL
 * }
 *
 * AttCertVersionV1 ::= INTEGER { v1(0) }
 */
public class AttributeCertificateInfoV1 extends Asn1SequenceType {

    private static final int VERSION = 0;
    private static final int SUBJECT = 1;
    private static final int ISSUER = 2;
    private static final int SIGNATURE = 3;
    private static final int SERIAL_NUMBER = 4;
    private static final int ATTR_CERT_VALIDITY_PERIOD = 5;
    private static final int ATTRIBUTES = 6;
    private static final int ISSUER_UNIQUE_ID = 7;
    private static final int EXTENSIONS = 8;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
            new Asn1FieldInfo(VERSION, Asn1Integer.class),
            new Asn1FieldInfo(SUBJECT, Subject.class),
            new Asn1FieldInfo(ISSUER, AttCertIssuer.class),
            new Asn1FieldInfo(SIGNATURE, AlgorithmIdentifier.class),
            new Asn1FieldInfo(SERIAL_NUMBER, CertificateSerialNumber.class),
            new Asn1FieldInfo(ATTR_CERT_VALIDITY_PERIOD, AttCertValidityPeriod.class),
            new Asn1FieldInfo(ATTRIBUTES, Attributes.class),
            new Asn1FieldInfo(ISSUER_UNIQUE_ID, Asn1BitString.class),
            new Asn1FieldInfo(EXTENSIONS, Extensions.class)
    };

    public AttributeCertificateInfoV1() {
        super(fieldInfos);
    }

    public int getVersion() {
        return getFieldAsInteger(VERSION);
    }

    public void setVersion(int version) {
        setFieldAsInt(VERSION, version);
    }

    public Subject getSubject() {
        return getFieldAs(SUBJECT, Subject.class);
    }

    public void setSubject(Subject subject) {
        setFieldAs(SUBJECT, subject);
    }

    public AttCertIssuer getIssuer() {
        return getFieldAs(ISSUER, AttCertIssuer.class);
    }

    public void setIssuer(AttCertIssuer attCertIssuer) {
        setFieldAs(ISSUER, attCertIssuer);
    }

    public AlgorithmIdentifier getSignature() {
        return getFieldAs(SIGNATURE, AlgorithmIdentifier.class);
    }

    public void setSignature(AlgorithmIdentifier signature) {
        setFieldAs(SIGNATURE, signature);
    }

    public CertificateSerialNumber getSerialNumber() {
        return getFieldAs(SERIAL_NUMBER, CertificateSerialNumber.class);
    }

    public void setSerialNumber(CertificateSerialNumber certificateSerialNumber) {
        setFieldAs(SERIAL_NUMBER, certificateSerialNumber);
    }

    public AttCertValidityPeriod getAttrCertValidityPeriod() {
        return getFieldAs(ATTR_CERT_VALIDITY_PERIOD, AttCertValidityPeriod.class);
    }

    public void setAttrCertValidityPeriod(AttCertValidityPeriod attrCertValidityPeriod) {
        setFieldAs(ATTR_CERT_VALIDITY_PERIOD, attrCertValidityPeriod);
    }

    public Attributes getAttributes() {
        return getFieldAs(ATTRIBUTES, Attributes.class);
    }

    public void setAttributes(Attributes attributes) {
        setFieldAs(ATTRIBUTES, attributes);
    }

    public byte[] getIssuerUniqueID() {
        return getFieldAs(ISSUER_UNIQUE_ID, Asn1BitString.class).getValue();
    }

    public void setIssuerUniqueId(byte[] issuerUniqueId) {
        setFieldAs(ISSUER_UNIQUE_ID, new Asn1BitString(issuerUniqueId));
    }

    public Extensions getExtensions() {
        return getFieldAs(EXTENSIONS, Extensions.class);
    }

    public void setExtensions(Extensions extensions) {
        setFieldAs(EXTENSIONS, extensions);
    }
}
