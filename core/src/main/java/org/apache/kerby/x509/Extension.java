package org.apache.kerby.x509;

import org.apache.kerby.asn1.type.Asn1Any;
import org.apache.kerby.asn1.type.Asn1FieldInfo;
import org.apache.kerby.asn1.type.Asn1ObjectIdentifier;
import org.apache.kerby.asn1.type.Asn1SequenceType;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/**
 * An object for the elements in the X.509 V3 extension block.
 */
public class Extension extends Asn1SequenceType {
    /**
     * Subject Directory Attributes
     */
    public static final String subjectDirectoryAttributes = "2.5.29.9";
    
    /**
     * Subject Key Identifier 
     */
    public static final String subjectKeyIdentifier = "2.5.29.14";

    /**
     * Key Usage 
     */
    public static final String keyUsage = "2.5.29.15";

    /**
     * Private Key Usage Period 
     */
    public static final String privateKeyUsagePeriod = "2.5.29.16";

    /**
     * Subject Alternative Name 
     */
    public static final String subjectAlternativeName = "2.5.29.17";

    /**
     * Issuer Alternative Name 
     */
    public static final String issuerAlternativeName = "2.5.29.18";

    /**
     * Basic Constraints 
     */
    public static final String basicConstraints = "2.5.29.19";

    /**
     * CRL Number 
     */
    public static final String cRLNumber = "2.5.29.20";

    /**
     * Reason code 
     */
    public static final String reasonCode = "2.5.29.21";

    /**
     * Hold Instruction Code 
     */
    public static final String instructionCode = "2.5.29.23";

    /**
     * Invalidity Date 
     */
    public static final String invalidityDate = "2.5.29.24";

    /**
     * Delta CRL indicator 
     */
    public static final String deltaCRLIndicator = "2.5.29.27";

    /**
     * Issuing Distribution Point 
     */
    public static final String issuingDistributionPoint = "2.5.29.28";

    /**
     * Certificate Issuer 
     */
    public static final String certificateIssuer = "2.5.29.29";

    /**
     * Name Constraints 
     */
    public static final String nameConstraints = "2.5.29.30";

    /**
     * CRL Distribution Points 
     */
    public static final String cRLDistributionPoints = "2.5.29.31";

    /**
     * Certificate Policies 
     */
    public static final String certificatePolicies = "2.5.29.32";

    /**
     * Policy Mappings 
     */
    public static final String policyMappings = "2.5.29.33";

    /**
     * Authority Key Identifier 
     */
    public static final String authorityKeyIdentifier = "2.5.29.35";

    /**
     * Policy Constraints 
     */
    public static final String policyConstraints = "2.5.29.36";

    /**
     * Extended Key Usage 
     */
    public static final String extendedKeyUsage = "2.5.29.37";

    /**
     * Freshest CRL
     */
    public static final String freshestCRL = "2.5.29.46";
     
    /**
     * Inhibit Any Policy
     */
    public static final String inhibitAnyPolicy = "2.5.29.54";

    /**
     * Authority Info Access
     */
    public static final String authorityInfoAccess = "1.3.6.1.5.5.7.1.1";

    /**
     * Subject Info Access
     */
    public static final String subjectInfoAccess = "1.3.6.1.5.5.7.1.11";
    
    /**
     * Logo Type
     */
    public static final String logoType = "1.3.6.1.5.5.7.1.12";

    /**
     * BiometricInfo
     */
    public static final String biometricInfo = "1.3.6.1.5.5.7.1.2";
    
    /**
     * QCStatements
     */
    public static final String qCStatements = "1.3.6.1.5.5.7.1.3";

    /**
     * Audit identity extension in attribute certificates.
     */
    public static final String auditIdentity = "1.3.6.1.5.5.7.1.4";
    
    /**
     * NoRevAvail extension in attribute certificates.
     */
    public static final String noRevAvail = "2.5.29.56";

    /**
     * TargetInformation extension in attribute certificates.
     */
    public static final String targetInformation = "2.5.29.55";

    private static final int ALGORITHM = 0;
    private static final int PARAMETERS = 1;

    static Asn1FieldInfo[] fieldInfos = new Asn1FieldInfo[] {
        new Asn1FieldInfo(ALGORITHM, -1, Asn1ObjectIdentifier.class),
        new Asn1FieldInfo(PARAMETERS, -1, Asn1Any.class)
    };

    public Extension() {
        super(fieldInfos);
    }

    public ASN1ObjectIdentifier getExtnId() {
        return null;
    }

    public boolean isCritical() {
        return false;
    }

    public byte[] getExtnValue() {
        return null;
    }
}
