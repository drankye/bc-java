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
package org.apache.kerby.x509;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface X509AttributeIdentifiers
{
    /**
     * @deprecated use id_at_role
     */
    static final ASN1ObjectIdentifier RoleSyntax = new ASN1ObjectIdentifier("2.5.4.72");

    static final ASN1ObjectIdentifier id_pe_ac_auditIdentity = X509ObjectIdentifiers.id_pe.branch("4");
    static final ASN1ObjectIdentifier id_pe_aaControls       = X509ObjectIdentifiers.id_pe.branch("6");
    static final ASN1ObjectIdentifier id_pe_ac_proxying      = X509ObjectIdentifiers.id_pe.branch("10");

    static final ASN1ObjectIdentifier id_ce_targetInformation= X509ObjectIdentifiers.id_ce.branch("55");

    static final ASN1ObjectIdentifier id_aca = X509ObjectIdentifiers.id_pkix.branch("10");

    static final ASN1ObjectIdentifier id_aca_authenticationInfo    = id_aca.branch("1");
    static final ASN1ObjectIdentifier id_aca_accessIdentity        = id_aca.branch("2");
    static final ASN1ObjectIdentifier id_aca_chargingIdentity      = id_aca.branch("3");
    static final ASN1ObjectIdentifier id_aca_group                 = id_aca.branch("4");
    // { id-aca 5 } is reserved
    static final ASN1ObjectIdentifier id_aca_encAttrs              = id_aca.branch("6");

    static final ASN1ObjectIdentifier id_at_role = new ASN1ObjectIdentifier("2.5.4.72");
    static final ASN1ObjectIdentifier id_at_clearance = new ASN1ObjectIdentifier("2.5.1.5.55");
}
