
package ru.acs.fts.schemas.album.eps_inforequest;

/** 
 * Запрос на передачу сообщения
 */
public class EnvRequestType
{
    private String envelopeID;

    /** 
     * Get the 'EnvelopeID' element value. Идентификатор сообщения
     * 
     * @return value
     */
    public String getEnvelopeID() {
        return envelopeID;
    }

    /** 
     * Set the 'EnvelopeID' element value. Идентификатор сообщения
     * 
     * @param envelopeID
     */
    public void setEnvelopeID(String envelopeID) {
        this.envelopeID = envelopeID;
    }
}
