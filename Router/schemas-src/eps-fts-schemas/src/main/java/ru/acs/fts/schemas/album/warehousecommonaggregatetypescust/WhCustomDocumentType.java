
package ru.acs.fts.schemas.album.warehousecommonaggregatetypescust;

/** 
 * Комплексный тип для описания таможенного документа
 */
public class WhCustomDocumentType extends ArriveCustomsDocType
{
    private String vttCustomsCode;

    /** 
     * Get the 'VttCustomsCode' element value. Код таможни отправления (при прибытии) / назначения (при убытии)
     * 
     * @return value
     */
    public String getVttCustomsCode() {
        return vttCustomsCode;
    }

    /** 
     * Set the 'VttCustomsCode' element value. Код таможни отправления (при прибытии) / назначения (при убытии)
     * 
     * @param vttCustomsCode
     */
    public void setVttCustomsCode(String vttCustomsCode) {
        this.vttCustomsCode = vttCustomsCode;
    }
}
