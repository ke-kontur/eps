
package ru.acs.fts.schemas.album.tir_carnet;

import ru.acs.fts.schemas.album.commonaggregatetypescust.AddressType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.IdentityCardType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * ���������� � ������ ���
 */
public class TIRCarrierType extends OrganizationBaseType
{
    private String ITN;
    private IdentityCardType identityCard;
    private TIRSignatureType TIRSignature;
    private AddressType address;

    /** 
     * Get the 'ITN' element value. ���
     * 
     * @return value
     */
    public String getITN() {
        return ITN;
    }

    /** 
     * Set the 'ITN' element value. ���
     * 
     * @param ITN
     */
    public void setITN(String ITN) {
        this.ITN = ITN;
    }

    /** 
     * Get the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @return value
     */
    public IdentityCardType getIdentityCard() {
        return identityCard;
    }

    /** 
     * Set the 'IdentityCard' element value. ��������, �������������� ��������
     * 
     * @param identityCard
     */
    public void setIdentityCard(IdentityCardType identityCard) {
        this.identityCard = identityCard;
    }

    /** 
     * Get the 'TIRSignature' element value. ������� ���������. ����� � ����  ������������ �������.
     * 
     * @return value
     */
    public TIRSignatureType getTIRSignature() {
        return TIRSignature;
    }

    /** 
     * Set the 'TIRSignature' element value. ������� ���������. ����� � ����  ������������ �������.
     * 
     * @param TIRSignature
     */
    public void setTIRSignature(TIRSignatureType TIRSignature) {
        this.TIRSignature = TIRSignature;
    }

    /** 
     * Get the 'Address' element value. �����
     * 
     * @return value
     */
    public AddressType getAddress() {
        return address;
    }

    /** 
     * Set the 'Address' element value. �����
     * 
     * @param address
     */
    public void setAddress(AddressType address) {
        this.address = address;
    }
}
