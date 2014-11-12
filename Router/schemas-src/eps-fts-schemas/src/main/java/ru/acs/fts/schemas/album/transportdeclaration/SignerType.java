
package ru.acs.fts.schemas.album.transportdeclaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Подпись лица, заявляющего сведения
 */
public class SignerType extends PersonSignatureType
{
    private String representativeName;
    private CustomsRepresCertificateType sertificate;
    private DocumentBaseType serviceContract;

    /** 
     * Get the 'RepresentativeName' element value. Наименование таможенного представителя
     * 
     * @return value
     */
    public String getRepresentativeName() {
        return representativeName;
    }

    /** 
     * Set the 'RepresentativeName' element value. Наименование таможенного представителя
     * 
     * @param representativeName
     */
    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    /** 
     * Get the 'Sertificate' element value. Свидетельство о включении лица в реестр таможенных представителей
     * 
     * @return value
     */
    public CustomsRepresCertificateType getSertificate() {
        return sertificate;
    }

    /** 
     * Set the 'Sertificate' element value. Свидетельство о включении лица в реестр таможенных представителей
     * 
     * @param sertificate
     */
    public void setSertificate(CustomsRepresCertificateType sertificate) {
        this.sertificate = sertificate;
    }

    /** 
     * Get the 'ServiceContract' element value. Договор на оказание услуг по совершению таможенных операций в отношении временно ввозимых (вывозимых) ТСМП
     * 
     * @return value
     */
    public DocumentBaseType getServiceContract() {
        return serviceContract;
    }

    /** 
     * Set the 'ServiceContract' element value. Договор на оказание услуг по совершению таможенных операций в отношении временно ввозимых (вывозимых) ТСМП
     * 
     * @param serviceContract
     */
    public void setServiceContract(DocumentBaseType serviceContract) {
        this.serviceContract = serviceContract;
    }
}
