
package ru.acs.fts.schemas.album.residentapplication;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.PersonSignatureType;

/** 
 * Форма №1. Сведения о товарах, предполагаемых к ввозу на территорию ОЭЗ в соответствии с таможенным режимом свободной таможенной зоны, для проведения в отношении них операций, не связанных с переработкой товаров и изготовлением продуктов их переработки. 
 */
public class FormOneType
{
    private PersonSignatureType residentPersonSignature;
    private PersonSignatureType econZonePersonSignature;
    private List<OperationType> operationList = new ArrayList<OperationType>();

    /** 
     * Get the 'ResidentPersonSignature' element value. ФИО и подпись уполномоченного лица организации - резидента ОЭЗ
     * 
     * @return value
     */
    public PersonSignatureType getResidentPersonSignature() {
        return residentPersonSignature;
    }

    /** 
     * Set the 'ResidentPersonSignature' element value. ФИО и подпись уполномоченного лица организации - резидента ОЭЗ
     * 
     * @param residentPersonSignature
     */
    public void setResidentPersonSignature(
            PersonSignatureType residentPersonSignature) {
        this.residentPersonSignature = residentPersonSignature;
    }

    /** 
     * Get the 'EconZonePersonSignature' element value. ФИО и подпись уполномоченного лица органа управления ОЭЗ 
     * 
     * @return value
     */
    public PersonSignatureType getEconZonePersonSignature() {
        return econZonePersonSignature;
    }

    /** 
     * Set the 'EconZonePersonSignature' element value. ФИО и подпись уполномоченного лица органа управления ОЭЗ 
     * 
     * @param econZonePersonSignature
     */
    public void setEconZonePersonSignature(
            PersonSignatureType econZonePersonSignature) {
        this.econZonePersonSignature = econZonePersonSignature;
    }

    /** 
     * Get the list of 'Operation' element items. Наименование операции в соответствии с условиями соглашения 
     * 
     * @return list
     */
    public List<OperationType> getOperationList() {
        return operationList;
    }

    /** 
     * Set the list of 'Operation' element items. Наименование операции в соответствии с условиями соглашения 
     * 
     * @param list
     */
    public void setOperationList(List<OperationType> list) {
        operationList = list;
    }
}
