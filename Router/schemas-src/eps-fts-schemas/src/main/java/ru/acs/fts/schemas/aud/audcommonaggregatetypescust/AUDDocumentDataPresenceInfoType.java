
package ru.acs.fts.schemas.aud.audcommonaggregatetypescust;

/** 
 * Признаки необходимости предоставления отдельных данных, связанных с документом.
 */
public class AUDDocumentDataPresenceInfoType
{
    private boolean bodyPresenceIndicator;
    private boolean signatureEvidencePresenceIndicator;

    /** 
     * Get the 'BodyPresenceIndicator' element value. Признак - требуется ли предоставить тело документа: 0 (false) - не требуется; 1 (true) - требуется.
     * 
     * @return value
     */
    public boolean isBodyPresenceIndicator() {
        return bodyPresenceIndicator;
    }

    /** 
     * Set the 'BodyPresenceIndicator' element value. Признак - требуется ли предоставить тело документа: 0 (false) - не требуется; 1 (true) - требуется.
     * 
     * @param bodyPresenceIndicator
     */
    public void setBodyPresenceIndicator(boolean bodyPresenceIndicator) {
        this.bodyPresenceIndicator = bodyPresenceIndicator;
    }

    /** 
     * Get the 'SignatureEvidencePresenceIndicator' element value. Признак - требуется ли предоставить доказательства подлинности ЭЦП на документ: 0 (false) - не требуется; 1 (true) - требуется.
     * 
     * @return value
     */
    public boolean isSignatureEvidencePresenceIndicator() {
        return signatureEvidencePresenceIndicator;
    }

    /** 
     * Set the 'SignatureEvidencePresenceIndicator' element value. Признак - требуется ли предоставить доказательства подлинности ЭЦП на документ: 0 (false) - не требуется; 1 (true) - требуется.
     * 
     * @param signatureEvidencePresenceIndicator
     */
    public void setSignatureEvidencePresenceIndicator(
            boolean signatureEvidencePresenceIndicator) {
        this.signatureEvidencePresenceIndicator = signatureEvidencePresenceIndicator;
    }
}
