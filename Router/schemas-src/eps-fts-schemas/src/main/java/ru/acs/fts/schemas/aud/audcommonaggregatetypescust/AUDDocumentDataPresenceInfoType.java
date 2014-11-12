
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * ѕризнаки необходимости предоставлени€ отдельных данных, св€занных с документом.
 */
public class AUDDocumentDataPresenceInfoType
{
    private boolean bodyPresenceIndicator;
    private boolean signatureEvidencePresenceIndicator;

    /** 
     * Get the 'BodyPresenceIndicator' element value. ѕризнак - требуетс€ ли предоставить тело документа: 0 (false) - не требуетс€; 1 (true) - требуетс€.
     * 
     * @return value
     */
    public boolean isBodyPresenceIndicator() {
        return bodyPresenceIndicator;
    }

    /** 
     * Set the 'BodyPresenceIndicator' element value. ѕризнак - требуетс€ ли предоставить тело документа: 0 (false) - не требуетс€; 1 (true) - требуетс€.
     * 
     * @param bodyPresenceIndicator
     */
    public void setBodyPresenceIndicator(boolean bodyPresenceIndicator) {
        this.bodyPresenceIndicator = bodyPresenceIndicator;
    }

    /** 
     * Get the 'SignatureEvidencePresenceIndicator' element value. ѕризнак - требуетс€ ли предоставить доказательства подлинности Ё÷ѕ на документ: 0 (false) - не требуетс€; 1 (true) - требуетс€.
     * 
     * @return value
     */
    public boolean isSignatureEvidencePresenceIndicator() {
        return signatureEvidencePresenceIndicator;
    }

    /** 
     * Set the 'SignatureEvidencePresenceIndicator' element value. ѕризнак - требуетс€ ли предоставить доказательства подлинности Ё÷ѕ на документ: 0 (false) - не требуетс€; 1 (true) - требуетс€.
     * 
     * @param signatureEvidencePresenceIndicator
     */
    public void setSignatureEvidencePresenceIndicator(
            boolean signatureEvidencePresenceIndicator) {
        this.signatureEvidencePresenceIndicator = signatureEvidencePresenceIndicator;
    }
}
