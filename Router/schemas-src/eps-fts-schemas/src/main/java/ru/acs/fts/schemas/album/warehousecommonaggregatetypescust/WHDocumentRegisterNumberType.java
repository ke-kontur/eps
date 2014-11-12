
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

import ru.acs.fts.schemas.album.commonaggregatetypescust.GTDIDType;

/** 
 * Комплексный тип для регистрационного номера отчета ДО1/ДО2/ДО3 по журналу регистрации ДО таможенного органа
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
     * Get the 'CertificateNumber' element value. Номер свидетельства о включении в реестр владельцев временного хранения
     * 
     * @return value
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /** 
     * Set the 'CertificateNumber' element value. Номер свидетельства о включении в реестр владельцев временного хранения
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
     * Get the 'OtherWHPlaceKind' element value. Цифровой признак места временного хранения в соответствии с нумерацией, установленной пунктом 34 Порядка
     * 
     * @return value
     */
    public String getOtherWHPlaceKind() {
        return otherWHPlaceKind;
    }

    /** 
     * Set the 'OtherWHPlaceKind' element value. Цифровой признак места временного хранения в соответствии с нумерацией, установленной пунктом 34 Порядка
     * 
     * @param otherWHPlaceKind
     */
    public void setOtherWHPlaceKind(String otherWHPlaceKind) {
        setChoiceSelect(OTHER_WH_PLACE_KIND_CHOICE);
        this.otherWHPlaceKind = otherWHPlaceKind;
    }
}
