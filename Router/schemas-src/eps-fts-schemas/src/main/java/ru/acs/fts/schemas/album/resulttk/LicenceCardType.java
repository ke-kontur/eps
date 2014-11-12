
package ru.acs.fts.schemas.album.resulttk;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Данные карточки допуска/лицензионной карточки
 */
public class LicenceCardType
{
    private String passKind;
    private String number;
    private String controlStatusName;
    private String duration;
    private String licenceStatusName;
    private DocumentBaseType certificate;

    /** 
     * Get the 'PassKind' element value. Вид спецразрешения
     * 
     * @return value
     */
    public String getPassKind() {
        return passKind;
    }

    /** 
     * Set the 'PassKind' element value. Вид спецразрешения
     * 
     * @param passKind
     */
    public void setPassKind(String passKind) {
        this.passKind = passKind;
    }

    /** 
     * Get the 'Number' element value. Номер карточки допуска/лицензионной карточки
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'Number' element value. Номер карточки допуска/лицензионной карточки
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'ControlStatusName' element value. Статус проверки карточки допуска/лицензионной карточки (YES - Да; NO - Нет; NOTREQUIRED - Не требуется; NOTVERIFIED - Не проверялось)
     * 
     * @return value
     */
    public String getControlStatusName() {
        return controlStatusName;
    }

    /** 
     * Set the 'ControlStatusName' element value. Статус проверки карточки допуска/лицензионной карточки (YES - Да; NO - Нет; NOTREQUIRED - Не требуется; NOTVERIFIED - Не проверялось)
     * 
     * @param controlStatusName
     */
    public void setControlStatusName(String controlStatusName) {
        this.controlStatusName = controlStatusName;
    }

    /** 
     * Get the 'Duration' element value. Срок действия карточки допуска/лицензионной карточки
     * 
     * @return value
     */
    public String getDuration() {
        return duration;
    }

    /** 
     * Set the 'Duration' element value. Срок действия карточки допуска/лицензионной карточки
     * 
     * @param duration
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /** 
     * Get the 'LicenceStatusName' element value. Статус карточки допуска/лицензионной карточки (Истек срок действия / Приостановлено / Аннулировано)
     * 
     * @return value
     */
    public String getLicenceStatusName() {
        return licenceStatusName;
    }

    /** 
     * Set the 'LicenceStatusName' element value. Статус карточки допуска/лицензионной карточки (Истек срок действия / Приостановлено / Аннулировано)
     * 
     * @param licenceStatusName
     */
    public void setLicenceStatusName(String licenceStatusName) {
        this.licenceStatusName = licenceStatusName;
    }

    /** 
     * Get the 'Certificate' element value. Номер сертификата на карточку допуска/лицензионную карточки
     * 
     * @return value
     */
    public DocumentBaseType getCertificate() {
        return certificate;
    }

    /** 
     * Set the 'Certificate' element value. Номер сертификата на карточку допуска/лицензионную карточки
     * 
     * @param certificate
     */
    public void setCertificate(DocumentBaseType certificate) {
        this.certificate = certificate;
    }
}
