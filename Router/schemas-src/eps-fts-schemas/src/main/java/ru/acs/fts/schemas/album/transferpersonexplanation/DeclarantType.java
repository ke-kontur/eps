
package ru.acs.fts.schemas.album.transferpersonexplanation;

import ru.acs.fts.schemas.album.commonaggregatetypescust.DocumentBaseType;
import ru.acs.fts.schemas.album.commonaggregatetypescust.OrganizationBaseType;

/** 
 * Декларант или иное лицо, имеющее отношение к перемещению товаров и транспортных средств через таможенную границу Российской Федерации
 */
public class DeclarantType extends OrganizationBaseType
{
    private DocumentBaseType declContract;

    /** 
     * Get the 'DeclContract' element value. Сведения о договоре декларанта (лица)
     * 
     * @return value
     */
    public DocumentBaseType getDeclContract() {
        return declContract;
    }

    /** 
     * Set the 'DeclContract' element value. Сведения о договоре декларанта (лица)
     * 
     * @param declContract
     */
    public void setDeclContract(DocumentBaseType declContract) {
        this.declContract = declContract;
    }
}
