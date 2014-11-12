
package ru.acs.fts.schemas.album.inqinotreatment;

import java.util.ArrayList;
import java.util.List;
import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;

/** 
 * Сведения о документах,  подтверждающих совершение операций по переработке
 */
public class DocumentIDInfoType extends DocumentBaseType
{
    private List<String> confirmInfoList = new ArrayList<String>();

    /** 
     * Get the list of 'ConfirmInfo' element items. Сведения из содержания документа свидетельствующие о том, что операциям по переработке были подвергнуты товары, вывезенные с таможенной территории Российской Федерации в соответствии с таможенным режимом переработки вне таможенной территории.
     * 
     * @return list
     */
    public List<String> getConfirmInfoList() {
        return confirmInfoList;
    }

    /** 
     * Set the list of 'ConfirmInfo' element items. Сведения из содержания документа свидетельствующие о том, что операциям по переработке были подвергнуты товары, вывезенные с таможенной территории Российской Федерации в соответствии с таможенным режимом переработки вне таможенной территории.
     * 
     * @param list
     */
    public void setConfirmInfoList(List<String> list) {
        confirmInfoList = list;
    }
}
