
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * ����������� ��� ��� ���������������� ������ ������ ��1/��2/��3 �� ������� ����������� �� ����������� ������
 */
public class WHDocumentRegisterNumberType extends GTDIDType
{
    private int choiceSelect = -1;
    private static final int CERTIFICATE_NUMBER_CHOICE = 0;
    private static final int OTHER_WH_PLACE_KIND_CHOICE = 1;
    private String certificateNumber;
    private String otherWHPlaceKind;

    private void setChoiceSelect(int choice) {
        if (choiceSelect == -1) {
            choiceSelect = choice;
        } else if (choiceSelect != choice) {
            throw new IllegalStateException(
                    "Need to call clearChoiceSelect() before changing existing choice");
        }
    }

    /** 
     * Clear the choice selection.
     */
    public void clearChoiceSelect() {
        choiceSelect = -1;
    }

    /** 
     * Check if CertificateNumber is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifCertificateNumber() {
        return choiceSelect == CERTIFICATE_NUMBER_CHOICE;
    }

    /** 
     * Get the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ ���������� ���������� ��������
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. ����� ������������� � ��������� � ������ ���������� ���������� ��������
     * 
     * @param certificateNumber
     */
    public void setCertificateNumber(String certificateNumber) {
        setChoiceSelect(CERTIFICATE_NUMBER_CHOICE);
        this.certificateNumber = certificateNumber;
    }

    /** 
     * Check if OtherWHPlaceKind is current selection for choice.
     * 
     * @return <code>true</code> if selection, <code>false</code> if not
     */
    public boolean ifOtherWHPlaceKind() {
        return choiceSelect == OTHER_WH_PLACE_KIND_CHOICE;
    }

    /** 
     * Get the 'OtherWHPlaceKind' element value. �������� ������� ����� ���������� �������� � ������������ � ����������, ������������� ������� 34 �������
     * 
     * @return value
     */
    public String getOtherWHPlaceKind() {
        return otherWHPlaceKind;
    }

    /** 
     * Set the 'OtherWHPlaceKind' element value. �������� ������� ����� ���������� �������� � ������������ � ����������, ������������� ������� 34 �������
     * 
     * @param otherWHPlaceKind
     */
    public void setOtherWHPlaceKind(String otherWHPlaceKind) {
        setChoiceSelect(OTHER_WH_PLACE_KIND_CHOICE);
        this.otherWHPlaceKind = otherWHPlaceKind;
    }
}
