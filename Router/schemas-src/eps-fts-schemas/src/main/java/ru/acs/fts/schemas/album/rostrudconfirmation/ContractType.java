
package ru.acs.fts.schemas.album.rostrudconfirmation;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о контракте
 */
public class ContractType extends DocumentBaseType
{
    private List<DocumentBaseType> supplementaryContractList = new ArrayList<DocumentBaseType>();

    /** 
     * Get the list of 'SupplementaryContract' element items. Дополнение (спецификация) к контракту
     * 
     * @return list
     */
    public List<DocumentBaseType> getSupplementaryContractList() {
        return supplementaryContractList;
    }

    /** 
     * Set the list of 'SupplementaryContract' element items. Дополнение (спецификация) к контракту
     * 
     * @param list
     */
    public void setSupplementaryContractList(List<DocumentBaseType> list) {
        supplementaryContractList = list;
    }
}
