
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Перевозчик в книжке МДП
 */
public class TIRCarrierType extends OrganizationBaseType
{
    private String ITN;
    private IdentityCardType identityCard;
    private TIRSignatureType TIRSignature;
    private AddressType address;

    /** 
     * Get the 'ITN' element value. ИТН
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ИТН
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. Документ, удостоверяющий личность
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'TIRSignature' element value. Подпись держателя. Место и дата  проставления подписи.
     * 
     * @return value
     */
    public TIRSignatureType getTIRSignature() {
        return TIRSignature;
    }

    /** 
     * Set the 'TIRSignature' element value. Подпись держателя. Место и дата  проставления подписи.
     * 
     * @param TIRSignature
     */
    public void setTIRSignature(TIRSignatureType TIRSignature) {
        this.TIRSignature = TIRSignature;
    }

    /** 
     * Get the 'Address' element value. Адрес
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. Адрес
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
