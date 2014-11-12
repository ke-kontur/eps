
package ru.acs.fts.schemas.album.ownershiptransferdoc;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Информация о документах, подтверждающих право собственности
 */
public class OwnershipDocInfoType extends DocumentBaseType
{
    private List<String> objectNameList = new ArrayList<String>();
    private LocalDate contractTerms;
    private String ownershipKind;
    private OrganizationBaseType licensee;
    private OrganizationBaseType licensor;

    /** 
     * Get the list of 'ObjectName' element items. Наименование объекта интеллектуальной собственности
     * 
     * @return list
     */
    public List<String> getObjectNameList() {
        return objectNameList;
    }

    /** 
     * Set the list of 'ObjectName' element items. Наименование объекта интеллектуальной собственности
     * 
     * @param list
     */
    public void setObjectNameList(List<String> list) {
        objectNameList = list;
    }

    /** 
     * Get the 'ContractTerms' element value. Срок действия договора
     * 
     * @return value
     */
    public LocalDate getContractTerms() {
        return contractTerms;
    }

    /** 
     * Set the 'ContractTerms' element value. Срок действия договора
     * 
     * @param contractTerms
     */
    public void setContractTerms(LocalDate contractTerms) {
        this.contractTerms = contractTerms;
    }

    /** 
     * Get the 'OwnershipKind' element value. Вид права: 0 - неисключительное, 1- исключительное
     * 
     * @return value
     */
    public String getOwnershipKind() {
        return ownershipKind;
    }

    /** 
     * Set the 'OwnershipKind' element value. Вид права: 0 - неисключительное, 1- исключительное
     * 
     * @param ownershipKind
     */
    public void setOwnershipKind(String ownershipKind) {
        this.ownershipKind = ownershipKind;
    }

    /** 
     * Get the 'Licensee' element value. Лицензиат
     * 
     * @return value
     */
    public OrganizationBaseType getLicensee() {
        return licensee;
    }

    /** 
     * Set the 'Licensee' element value. Лицензиат
     * 
     * @param licensee
     */
    public void setLicensee(OrganizationBaseType licensee) {
        this.licensee = licensee;
    }

    /** 
     * Get the 'Licensor' element value. Лицензиар
     * 
     * @return value
     */
    public OrganizationBaseType getLicensor() {
        return licensor;
    }

    /** 
     * Set the 'Licensor' element value. Лицензиар
     * 
     * @param licensor
     */
    public void setLicensor(OrganizationBaseType licensor) {
        this.licensor = licensor;
    }
}
