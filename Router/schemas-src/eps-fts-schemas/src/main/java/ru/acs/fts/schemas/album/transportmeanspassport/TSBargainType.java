
package ru.acs.fts.schemas.album.transportmeanspassport;

import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonBaseType;
import ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust.TransportOwnerType;

/** 
 * �������� � ������� � ������������ ���������
 */
public class TSBargainType
{
    private LocalDate sellingDate;
    private String specialMark;
    private DocumentBaseType docPropertyRights;
    private TransportOwnerType newTransportOwner;
    private PersonBaseType prevOwnerSign;
    private PersonBaseType newOwnerSign;
    private GIBDDRegistrationType GIBDDRegistration;

    /** 
     * Get the 'SellingDate' element value. ���� �������
     * 
     * @return value
     */
    public LocalDate getSellingDate() {
        return sellingDate;
    }

    /** 
     * Set the 'SellingDate' element value. ���� �������
     * 
     * @param sellingDate
     */
    public void setSellingDate(LocalDate sellingDate) {
        this.sellingDate = sellingDate;
    }

    /** 
     * Get the 'SpecialMark' element value. ������ �������
     * 
     * @return value
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /** 
     * Set the 'SpecialMark' element value. ������ �������
     * 
     * @param specialMark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    /** 
     * Get the 'DocPropertyRights' element value. ��������� �� ����� �������������
     * 
     * @return value
     */
    public DocumentBaseType getDocPropertyRights() {
        return docPropertyRights;
    }

    /** 
     * Set the 'DocPropertyRights' element value. ��������� �� ����� �������������
     * 
     * @param docPropertyRights
     */
    public void setDocPropertyRights(DocumentBaseType docPropertyRights) {
        this.docPropertyRights = docPropertyRights;
    }

    /** 
     * Get the 'NewTransportOwner' element value. �������� � ����� ������������ ��
     * 
     * @return value
     */
    public TransportOwnerType getNewTransportOwner() {
        return newTransportOwner;
    }

    /** 
     * Set the 'NewTransportOwner' element value. �������� � ����� ������������ ��
     * 
     * @param newTransportOwner
     */
    public void setNewTransportOwner(TransportOwnerType newTransportOwner) {
        this.newTransportOwner = newTransportOwner;
    }

    /** 
     * Get the 'PrevOwnerSign' element value. ������� �������� ������������
     * 
     * @return value
     */
    public PersonBaseType getPrevOwnerSign() {
        return prevOwnerSign;
    }

    /** 
     * Set the 'PrevOwnerSign' element value. ������� �������� ������������
     * 
     * @param prevOwnerSign
     */
    public void setPrevOwnerSign(PersonBaseType prevOwnerSign) {
        this.prevOwnerSign = prevOwnerSign;
    }

    /** 
     * Get the 'NewOwnerSign' element value. ������� ���������� ������������
     * 
     * @return value
     */
    public PersonBaseType getNewOwnerSign() {
        return newOwnerSign;
    }

    /** 
     * Set the 'NewOwnerSign' element value. ������� ���������� ������������
     * 
     * @param newOwnerSign
     */
    public void setNewOwnerSign(PersonBaseType newOwnerSign) {
        this.newOwnerSign = newOwnerSign;
    }

    /** 
     * Get the 'GIBDDRegistration' element value. �������� �� ����� �� � �����
     * 
     * @return value
     */
    public GIBDDRegistrationType getGIBDDRegistration() {
        return GIBDDRegistration;
    }

    /** 
     * Set the 'GIBDDRegistration' element value. �������� �� ����� �� � �����
     * 
     * @param GIBDDRegistration
     */
    public void setGIBDDRegistration(GIBDDRegistrationType GIBDDRegistration) {
        this.GIBDDRegistration = GIBDDRegistration;
    }
}
