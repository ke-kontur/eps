
package ru.acs.fts.schemas.album;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о документах
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="urn:customs.ru:CommonAggregateTypes:5.4.0" xmlns:ns1="urn:customs.ru:Information:IDKDocuments:IDKCommonAggregateTypesCust:5.4.0" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IDKDocumentsType">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns1:IDKTIRInfoType" name="TIR_Carnet" minOccurs="0"/>
 *     &lt;xs:element type="ns:DocumentBaseType" name="TiketNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IDKDocumentsType
{
    private IDKTIRInfoType TIRCarnet;
    private DocumentBaseType tiketNumber;

    /** 
     * Get the 'TIR_Carnet' element value. Номер Книжки МДП
     * 
     * @return value
     */
    public IDKTIRInfoType getTIRCarnet() {
        return TIRCarnet;
    }

    /** 
     * Set the 'TIR_Carnet' element value. Номер Книжки МДП
     * 
     * @param TIRCarnet
     */
    public void setTIRCarnet(IDKTIRInfoType TIRCarnet) {
        this.TIRCarnet = TIRCarnet;
    }

    /** 
     * Get the 'TiketNumber' element value. Талон на въезд
     * 
     * @return value
     */
    public DocumentBaseType getTiketNumber() {
        return tiketNumber;
    }

    /** 
     * Set the 'TiketNumber' element value. Талон на въезд
     * 
     * @param tiketNumber
     */
    public void setTiketNumber(DocumentBaseType tiketNumber) {
        this.tiketNumber = tiketNumber;
    }
}
