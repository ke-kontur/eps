
package ru.acs.fts.schemas.album.ruesadcommonaggregatetypescust;

/** 
 * Количество поставленной электроэнергии. Распоряжение ГТК РФ 350-р от 23.05.2002г.
 */
public class ESADElectricalEnergyQuantityType
{
    private String tariffZoneName;
    private String textID;
    private String description;
    private String qualifierCode;
    private String qualifierName;
    private String transferEnergyQuantity;

    /** 
     * Get the 'TariffZoneName' element value. Наименование тарифной зоны. Может быть не заполнено, если внешнеторговым договором (контрактом) для всех тарифных зон установлена одинаковая цена электроэнергии.
     * 
     * @return value
     */
    public String getTariffZoneName() {
        return tariffZoneName;
    }

    /** 
     * Set the 'TariffZoneName' element value. Наименование тарифной зоны. Может быть не заполнено, если внешнеторговым договором (контрактом) для всех тарифных зон установлена одинаковая цена электроэнергии.
     * 
     * @param tariffZoneName
     */
    public void setTariffZoneName(String tariffZoneName) {
        this.tariffZoneName = tariffZoneName;
    }

    /** 
     * Get the 'TextID' element value. Идентификатор текста (201-принято, 202-отдано, 203-прочее)
     * 
     * @return value
     */
    public String getTextID() {
        return textID;
    }

    /** 
     * Set the 'TextID' element value. Идентификатор текста (201-принято, 202-отдано, 203-прочее)
     * 
     * @param textID
     */
    public void setTextID(String textID) {
        this.textID = textID;
    }

    /** 
     * Get the 'Description' element value. ПРИНЯТО/ОТДАНО/ИНОЙ ТЕКСТ
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'Description' element value. ПРИНЯТО/ОТДАНО/ИНОЙ ТЕКСТ
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'QualifierCode' element value. Код единицы измерения.
     * 
     * @return value
     */
    public String getQualifierCode() {
        return qualifierCode;
    }

    /** 
     * Set the 'QualifierCode' element value. Код единицы измерения.
     * 
     * @param qualifierCode
     */
    public void setQualifierCode(String qualifierCode) {
        this.qualifierCode = qualifierCode;
    }

    /** 
     * Get the 'QualifierName' element value. Краткое наименование единицы измерения.
     * 
     * @return value
     */
    public String getQualifierName() {
        return qualifierName;
    }

    /** 
     * Set the 'QualifierName' element value. Краткое наименование единицы измерения.
     * 
     * @param qualifierName
     */
    public void setQualifierName(String qualifierName) {
        this.qualifierName = qualifierName;
    }

    /** 
     * Get the 'TransferEnergyQuantity' element value. Количество (Сумма перетоков электроэнергии для тарифной зоны)
     * 
     * @return value
     */
    public String getTransferEnergyQuantity() {
        return transferEnergyQuantity;
    }

    /** 
     * Set the 'TransferEnergyQuantity' element value. Количество (Сумма перетоков электроэнергии для тарифной зоны)
     * 
     * @param transferEnergyQuantity
     */
    public void setTransferEnergyQuantity(String transferEnergyQuantity) {
        this.transferEnergyQuantity = transferEnergyQuantity;
    }
}
