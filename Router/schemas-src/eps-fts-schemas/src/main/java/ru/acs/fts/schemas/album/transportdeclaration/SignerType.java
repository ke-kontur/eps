
package ru.acs.fts.schemas.album.transportdeclaration;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * ������� ����, ����������� ��������
 */
public class SignerType extends PersonSignatureType
{
    private String representativeName;
    private CustomsRepresCertificateType sertificate;
    private DocumentBaseType serviceContract;

    /** 
     * Get the 'RepresentativeName' element value. ������������ ����������� �������������
     * 
     * @return value
     */
    public String getRepresentativeName() {
        return representativeName;
    }

    /** 
     * Set the 'RepresentativeName' element value. ������������ ����������� �������������
     * 
     * @param representativeName
     */
    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    /** 
     * Get the 'Sertificate' element value. ������������� � ��������� ���� � ������ ���������� ��������������
     * 
     * @return value
     */
    public CustomsRepresCertificateType getSertificate() {
        return sertificate;
    }

    /** 
     * Set the 'Sertificate' element value. ������������� � ��������� ���� � ������ ���������� ��������������
     * 
     * @param sertificate
     */
    public void setSertificate(CustomsRepresCertificateType sertificate) {
        this.sertificate = sertificate;
    }

    /** 
     * Get the 'ServiceContract' element value. ������� �� �������� ����� �� ���������� ���������� �������� � ��������� �������� �������� (���������) ����
     * 
     * @return value
     */
    public DocumentBaseType getServiceContract() {
        return serviceContract;
    }

    /** 
     * Set the 'ServiceContract' element value. ������� �� �������� ����� �� ���������� ���������� �������� � ��������� �������� �������� (���������) ����
     * 
     * @param serviceContract
     */
    public void setServiceContract(DocumentBaseType serviceContract) {
        this.serviceContract = serviceContract;
    }
}
